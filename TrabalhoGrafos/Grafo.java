import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grafo {

    private ArrayList<Vertice> cidades; //vertice
    private ArrayList<Aresta> conexoes; //aresta

    public Grafo(){
        this.cidades = new ArrayList<>();
        this.conexoes = new ArrayList<>();
    }

    public void infoCidades(){
        System.out.println("\n"+"///////////Informações das Cidades///////////");
        ArrayList<String> cityNames = new ArrayList<>();
        for(Vertice c : cidades){
        cityNames.add(c.getNomeCidade());
        }
        Collections.sort(cityNames);

        for (String nomeCidade : cityNames) {
            System.out.println("-> " + nomeCidade);
        }
        System.out.println("\n"+"////////////////////////////////////////////");
    }
    
    public void infoConexoes(){
        System.out.println("\n"+"///////////Informações das Conexões///////////");
        for(Aresta a : conexoes){
        System.out.println(a.getCidade1().getNomeCidade()+
        " <-> "
        +a.getCidade2().getNomeCidade()+" : "+a.getDistancia()+" km.");
        }
        System.out.println("\n"+"////////////////////////////////////////////");
    }

    public void cadastraCidade(Scanner tec){
        System.out.println("\n"+"///////////Cadastramento de Cidades///////////"+"\n");
        System.out.println("Digite um nome para essa cidade: ");
        String nomeCidade = tec.nextLine();

        for(Vertice name : cidades){
            if(name.getNomeCidade().equalsIgnoreCase(nomeCidade)){
                System.out.println("\n"+"Essa cidade já está cadastrada!");
                return;
            }
        }
            Vertice bibi = new Vertice(nomeCidade);
            cidades.add(bibi);
            System.out.println("\n"+"Cidade cadastrada com sucesso!");
        
    }

    public void cadastraConexao(Scanner tec){
        System.out.println("\n"+"///////////Cadastramento de Conexões///////////"+"\n");
        System.out.println("Digite o nome da primeira cidade: ");
        String nomeCidade1 = tec.nextLine().toLowerCase();

        System.out.println("Digite o nome da segunda cidade: ");
        String nomeCidade2 = tec.nextLine().toLowerCase();

        System.out.print("Digite a distância entre as cidades: ");
        int distancia = tec.nextInt();

        Vertice cidade1 = null;
        Vertice cidade2 = null;

        for(Vertice name : cidades){
            if(name.getNomeCidade().equalsIgnoreCase(nomeCidade1) ){
                
                cidade1 = name;
            }
            if(name.getNomeCidade().equals(nomeCidade2)){

                cidade2 = name;
            }else {
            System.out.println("\n"+"Alguma das cidades digitadas não constam no cadastro! A cadastre e depois volte à essa opção.");
        }
    }
        Aresta conexaoNova = new Aresta(cidade1,cidade2,distancia);
        conexoes.add(conexaoNova);
            
        System.out.println("\n"+"Conexão cadastrada com sucesso!");
    }
}
    
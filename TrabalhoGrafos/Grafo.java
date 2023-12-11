import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        
        ArrayList<String> nomeCidades = new ArrayList<>();
        
        for(Vertice c : cidades){
        nomeCidades.add(c.getNomeCidade());
        }
        
        Collections.sort(nomeCidades);

        for (String nomes : nomeCidades) {
            System.out.println("--> " + nomes);
        }
        System.out.println("\n"+"////////////////////////////////////////////");
    }
    
    public void infoConexoes(){
        System.out.println("\n"+"///////////Informações das Conexões///////////");
        for(Aresta a : conexoes){
        System.out.println(a.getCidade1().getNomeCidade()+
        " <-> "
        +a.getCidade2().getNomeCidade()+" : "+a.getDistancia()+" km de distância");
        }
        System.out.println("\n"+"////////////////////////////////////////////");
    }

    public void cadastraCidade(Scanner tec){
        tec.nextLine(); //buffer
        System.out.println("\n"+"///////////Cadastramento de Cidades///////////"+"\n");
        System.out.println("Digite um nome para essa cidade: ");
        String nomeCidade = tec.nextLine();

        for(Vertice name : cidades){
            if(name.getNomeCidade().equalsIgnoreCase(nomeCidade)){
                System.out.println("\n"+"Essa cidade já está cadastrada!");
                return;
            }
        }
            Vertice novaCidade = new Vertice(nomeCidade);
            cidades.add(novaCidade);
            System.out.println("\n"+"Cidade cadastrada com sucesso!");
        
    }

    public void cadastraConexoes(Scanner tec){
        tec.nextLine(); //buffer
        System.out.println("\n"+"///////////Cadastramento de Conexões///////////"+"\n");
        System.out.println("Digite o nome da primeira cidade: ");
        String nomeCidade1 = tec.nextLine();
        System.out.println("Digite o nome da segunda cidade: ");
        String nomeCidade2 = tec.nextLine();
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
            }
        }

        if(cidade1 == null|| cidade2 == null){
            System.out.println("\n"+"Essas cidades não estão no sistema, cadastre-as primeiro!");
            return;
        }

        Aresta conexaoNova = new Aresta(cidade1,cidade2,distancia);
        conexoes.add(conexaoNova);
            
        System.out.println("\n"+"Conexão cadastrada com sucesso!");
    }

    public void infoCidadesVizinhas(Scanner tec){
        tec.nextLine();
        System.out.println("--------Mostrar Cidades Próximas--------");
        System.out.print("Digite o nome da cidade: ");
        String cidade = tec.nextLine();

        Vertice origem = null;

        for (Vertice vertice : cidades) {
            if (vertice.getNomeCidade().equalsIgnoreCase(cidade)) {
                origem = vertice;
                break;
            }
        }
        
        if (origem == null) {
            System.out.println("\n"+"Cidade não encontrada !");
            return;
        }

        ArrayList<Aresta> conexoesVizinhas = new ArrayList<>();
        for (Aresta conexao : conexoes) {
            if (conexao.getCidade1().equals(origem) || conexao.getCidade2().equals(origem)) {
                conexoesVizinhas.add(conexao);
            }
        }

        if (conexoesVizinhas.isEmpty()) {
            System.out.println("\n"+"Nenhuma cidade vizinha encontrada.");
            return;
        }

    ordenarConexoesPorDistancia(conexoesVizinhas);

    System.out.println("\n"+"Cidades vizinhas ordenadas por menor distância:");
        for (Aresta conexao : conexoesVizinhas) {
            Vertice vizinho = conexao.getCidade1().equals(origem) ? conexao.getCidade2() : conexao.getCidade1();
            int distancia = conexao.getDistancia();
            System.out.println("- " + vizinho.getNomeCidade() + ": " + distancia + " km de distância");
        }
    }

    private void ordenarConexoesPorDistancia(ArrayList<Aresta> conexoes) {
        conexoes.sort(Comparator.comparingInt(Aresta::getDistancia));
    }


    
}
    
import java.util.ArrayList;
import java.util.Scanner;

public class Grafo {

    private ArrayList<Vertice> cidades; //vertice
    private ArrayList<Aresta> conexoes; //aresta

    public void infoCidades(ArrayList<Vertice> cidades){
        System.out.println("\n"+"///////////Informações das Cidades///////////");
        for(Vertice c : cidades){
        System.out.println(c.getNomeCidade());
        }
        System.out.println("\n"+"////////////////////////////////////////////");
    }
    
    public void infoConexoes(ArrayList<Aresta> conexoes){
        System.out.println("\n"+"///////////Informações das Conexões///////////");
        for(Aresta a : conexoes){
        System.out.println(a.getCidade1().getNomeCidade()+" <-> "+a.getCidade2().getNomeCidade()+" : "+a.getDistancia()+" km.");
        }
        System.out.println("\n"+"////////////////////////////////////////////");
    }

    public void cadastraCidade(ArrayList<Vertice> cidades, Scanner tec){
        System.out.println("\n"+"///////////Cadastramento de Cidades///////////"+"\n");
        System.out.println("Digite um nome para essa cidade: ");
        String nomeCidade = tec.nextLine().toLowerCase();

        for(Vertice name : cidades)
        if(name.getNomeCidade().toLowerCase() == nomeCidade){
            System.out.println("\n"+"Essa cidade já está cadastrada!");
        }else{
            Vertice bibi = new Vertice(nomeCidade);
            cidades.add(bibi);
            System.out.println("\n"+"Cidade cadastrada com sucesso!");
        }

    }
    public void cadastraConexao(ArrayList<Aresta> conexoes, Scanner tec){
        System.out.println("\n"+"///////////Cadastramento de Conexões///////////"+"\n");
        System.out.println("Digite o nome da primeira cidade: ");
        String nomeCidade1 = tec.nextLine().toLowerCase();

        System.out.println("Digite o nome da segunda cidade: ");
        String nomeCidade2 = tec.nextLine().toLowerCase();

        for(Vertice name : cidades)
        if(name.getNomeCidade().toLowerCase() == nomeCidade1 && name.getNomeCidade().toLowerCase() == nomeCidade2){
            Vertice city1 = new Vertice(nomeCidade1);
            cidades.add(city1);
            Vertice city2 = new Vertice(nomeCidade1);
            cidades.add(city2);
            System.out.println("\n"+"Conexão cadastrada com sucesso!");

        }else{
            System.out.println("\n"+"Alguma das cidades digitadas não consta no cadastro! A cadastre e depois volte à essa opção.");
            
        }

    }
    
}
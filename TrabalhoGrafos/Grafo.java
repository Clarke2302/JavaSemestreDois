import java.util.ArrayList;

public class Grafo {

    private ArrayList<Vertice> cidades; //vertice
    private ArrayList<Aresta> conexoes; //aresta

    public void infoCidades(ArrayList<Vertice> cidades){
        System.out.println("///////////Informações das Cidades///////////");
        for(Vertice c : cidades){
        System.out.println(c.getNomeCidade());
        }
        System.out.println("\n"+"////////////////////////////////////////////");
    }
    
    public void infoConexoes(ArrayList<Aresta> conexoes){
        System.out.println("///////////Informações das Conexões///////////"+"\n"+
        "Cidade 1: "+getCidade1()+"\n"+
        "Cidade 2: "+getCidade2()+"\n"+
        "Distância: "+getDistancia()+"\n");

    }
    public void cadastraCidade(ArrayList<Vertice> cidades){
        System.out.println("///////////Informações das Conexões///////////"+"\n"+
        "Cidade 1: "+getCidade1()+"\n"+
        "Cidade 2: "+getCidade2()+"\n"+
        "Distância: "+getDistancia()+"\n");

    }
    public void cadastraConexao(ArrayList<Aresta> conexoes){
        System.out.println("///////////Informações das Conexões///////////"+"\n"+
        "Cidade 1: "+getCidade1()+"\n"+
        "Cidade 2: "+getCidade2()+"\n"+
        "Distância: "+getDistancia()+"\n");

    }
    
}
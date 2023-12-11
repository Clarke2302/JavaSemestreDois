public class Aresta {
    //conexões

    private Vertice cidade1; //cidade origem
    private Vertice cidade2; //cidade destino
    private int distancia; //distancia entre elas

    public Aresta(Vertice cidade1,Vertice cidade2,int distancia){
        this.cidade1=cidade1;
        this.cidade2=cidade2;
        this.distancia=distancia;
    }

    public Aresta(){
        
    }

    public void infoAresta(Aresta ab){ //info de arestas criadas na Main mas sem adicioná-las na arraylist
        System.out.println("\n"+"///////////Informações da Aresta///////////");
        
        System.out.println("Cidade 1: "+ab.getCidade1().getNomeCidade()+"\n"
        +"Cidade 2: "+ab.getCidade2().getNomeCidade()+"\n"+"Distância entre: "+ab.getDistancia()+" km de distância");
        
        System.out.println("\n"+"////////////////////////////////////////////");
    }

    public Vertice getCidade1() {
        return cidade1;
    }

    public Vertice getCidade2() {
        return cidade2;
    }

    public int getDistancia() {
        return distancia;
    }
}

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

    public void infoAresta(){
        System.out.println("\n"+"///////////Informações das Conexões///////////"+"\n"+
                            "Cidade 1: "+getCidade1()+"\n"+
                            "Cidade 2: "+getCidade2()+"\n"+
                            "Distância: "+getDistancia()+"\n");
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

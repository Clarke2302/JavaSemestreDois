public class Navio extends VeiculoMaritimo{

    //navio
    String nome;

    public Navio(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double posZ,double valor, int passageiros, double posz, double profundidadeMax, String nome){
        super(fabricante, empresa, modelo, codigo, pais, posX, posY, valor,passageiros);
        this.nome=nome;
        

    }
}

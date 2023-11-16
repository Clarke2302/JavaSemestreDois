public class Submarino extends VeiculoMaritimo{

    //submarino
    double posZ;
    double profundidadeMax;

    public Submarino(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double posZ,double valor, int passageiros, double posz, double profundidadeMax){
        super(fabricante, empresa, modelo, codigo, pais, posX, posY, valor,passageiros);
        this.posZ=posz;
        this.profundidadeMax=profundidadeMax;
    }

    @Override
    public void deslocamento(double x, double y) {
        super.deslocamento(x,y);
    }
}

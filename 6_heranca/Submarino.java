public class Submarino extends VeiculoMaritimo{

    //submarino
    double posZ;
    double profundidadeMax;

    public Submarino(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double posZ,double valor, int passageiros, double profundidadeMax, String dono){
        super(fabricante, empresa, modelo, codigo, pais, posX, posY, valor,passageiros, dono);
        this.posZ=posZ;
        this.profundidadeMax=profundidadeMax;
    }

    public void deslocamento(double deslocaX, double deslocaY, double deslocaZ) {
        
        this.posX += deslocaX;
        this.posY += deslocaY;
        this.posZ += deslocaZ;

        if (this.posZ >= profundidadeMax) {
            System.out.println("Profundidade máxima foi atingida.");
        } else {
            System.out.println("Posicoes do Veículo após o deslocamento:"
        +"\n"+"Posicao X: "+posX
        +"\n"+"Posicao Y: "+posY
        +"\n"+"Posicao Z: "+posZ);
        }
    }
    public void Info(){
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"Empresa: "+empresa+"\n"
                            +"País: "+pais+"\n"
                            +"Código: "+codigo+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Profundidade Máxima Permitida: "+profundidadeMax+" léguas"+"\n"
                            +"Preço: R$"+String.format("%.2f", +valor)+"\n"
                            +"==================================");
    }
}

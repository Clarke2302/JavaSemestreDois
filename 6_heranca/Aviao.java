public class Aviao extends VeiculoAereo{
    


    public Aviao(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double posZ,double valor, int passageiros, String dono){
        super(fabricante,empresa,modelo,codigo, pais, posX, posY, posZ, valor, passageiros, dono);
    }

    public void Info(){
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"Empresa: "+empresa+"\n"
                            +"País: "+pais+"\n"
                            +"Código: "+codigo+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+String.format("%.2f", +valor)+"\n"
                            +"==================================");
    }



    public void deslocamento(double deslocaX, double deslocaY, double deslocaZ) {
        this.posX += deslocaX;
        this.posY += deslocaY;
        this.posZ += deslocaZ;
        System.out.println("Posicoes do Veículo após o deslocamento:"
        +"\n"+"Posicao X: "+posX
        +"\n"+"Posicao Y: "+posY
        +"\n"+"Posicao Z: "+posZ);
        
    }

    @Override
    public void compra() {
        super.compra();
    }
}

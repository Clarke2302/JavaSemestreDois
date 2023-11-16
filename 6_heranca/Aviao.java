public class Aviao extends VeiculoAereo{
    


    public Aviao(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double posZ,double valor, int passageiros){
        super(fabricante,empresa,modelo,codigo, pais, posX, posY, posZ, valor, passageiros);
    }

    public void Info(){
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"Empresa: "+empresa+"\n"
                            +"País: "+pais+"\n"
                            +"Código: "+codigo+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+valor+"\n"
                            +"==================================");
    }


    @Override
    public void deslocamento(double x, double y) {
        super.deslocamento(x,y);
    }

    @Override
    public void compra() {
        super.compra();
    }
}

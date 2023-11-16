public class VeiculoAereo extends Veiculo{
    int codigo;
    double posZ; //pés
    String empresa;

    public VeiculoAereo(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double posZ,double valor, int passageiros){
        super(fabricante, modelo,pais, posX, posY,valor,passageiros);
        this.codigo=codigo;
        this.posZ=posZ;
        this.empresa=empresa;
    }

    @Override
    public void deslocamento(double x, double y) {
        super.deslocamento(x, y);
        //primeiro calcula desloc e depois adiciona pés
    }
    public void compra(){
        //data compra e quem comprou
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
}

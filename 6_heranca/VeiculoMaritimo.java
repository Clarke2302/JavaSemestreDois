public class VeiculoMaritimo extends Veiculo{
    int codigo;
    String empresa;

    public VeiculoMaritimo(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double valor, int passageiros){
        super(fabricante, modelo,pais, posX, posY,valor,passageiros);
        this.codigo=codigo;
        this.empresa=empresa;
    }

    public void compra(){

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

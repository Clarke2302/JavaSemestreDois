public class VeiculoTerrestre extends Veiculo{
    String placa;
    String dono;

    public VeiculoTerrestre(String fabricante, String modelo,String pais, double posX, double posY,double valor, int passageiros, String placa, String dono){
        super(fabricante, modelo,pais, posX, posY,valor,passageiros);
        this.placa=placa;
        this.dono=dono;

    }

    public void emplacamento(){

    }
    public void compra(){

    }

    //preco e numero de passageiros

    public void Info() {
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"País: "+pais+"\n"
                            +"Placa: "+placa+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+valor+"\n"
                            +"Dono: "+dono+"\n"
                            +"==================================");
    }
    

}

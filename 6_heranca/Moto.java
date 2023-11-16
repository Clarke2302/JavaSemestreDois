public class Moto extends VeiculoTerrestre{

    //moto
    String marca;

    public Moto(String fabricante, String modelo,String pais, double posX, double posY,double valor, int passageiros, String placa, String dono,String marca){
        super(fabricante, modelo, pais, posX, posY, valor, passageiros,placa,dono);
        this.marca=marca;

    }


    public void info(){
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"País: "+pais+"\n"
                            +"Marca: "+marca+"\n"
                            +"Placa: "+placa+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+valor+"\n"
                            +"Dono: "+dono+"\n"
                            +"==================================");
    }

}

public class Moto extends VeiculoTerrestre{

    //moto
    String marca;
    String cor;

    public Moto(String fabricante, String modelo,String pais, double posX, double posY,double valor, int passageiros, String placa, String dono,String marca,String cor){
        super(fabricante, modelo, pais, posX, posY, valor, passageiros,placa,dono);
        this.marca=marca;
        this.cor=cor;

    }


    public void info(){
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"País: "+pais+"\n"
                            +"Marca: "+marca+"\n"
                            +"Cor: "+cor+"\n"
                            +"Placa: "+placa+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+String.format("%.2f", +valor)+"\n"
                            +"Dono: "+dono+"\n"
                            +"==================================");
    }

}

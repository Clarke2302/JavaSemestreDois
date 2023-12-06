public class Carro extends VeiculoTerrestre {
    // carro
    String tipoCombustivel;
    String classe;
    int potencia;

    public Carro(String fabricante, String modelo,String pais, double posX, double posY,double valor, int passageiros, String placa, String dono, String tipoCombustivel, String classe, int potencia){
        super(fabricante, modelo, pais, posX, posY, valor, passageiros,placa,dono);
        this.tipoCombustivel =tipoCombustivel;
        this.classe=classe;
        this.potencia=potencia;


    }

    public void info(){
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"Classe: "+classe+"\n"
                            +"País: "+pais+"\n"
                            +"Placa: "+placa+"\n"
                            +"Potência: "+potencia+"\n"
                            +"Tipo de Combustível: "+tipoCombustivel+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+String.format("%.2f", +valor)+"\n"
                            +"Dono: "+dono+"\n"
                            +"==================================");
    }


}

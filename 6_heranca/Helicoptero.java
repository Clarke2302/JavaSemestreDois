public class Helicoptero extends VeiculoAereo{

    int rotores;

    public Helicoptero(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double posZ,double valor, int passageiros, int rotores,String dono){
        super(fabricante,empresa,modelo,codigo, pais, posX, posY, posZ, valor, passageiros,dono);
        this.rotores=rotores;
    }

    public void Info(){
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"Empresa: "+empresa+"\n"
                            +"País: "+pais+"\n"
                            +"Código: "+codigo+"\n"
                            +"Número de Rotores: "+rotores+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+String.format("%.2f", +valor)+"\n"
                            +"==================================");
    }
}

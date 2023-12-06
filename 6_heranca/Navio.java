public class Navio extends VeiculoMaritimo{

    //navio
    String nome;

    public Navio(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double valor, int passageiros, String nome, String dono){
        super(fabricante, empresa, modelo, codigo, pais, posX, posY, valor,passageiros, dono);
        this.nome=nome;
        
    }

    public void Info(){
        System.out.println("=================================="+"\n"
                            +"Nome: "+nome+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"Empresa: "+empresa+"\n"
                            +"País: "+pais+"\n"
                            +"Código: "+codigo+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+String.format("%.2f", +valor)+"\n"
                            +"==================================");
    }
}

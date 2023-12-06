import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VeiculoMaritimo extends Veiculo{
    int codigo;
    String empresa;
    LocalDateTime dataCompra=LocalDateTime.now();
    String dono;

    public VeiculoMaritimo(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double valor, int passageiros, String dono){
        super(fabricante, modelo,pais, posX, posY,valor,passageiros);
        this.codigo=codigo;
        this.empresa=empresa;
        this.dono=dono;
        this.dataCompra=LocalDateTime.now();
    }

    //Formatar data compra

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = dataCompra.format(formato);


    public void compra(){

        //data compra e quem comprou

        System.out.println("\n"+"Estamos revendo uns documentos aqui..."+"\n"
        +"Ok, encontramos os arquivos dessa compra:"+"\n"+"\n"
        +"Data da Compra: "+dataFormatada+"\n"
        +"Quem comprou: "+dono+"\n"+"==================================");

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
}

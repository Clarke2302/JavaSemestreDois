import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VeiculoAereo extends Veiculo{
    int codigo;
    double posZ; //pés
    String empresa;
    LocalDateTime dataCompra=LocalDateTime.now();
    String dono;

    public VeiculoAereo(String fabricante,String empresa, String modelo,int codigo,String pais, double posX, double posY,double posZ,double valor, int passageiros,String dono){
        super(fabricante, modelo,pais, posX, posY,valor,passageiros);
        this.codigo=codigo;
        this.posZ=posZ;
        this.empresa=empresa;
        this.dono=dono;
        this.dataCompra=LocalDateTime.now();
    }

    public void deslocamento(double deslocaX, double deslocaY, double deslocaZ) {
        this.posX += deslocaX;
        this.posY += deslocaY;
        this.posZ += deslocaZ;
        System.out.println("Posicoes do Veículo após o deslocamento:"
        +"\n"+"Posicao X: "+posX
        +"\n"+"Posicao Y: "+posY
        +"\n"+"Posicao Z: "+posZ);
        

        //primeiro calcula desloc e depois adiciona pés
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

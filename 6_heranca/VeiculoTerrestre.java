import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VeiculoTerrestre extends Veiculo{
    String placa;
    String dono;
    LocalDateTime dataCompra=LocalDateTime.now();

    public VeiculoTerrestre(String fabricante, String modelo,String pais, double posX, double posY,double valor, int passageiros, String placa, String dono){
        super(fabricante, modelo,pais, posX, posY,valor,passageiros);
        this.placa=placa;
        this.dono=dono;
    }

    //Formatar data compra

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = dataCompra.format(formato);



    public void emplacamento(Scanner tec){
        System.out.println("Indo para o sistema de emplacamento...");
        int tentativa = 0;
        while(tentativa < 3){
        System.out.println("\n"+"Digite os primeiros 4 dígitos para  a nova placa desse veículo: EX: 27SJ");
        String novaPlaca = tec.nextLine().toUpperCase();
        String addTraco = "-";
        novaPlaca += addTraco;
        
        System.out.println("Agora digite os últimos 4 dígitos:");
        novaPlaca += tec.nextLine().toUpperCase();
        
            
        if(novaPlaca.length() != 9){
                System.out.println("\n"+"Digite algo válido!");
                tentativa++;
            }else{
                    this.placa = novaPlaca;
                    System.out.println("\n"+"Placa trocada!");
                    System.out.println(placa);
                    tentativa=4;
                }
            }
            if(tentativa==3){
            System.out.println("\n"+"=================================="+"\n"+"Você já fez 3 tentativas, tente novamente mais tarde!");
            }
        }
        

    public void compra(){

        //data compra e quem comprou

        System.out.println("\n"+"Estamos revendo uns documentos aqui..."+"\n"
        +"Ok, encontramos os arquivos dessa compra:"+"\n"+"\n"
        +"Data da Compra: "+dataFormatada+"\n"
        +"Quem comprou: "+dono+"\n"+"==================================");

    }

    //preco e numero de passageiros

    public void Info() {
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"País: "+pais+"\n"
                            +"Placa: "+placa+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+String.format("%.2f", +valor)+"\n"
                            +"Dono: "+dono+"\n"
                            +"==================================");
    }
    

}

package atividadesRevisao;
import java.util.Scanner;
public class quatroPontoDois {
    public static void main (String[]args){
        Scanner tec = new Scanner(System.in);

        int [] soma = new int[8];
        int fazSoma = 0;
        
        for(int i=0; i<soma.length; i++){
            System.out.println("Digite um número:");
            soma[i]=tec.nextInt();
        }
        for(int i=0; i<soma.length; i++){
            System.out.println("Fazendo a soma.....");
            fazSoma += soma[i];
        }
        for(int i=0; i<soma.length; i++){
            System.out.println("-------------------------");
            System.out.println(soma[i]);
            System.out.println("-------------------------");

        }
            System.out.println("-------------------------");
            System.out.println("A soma de todos os números é: "+fazSoma);
            System.out.println("-------------------------");
        
            tec.close();
    }
    
}

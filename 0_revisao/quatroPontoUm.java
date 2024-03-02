package atividadesRevisao;
import java.util.Scanner;
public class quatroPontoUm {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        String [] nomesPal = new String [10];

        System.out.println("----------------------");
        System.out.println("Digita aí");
        System.out.println("-----------------------");

        for(int i=0; i<nomesPal.length;i++){

            nomesPal[i]=teclado.nextLine();
        }
        for(int i=0; i<nomesPal.length;i++){
        System.out.println("Nomes Cadastrados:");
        System.out.println("----------------------");
        System.out.println(nomesPal[i]);
        }
        

        teclado.close();
    }
    
}

package atividadesRevisao;
import java.util.Scanner;
public class quatroPontoTres {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);

        double [] valor = new double [12];

        int soma = 0;
        int multiplica=1;
        for(int i=0;i<valor.length;i++){
            System.out.println("Digitaaaaaa");
            valor[i]=tec.nextDouble();

            if(valor[i]%2==0){
                soma += valor[i];
            }

            if(valor[i]%1==0){
                multiplica *= valor[i];
            }
        }
        for(int i=0;i<valor.length;i++){
            System.out.println("-----------------");
            System.out.println(valor[i]);
            System.out.println("-----------------");
        }
        System.out.println("A soma dos valores pares é: "+soma);
        System.out.println("A multiplicação dos valores ímpares é: "+multiplica);
        
        
        tec.close();
    }
}

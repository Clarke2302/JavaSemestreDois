import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String [] nome = new String[5];
    String [] sobrenome = new String[5];
    double [] nota = new double[5];

    int escolha = 1;

    while(escolha!=0){

        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Informações de Alunos");
        System.out.println("3 - Modificar a Nota");
        System.out.println("4 - Média de Notas");
        System.out.println("0 - Sair do Sistema");
        System.out.println("Escolha uma função de 1-4: ");
        int tecla = teclado.nextInt();
        System.out.println(" ");
        System.out.println("------------------------------------------------------------");

        if(tecla==1) {
            int j = 0;
            while (j < nome.length) {
                System.out.println("Digite o nome do aluno de matrícula " + j + " :");
                nome[j] = teclado.nextLine();

                System.out.println("Digite o sobrenome do aluno de matrícula " + j + " :");
                sobrenome[j] = teclado.nextLine();

                System.out.println("Digite a nota do aluno de matrícula " + j + " :");
                double digitaNota = teclado.nextDouble();

                if (digitaNota >= 0 && digitaNota <= 10) {
                    nota[j] = digitaNota;

                } else if (digitaNota < 0 || digitaNota > 10) {
                    System.out.println("Digite uma nota de 0 a 10!!!! ");
                    digitaNota = teclado.nextDouble();
                }
                System.out.println("Deseja cadastrar outro aluno?"+"\n"+"1 - Sim"+"\n"+"2 - Não");
                int tec = teclado.nextInt();
                System.out.println(" ");
                System.out.println("------------------------------------------------------------");
                if(tec==1) {
                    j++;
                }
                if(tec==2){
                    break;
                }
            }
        }

        if(tecla==2){

            for(int i=0; i<nome.length; i++){

                if(nome[i] != null && sobrenome[i] != null ) {
                    System.out.println(nome[i]+" "+sobrenome[i]+" "+nota[i]+" ");
                    
                }else{
                    System.out.println("O aluno da matrícula "+i+" não tem cadastro ou seu cadastro não está completo!");
                    
                }
                
            }
            System.out.println(" ");
            System.out.println("------------------------------------------------------------");
        }

        if(tecla==3){
            System.out.println("Qual a matrícula do aluno que vamos modificar a nota?");
                int matricula=teclado.nextInt();

            for(int i=0;i<nome.length;i++){

                if(i==matricula){
                    System.out.println("Digite a nota atualizada: ");
                    nota[matricula]= teclado.nextDouble();
                
                    System.out.println("Deseja modificar outra nota? "+"\n"+"1 - Sim"+"\n"+"2 - Não");
                    int tec = teclado.nextInt();
                    System.out.println(" ");
                    System.out.println("------------------------------------------------------------");
                    if(tec==1){
                        i++;
                    }
                    if(tec==2){
                        break;
                    }
                }
            }
            
        }
        
        double soma=0;
        if(tecla==4){
            for(int i=0; i<nome.length;i++){
                soma = soma + nota[i];
            }
            double divide = soma/nota.length;
            System.out.println("A média total da turma é de: "+divide+" no total.");
            System.out.println(" ");
            System.out.println("------------------------------------------------------------");
        }


    }


    }
}
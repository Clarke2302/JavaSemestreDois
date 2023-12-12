import java.util.Scanner;

public abstract class ContaBancaria {
    
    private Pessoa titular;
    private Banco banco;
    private int numConta;
    double saldo;
    private String senha;

    public ContaBancaria(Pessoa titular, Banco banco, int numConta, double saldo, String senha){
        this.titular=titular;
        this.banco=banco;
        this.numConta=numConta;
        this.saldo=saldo;
        this.senha=senha;
        
    }
    public ContaBancaria(){
        
    }
 //------------Sacar--------------------
    public void saque(Scanner tec){
        System.out.println("\n"+":Menu Saque:");

        if(verificaSenha(tec)==true){
        
        System.out.println("Qual o valor a ser sacado: ");
        double sacar = tec.nextDouble();

            if(sacar>saldo){
                System.out.println("\n"+"Seu saldo é insuficiente para essa retirada!"+"\n"+"Digite um valor menor!");
            }else if(saldo>sacar){
                saldo -= sacar;
                System.out.println("\n"+"Ok, tudo certo com o saque!"+"\n"+"Você sacou R$"+sacar+" seu saldo agora é de R$ "+saldo);
            }
        }
    }

    public void saque(double sacar, Scanner tec){
        System.out.println("\n"+":Menu Saque:");

        System.out.println("Primeiramente precisamos que digite a sua senha: "+"\n");
        int senhhh = tec.nextInt();

        if(verificaSenha(senhhh)==true){

            if(sacar>saldo){
                System.out.println("\n"+"Seu saldo é insuficiente para essa retirada!"+"\n"+"Digite um valor menor!");
            }else if(saldo>sacar){
                saldo -= sacar;
                System.out.println("\n"+"Ok, tudo certo com o saque!"+"\n"+"Você sacou R$"+sacar+" seu saldo agora é de R$ "+saldo);
            }
        }
    }
    //-------------Depositar---------------
    public void deposito(Scanner tec){
        System.out.println("\n"+":Menu Depósito:"+"\n"+
        "Qual o valor a ser depositado: ");
        double depositar = tec.nextDouble();

        if(depositar<10){
            System.out.println("\n"+"Você não pode depositar um valor abaixo de R$ 10,00"+"\n"+"Digite um valor mínimo de R$ 10,00!");
        }else if(depositar>=10){
            saldo += depositar;
            System.out.println("\n"+"Você depositou R$ "+depositar+" seu saldo agora é de R$ "+saldo);
        }
    }

    public void deposito(double depositar){
        System.out.println("\n"+":Menu Depósito:"+"\n");

        if(depositar<10){
            System.out.println("\n"+"Você não pode depositar um valor abaixo de R$ 10,00"+"\n"+"Digite um valor mínimo de R$ 10,00!");
        }else if(depositar>=10){
            saldo += depositar;
            System.out.println("\n"+"Você depositou R$ "+depositar+" seu saldo agora é de R$ "+saldo);
        }
    }
    //----------------Verificar Senha-------------------
    public boolean verificaSenha(Scanner tec){
        System.out.println("\n"+"Digite a sua senha: ");
        String suaSenha = tec.next();
        
        if(senha.equalsIgnoreCase(suaSenha)){
            return true;
        }else{
            System.out.println("A senha está incorreta!");
            return false;
        }
        
    }

    public boolean verificaSenha(int senhaa){
        String senhaEmString = String.valueOf(senhaa);

        if(senha.equalsIgnoreCase(senhaEmString)){
            return true;
        }else{
            System.out.println("A senha está incorreta!");
            return false;
        }
    }

    //Getters and Setters

    public Pessoa getTitular(){
        return titular;
    }
    public Banco getBanco(){
        return banco;
    }
    public int getNumConta(){
        return numConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getSenha(){
        return senha;
    }

    public void setPessoa(Pessoa novoTitular){
        this.titular = novoTitular;
    }
    public void setBanco(Banco novoBanco){
        this.banco = novoBanco;
    }
    public void setNumConta(int novoNum){
        this.numConta = novoNum;
    }
    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }
    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
}

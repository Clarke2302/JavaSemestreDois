import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner tec = new Scanner(System.in);

        ArrayList<Usuario> Usuarios = new ArrayList<>();

        ArrayList<Usuario> usuariosMaiores = new ArrayList<>();

        ArrayList<Usuario> usuariosMenores = new ArrayList<>();

        //Instanciar 10 objetos da classe Usuario
        //Deve ser usado ArrayList ou vetor para armazenar
        //Listar através de laço de repetição as informações de todos os usuarios do ArrayList/Vetor
        //Separar a lista entre usuarios maiores e menores de idade.

        //1 Cadastrando

        String nomedeUs = "clarkebr300";
        int senh = 12345;
        String em = "brasilva2123@gmail.com";

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataRecebida = "14/06/2000";
        Date dtaNasc = formato.parse(dataRecebida);
        
        Usuario us1 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(0, us1);

        //2
        nomedeUs = "clubes789";
        senh = 123459584;
        em = "bolinha23413elulu@gmail.com";

        dataRecebida = "12/11/2004";
        dtaNasc = formato.parse(dataRecebida);
        
        Usuario us2 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(1, us2);

        //3
        nomedeUs = "carlos45";
        senh = 7842;
        em = "carlinhosdopneu@gmail.com";


        dataRecebida = "08/06/2000";
        dtaNasc = formato.parse(dataRecebida);
        
        Usuario us3 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(2, us3);
        //4
        nomedeUs = "vivianbl3r";
        senh = 98061;
        em = "viviangoularte@gmail.com";


        dataRecebida = "07/08/2015";
        dtaNasc = formato.parse(dataRecebida);
        
        Usuario us4 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(3, us4);
        //5
        nomedeUs = "dennis5678";
        senh = 90152;
        em = "facihnstas@gmail.com";


        dataRecebida = "27/04/1960";
        dtaNasc = formato.parse(dataRecebida);
        
        Usuario us5 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(4, us5);
        //6
        nomedeUs = "horacius89";
        senh = 627623762;
        em = "hdehomem@outlook.com";

        
        dataRecebida = "22/09/1945";
        dtaNasc = formato.parse(dataRecebida);
        
        Usuario us6 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(5, us6);
        //7
        nomedeUs = "vintedoisirina";
        senh = 968454;
        em = "irinagonzales@hotmail.com";

        
        dataRecebida = "30/10/1956";
        dtaNasc = formato.parse(dataRecebida);
        
        Usuario us7 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(6, us7);
        //8
        nomedeUs = "sergiomalandro";
        senh = 171;
        em = "sergiocoecoe@outlook.com";

        
        dataRecebida = "08/07/2013";
        dtaNasc = formato.parse(dataRecebida);
        
        Usuario us8 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(7, us8);
        //9
        nomedeUs = "namaria76";
        senh = 12345;
        em = "anamaria@outlook.com";

        
        dataRecebida = "15/03/2011";
        dtaNasc = formato.parse(dataRecebida);
        
        Usuario us9 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(8, us9);
        //10
        nomedeUs = "lourojo345";
        senh = 12345;
        em = "wilsonmendes@outlook.com";

        
        dataRecebida = "22/05/1968";
        dtaNasc = formato.parse(dataRecebida);
        
        Usuario us10 = new Usuario (nomedeUs,senh,em,dtaNasc);
        Usuarios.add(9, us10);

        //TESTES FUNCIONALIDADES

        //System.out.println("\n"+"Usuarios Cadastrados no Sistema:");

        //info(Usuarios); //funcionando

        //validaSenha(Usuarios, tec); //funciona

        //alteraSenha(Usuarios, tec); //funciona

        //alteraEmail(Usuarios, tec);

        maiorDeIdade(Usuarios, tec, usuariosMaiores, usuariosMenores);
        infoMaiores(usuariosMaiores);
        infoMenores(usuariosMenores);

    }

    //Funções



    //-------------------1---------------------
    public static void info(ArrayList<Usuario>Usuarios){
        for(Usuario nome : Usuarios){
        System.out.println("============================================");
        System.out.println("Nome de Usuário: "+nome.getNomeUsuario()+"\n"+
                "Senha: "+ nome.getSenha()+"\n"+
                "E-mail: "+nome.getEmail()+"\n"+
                "Data de Nascimento: "+ nome.getDataNascimento()+"\n");
        System.out.println("============================================");
        }
    }
    //-------------------2--------------------
    public static boolean validaSenha(ArrayList<Usuario>Usuarios, Scanner tec){
        int validar=0;
        boolean resultado;
        boolean acabou = true;

            while(validar<3){//3 tentativas
        
                System.out.println("\n"+"============================================"
                                    +"\n"+"          Validando a Senha");
                System.out.println("Primeiramente digite o seu usuario para validarmos a sua senha: ");
                String usDigitado = tec.nextLine().toLowerCase();
                
                for(Usuario nome : Usuarios){

                    if(nome.getNomeUsuario().toLowerCase().equals(usDigitado)){
                        System.out.println("\n"+"Usuário Achado!!!!");
                        System.out.println("Digite sua senha: ");
                        int testaSenha = tec.nextInt();
                        if(testaSenha==nome.getSenha()) {
                            
                            return resultado = true;
                        }else{
                            return resultado = false;
                        }
                    }else{
                        validar++;
                    }
            }
            
        }

    return acabou;
    }
    //---------------------3----------------------

    public static void alteraSenha(ArrayList<Usuario>Usuarios, Scanner tec) {
        int contador= 0;
            System.out.println("\n"+"============================================"
                                +"\n"+"           Alterando Senha");
            System.out.println("Coloque o seu usuario para alterarmos a sua senha: ");
            String usDigitado = tec.nextLine().toLowerCase();

        for(Usuario nome : Usuarios){
            if(nome.getNomeUsuario().toLowerCase().equals(usDigitado)){
                System.out.println("Antes de trocar a senha, digite a sua SENHA ANTIGA!");
                int senhaAntiga = tec.nextInt();
                    if(senhaAntiga!= nome.getSenha()) {
                        System.out.println("Sua senha antiga está errada, tente de novo!");
                        contador++;


                    }else if(senhaAntiga==nome.getSenha()) {
                        int conta = 0;
                        while (conta < 4) {
                            System.out.println("Ótimo! Digite sua nova senha: ");
                            int novaSenha = tec.nextInt();
                            System.out.println("Digite novamente: ");
                            int novamente = tec.nextInt();

                            if (novaSenha == novamente) {
                                nome.setSenha(novaSenha);
                                System.out.println("Parabéns, você trocou sua senha.");
                                conta=5;

                            } else {
                                System.out.println("As senhas não coincidem, tente de novo !");
                                conta++;
                            }
                        }
                    }
            }
        }
        
        
        
    }
    //-----------------------4---------------------------------
    public static void alteraEmail(ArrayList<Usuario>Usuarios, Scanner tec){
        int contador = 0;
        tec.nextLine(); //buffer

            while(contador<3){
        
            System.out.println("\n"+"============================================"
                                +"\n"+"          Alterando E-mail");
            System.out.println("Primeiramente digite o seu usuario para alterarmos seu e-mail: ");
            String usDigitado = tec.nextLine().toLowerCase();

            for(Usuario nome : Usuarios){
                if(nome.getNomeUsuario().toLowerCase().equals(usDigitado)){

                    System.out.println("Vamos alterar o seu e-mail, mas antes coloque sua senha!");
                    int verificaSenha = tec.nextInt();
                    if(verificaSenha!= nome.getSenha()){
                        System.out.println("Você errou a senha, tente de novo!");
                        contador++;
                    }else{
                        
                        System.out.println("Digite o seu novo E-mail:");
                        String novoEmail = tec.nextLine();
                        nome.setEmail(novoEmail);
                        System.out.println("Seu E-mail foi alterado.");
                    }
                }
                
            }
    }
}
    //------------------------5-------------------------------
    public static boolean maiorDeIdade(ArrayList<Usuario>Usuarios, Scanner tec, ArrayList<Usuario> usuariosMaiores,ArrayList<Usuario> usuariosMenores){
        boolean acabou = true;
        
        System.out.println("\n"+"Digite o ano atual");
        int anoAtual = tec.nextInt();
        
        for(Usuario nome : Usuarios){

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            int ano = Integer.parseInt(sdf.format(nome.getDataNascimento()));

            int contaAnos = anoAtual - ano;

            if(contaAnos>=18){
                
                Usuario usMaior = new Usuario(nome.getNomeUsuario(),nome.getSenha(),nome.getEmail(),nome.getDataNascimento());
                usuariosMaiores.add(usMaior);
                return true;
            }else{
                Usuario usMenor = new Usuario(nome.getNomeUsuario(),nome.getSenha(),nome.getEmail(),nome.getDataNascimento());
                usuariosMenores.add(usMenor);
                return false;
            }
        }
        return acabou;
    }

    public static void infoMaiores(ArrayList<Usuario> usuariosMaiores){
        System.out.println("\n"+"Usuários que chegaram à Maioridade"+"\n");
        for(Usuario nome : usuariosMaiores){
        
                System.out.println("Nome de Usuário: "+nome.getNomeUsuario()+"\n"+
                    "Senha: "+ nome.getSenha()+"\n"+
                    "E-mail: "+nome.getEmail()+"\n"+
                    "Data de Nascimento: "+ nome.getDataNascimento()+"\n");
                System.out.println("============================================");
        }
    }

    public static void infoMenores(ArrayList<Usuario> usuariosMenores){
        System.out.println("\n"+"Usuários Menores de idade: "+"\n");
        for(Usuario nome : usuariosMenores){
        
            System.out.println("Nome de Usuário: "+nome.getNomeUsuario()+"\n"+
                    "Senha: "+ nome.getSenha()+"\n"+
                    "E-mail: "+nome.getEmail()+"\n"+
                    "Data de Nascimento: "+ nome.getDataNascimento()+"\n");
            System.out.println("============================================");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Desenvolver um programa onde é possível instanciar qualquer uma das classes do diagrama.
        //Deve se instanciar no minimo 1 objeto de cada classe.
        //Ao ser executado o programa escreve na tela as informações dos pets e tutores cadastrados.

        Scanner tec = new Scanner (System.in);

        ArrayList<Integer> telefones = new ArrayList<>();

        ArrayList<Pet> petsCadastrados = new ArrayList<>();

        ArrayList<Tutor> tutoresCadastrados = new ArrayList<>();

        ArrayList<Pessoa> pessoasCadastradas = new ArrayList<>();

        // cadastrando pet antes para estar no sistema

        Pet cachorrinho = new Pet("Lulu", "Cachorro", "Vira-Lata", 6, tutoresCadastrados);

        mostraMenu(); //mostra opções

        int tecla = tec.nextInt();

            if(tecla == 1){
               cadastraPessoa(pessoasCadastradas, telefones, tec);
            }
            if(tecla == 2){
                cadastraTutor(tutoresCadastrados, telefones, petsCadastrados , tec);
            }
            if(tecla== 3){
                cadastraPet(petsCadastrados, tutoresCadastrados,telefones, tec);
            }


        //System.out.println("-------------------------------------------------" + "\n" + "Mostrando Tutores e Pets Cadastrados: " + "\n");


    }

        /////----------Funções------------

        public static void mostraMenu(){
            System.out.println("-----------------Menu-----------------"+"\n"+
                                "1 - Cadastrar Pessoa: "+"\n"+
                                "2 - Cadastrar Tutor: "+"\n"+
                                "3 - Cadastrar Pet: "+"\n"+
                                "4 - Info Pessoa: "+"\n"+
                                "5 - Info Contato: "+"\n"+
                                "6 - Info Tutor: "+"\n"+
                                "7 - Info Pet: "+"\n");
            System.out.printf("Digite: ");
        }

        public static void cadastraPessoa(ArrayList<Pessoa> pessoas, ArrayList<Integer> telefones,  Scanner tec) {

            System.out.println("\n" + "Bem-Vindo ao cadastro de Pessoas:");

            System.out.println("Digite o nome completo dessa Pessoa: ");
            String nomeComp = tec.nextLine();

            System.out.println("Digite o endereço dessa Pessoa: ");
            String endereco = tec.nextLine();

            System.out.println("Digite o e-mail dessa Pessoa: ");
            String email = tec.next();

            System.out.println("Digite o CPF dessa Pessoa: ");
            int cpf = tec.nextInt();

            System.out.println("Digite o telefone dessa Pessoa: ");
            int telefone = tec.nextInt();

            for (int i = 0; i < telefones.size(); i++) {

                if (telefones.indexOf(i) == 0) {
                    telefones.add(telefone);
                }
            }

            Pessoa p1 = new Pessoa(nomeComp, endereco, email, cpf, telefones);
        }
        public static void cadastraTutor(ArrayList<Tutor> tutores, ArrayList<Integer> telefones, ArrayList<Pet> pets , Scanner tec) {

            System.out.println("\n" + "Bem-Vindo ao cadastro de Tutores:");

            System.out.println("Digite o nome completo do Tutor: ");
            String nomeComp = tec.nextLine();

            System.out.println("Digite o endereço do Tutor: ");
            String endereco = tec.nextLine();

            System.out.println("Digite o e-mail do Tutor: ");
            String email = tec.next();

            System.out.println("Digite o CPF do Tutor: ");
            int cpf = tec.nextInt();

            System.out.println("Digite o telefone do Tutor: ");
            int telefone = tec.nextInt();

            for (int i = 0; i < telefones.size(); i++) {

                if (telefones.indexOf(i) == 0) {
                    telefones.add(telefone);
                }
            }

            System.out.println("Digite o nome do seu pet agora: ");
            String nomePet = tec.nextLine().toLowerCase();

            for (Pet p : pets) {
                if (pets.contains(nomePet.toLowerCase())) {
                    System.out.println("Encontramos seu pet em nosso sistema!");
                    //mostrar pet achado
                    p.info_pet();
                    //add pet achado em cadastro de tutor
                } else {
                    System.out.println("\n" + "O seu pet não consta em nosso sistema! Vamos cadastrá-lo:");
                    cadastraPet(pets,tutores,telefones,tec);
                }

                Tutor ABC = new Tutor(nomeComp, endereco, email, cpf, telefones, pets);
                tutores.add(ABC);
            }
        }
        public static void cadastraPet(ArrayList<Pet> pets, ArrayList<Tutor> tutores,ArrayList<Integer> telefones, Scanner tec){
            System.out.println("\n" + "Bem-Vindo ao cadastro de Pets:");

            System.out.println("Digite o nome completo do Pet: ");
            String nome = tec.nextLine();

            System.out.println("Digite a espécie do Pet: ");
            String especie = tec.nextLine();

            System.out.println("Digite a raça do Pet: ");
            String raca = tec.next();

            System.out.println("Digite a idade do Pet: ");
            int idade = tec.nextInt();

            System.out.println("Digite o nome do dono do pet agora: ");
            String nomeTutor = tec.nextLine().toLowerCase();

            for (Tutor a : tutores) {
                if (tutores.contains(nomeTutor.toLowerCase())) {
                    System.out.println("Encontramos o nome do tutor desse pet em nosso sistema!");
                    //mostrar tutor achado
                    a.info_tutor(telefones);
                    //add tutor achado em cadastro de pet
                    

                } else {
                    System.out.println("\n" + "O seu pet não consta em nosso sistema! Vamos cadastrá-lo:");
                    cadastraTutor(tutores,telefones,pets,tec);
                }

                Pet cachorrinho = new Pet(nome, especie, raca, idade, tutores);
                pets.add(cachorrinho);

        }

        //ABC.info_tutor();

        //cachorrinho.info_pet();




    
}
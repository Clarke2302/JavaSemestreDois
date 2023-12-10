import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pet> petsCadastrados = new ArrayList<>();
        ArrayList<Tutor> tutoresCadastrados = new ArrayList<>();
        ArrayList<Integer> telefonesPessoa = new ArrayList<>();


        // Cria um objeto da classe Tutor chamado joao com os valores dos atributos passados como parâmetros

        Tutor joao = new Tutor("João", 123456789, "Rua A, 123", "jaocantor@gmail.com", 519388822, null);
        joao.adicionarTelefone();

        Pet rex = new Pet("Rex", "Cachorro", "Vira-lata", 13, joao);
        
        joao.adicionarPet(rex);
        rex.adicionarDono(joao);
        
        petsCadastrados.add(rex);
        tutoresCadastrados.add(joao);

        Tutor joana = new Tutor("Joana Wemberger", 72788919, "Rua Vielas e Sapatos, 785", "joanafrau@gmail.com", 519387387, null);
        joana.adicionarTelefone();

        Pet duda = new Pet("Dudinha Bolinha", "Cachorro", "Chow Chow", 6, joana);
        
        joana.adicionarPet(duda);
        duda.adicionarDono(joana);

        tutoresCadastrados.add(joana);
        petsCadastrados.add(duda);
        //---------------------------------------

        //rex.info_pet();
        //rex.info_tutores();

        //duda.info_pet();
        //joana.info_tutor();

        //Função para aparecer todos cadastrados

        infoTotalPets(petsCadastrados, tutoresCadastrados); //funciona
        
        //infoTotalTutores(tutoresCadastrados, petsCadastrados);


    }

    //Funções para mostrar total tutores e pets

    public static void infoTotalPets(ArrayList<Pet> petsCadastrados, ArrayList<Tutor> tutoresCadastrados){
        for(Pet a : petsCadastrados) {
            System.out.println("\n" + "///////////Informações do Pet////////////" + "\n"
                    + "Nome: " + a.getNome() + "\n"
                    + "Espécie: " + a.getEspecie() + "\n"
                    + "Raça: " + a.getRaca() + "\n"
                    + "Idade: " + a.getIdade());
                for(Tutor b : tutoresCadastrados) {
                    if (b.getNome() == a.getTutor().getNome()) {
                        System.out.print("Dono: "+ b.getNome() + "\n" + "///////////////////////////////////////" + "\n");
                    }
                }
        }
    }
    
    public static void infoTotalTutores(ArrayList<Tutor> tutoresCadastrados, ArrayList<Pet> petsCadastrados) {
        for (Tutor a : tutoresCadastrados) {
                System.out.println("\n"+"///////////Informações do Tutor////////////"+"\n"+
                        "Nome: " + a.getNome()+"\n"+
                        "CPF: " + a.getCpf()+"\n"+
                        "Endereço: " + a.getEndereco()+"\n"+
                        "E-mail: " + a.getEmail()+"\n"+
                        "Telefones: " + a.getTelefone());
        
                for(Pet b : petsCadastrados) {
                    if (b.getNome() == a.getPets().getNome()) {
                        System.out.println("Pet: "+ b.getNome() + "\n" + "///////////////////////////////////////" + "\n");
                    }
                }
            }
    }
}


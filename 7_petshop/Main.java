import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Tutor> tutoresCadastrados = new ArrayList<>();
        ArrayList<Pet> petsCadastrados = new ArrayList<>();
        ArrayList<Integer> telefonesPessoa = new ArrayList<>();

        // Cria um objeto da classe Tutor chamado joao com os valores dos atributos passados como parâmetros
        Pet rex = null;
        Tutor joao = new Tutor("João", 123456789, "Rua A, 123", "jaocantor@gmail.com", 519388822, rex);
        tutoresCadastrados.add(joao);

        Pet duda = null;
        Tutor joana = new Tutor("Joana Wemberger", 72788919, "Rua Vielas e Sapatos, 785", "joanafrau@gmail.com", 519387387, duda);
        tutoresCadastrados.add(joana);

        // Cria um objeto da classe Pet chamado rex com os valores dos atributos passados como parâmetros
        rex = new Pet("Rex", "Cachorro", "Vira-lata", 13, joao);
        petsCadastrados.add(rex);

        duda = new Pet("Dudinha Bolinha", "Cachorro", "Chow Chow", 6, joana);
        petsCadastrados.add(duda);

        //rex.info_pet(tutoresCadastrados);
        //rex.info_tutores(tutoresCadastrados);

        //duda.info_pet(tutoresCadastrados);
        //joana.info_tutor(petsCadastrados,telefonesPessoa);

        //Função para aparecer todos cadastrados

        rex.infoTotalPets(petsCadastrados, tutoresCadastrados);
        joao.infoTotalTutores(tutoresCadastrados, petsCadastrados);


    }


}


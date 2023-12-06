import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        

        //Desenvolver um programa onde é possível instanciar qualquer uma das classes do diagrama.
        //Deve se instanciar no minimo 1 objeto de cada classe.
        //Ao ser executado o programa escreve na tela as informações dos pets e tutores cadastrados.


        ArrayList<Integer> telefones = new ArrayList<>();

        ArrayList<Pet> petsCadastrados = new ArrayList<>();

        ArrayList<Tutor> tutoresCadastrados = new ArrayList<>();

        Pessoa Bibi = new Pessoa("Leonardo da Silva", "Rua dos Doidos, 8300", "leosilva356@gmail.com", 637837738,telefones);
        Bibi.setTelefone(telefones,986756455);

        Tutor ABC = new Tutor("Bianca Moraes", "Rua do Andes, 158", "bibidosanjos@outlook.com", 854225423, telefones, petsCadastrados);

        Pet cachorrinho = new Pet("Lulu", "Cachorro", "Vira-Lata", 6, tutoresCadastrados);

        tutoresCadastrados.add(ABC);


        System.out.println("////////////////////////////////"+"\n"+"Mostrando Tutores e Pets Cadastrados: "+"\n");

        ABC.info_tutor();

        cachorrinho.info_pet();



    }
    
}

import java.util.ArrayList;

public class Tutor extends Pessoa{
    
    ArrayList<Pet> pets;

    public Tutor(String nomeCompleto, String endereco, String email, int cpf, ArrayList<Integer>telefone, ArrayList<Pet> pets){

        super(nomeCompleto, endereco, email, cpf, telefone);
        this.pets = new ArrayList<>();
    }

    //------------------Infos-----------------

    public void info_tutor(ArrayList<Integer>telefone){
        if(){
            for(Tutor a : tutores){
            System.out.println("///////////Informações do Tutor////////////"+"\n"
            +"Nome: "+getNomeCompleto()+"\n"
            +"CPF: "+getCpf()+"\n"
            +"Endereço: "+getEndereco()+"\n"
            +"E-mail: "+getEmail()+"\n"
            +"Telefone: "+getTelefone()+"\n"
            +"///////////////////////////////////////"+"\n");
            }
        }
    }

    public void info_pets(ArrayList<Pet> pets, String nomeString){
        
        for(Pet pepe : pets){
        System.out.println("///////////Informações do Pet////////////"+"\n"
                            +"Nome: "+pepe.getNome()+"\n"
                            +"Espécie: "+pepe.getEspecie()+"\n"
                            +"Raça: "+pepe.getRaca()+"\n"
                            +"Idade: "+pepe.getIdade()+"\n"
                            +"Dono: "+pepe.getMeuDono()+"\n"
                            +"///////////////////////////////////////"+"\n");
        }
    }

    //------------------Getters and Setters-----------------------

    

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    

}

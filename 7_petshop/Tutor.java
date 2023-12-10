import java.util.ArrayList;

public class Tutor extends Pessoa{
    
    private String nome; // Nome do tutor
    private int cpf; // CPF do tutor
    private String endereco; // Endereço do tutor
    private String email;
    private int telefone; // Telefone do tutor

    private Pet pets;

    ArrayList<Pet> meusPets = new ArrayList<>();


    Tutor(String nome, int cpf, String endereco, String email, int telefone, Pet pets) {
    this.nome = nome;
    this.cpf = cpf;
    this.email=email;
    this.endereco = endereco;
    this.telefone = telefone;
    this.pets=pets;
    }

    public void info_tutor(){
        System.out.println("\n"+"///////////Informações do Tutor////////////"+"\n"+
                "Nome: " + getNome()+"\n"+
                "CPF: " + getCpf()+"\n"+
                "Endereço: " + getEndereco()+"\n"+
                "E-mail: " + getEmail()+"\n"+
                "Telefones: " + getTelefone());

        for(Pet a : meusPets) {
            
                System.out.println("Pet: "+ a.getNome() + "\n" + "///////////////////////////////////////" + "\n");
            
        }
    }

    public void info_pets(){
        for(Pet a : meusPets) {
        
                System.out.println("\n" + "///////////Informações do Pet////////////" + "\n"
                        + "Nome: " + a.getNome() + "\n"
                        + "Espécie: " + a.getEspecie() + "\n"
                        + "Raça: " + a.getRaca() + "\n"
                        + "Idade: " + a.getIdade());
            
        }
    }

    public void adicionarPet(Pet pet) {
        meusPets.add(pet);
        pet.meuDono.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public  int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Pet getPets() {
        return pets;
    }

    public void setPets(Pet pets) {
        this.pets = pets;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

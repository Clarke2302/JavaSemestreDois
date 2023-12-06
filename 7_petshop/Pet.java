import java.util.ArrayList;

public class Pet{

private String especie, raca, nome;
private int idade;

ArrayList<Tutor> meuDono;


    public Pet(String nome, String especie, String raca, int idade, ArrayList<Tutor>meuDono){
        this.nome=nome;
        this.especie=especie;
        this.raca=raca;
        this.idade=idade;
        this.meuDono= new ArrayList<>();
    }

    //------------Infos-------------

    public void info_pet(){
        System.out.println("///////////Informações do Pet////////////"+"\n"
                            +"Nome: "+getNome()+"\n"
                            +"Espécie: "+getEspecie()+"\n"
                            +"Raça: "+getRaca()+"\n"
                            +"Idade: "+getIdade()+"\n"
                            +"Dono: "+getMeuDono()+"\n"
                            +"///////////////////////////////////////"+"\n");
    }

    public void info_tutores(ArrayList<Tutor> tutores){
        for(Tutor a : tutores){
            System.out.println("///////////Informações do Tutor////////////"+"\n"
        +"Nome: "+a.getNomeCompleto()+"\n"
        +"CPF: "+a.getCpf()+"\n"
        +"Endereço: "+a.getEndereco()+"\n"
        +"E-mail: "+a.getEmail()+"\n"
        +"Telefone: "+a.getTelefone()+"\n"
        +"///////////////////////////////////////"+"\n");
        }
    }

    //--------------Getters and Setters----------------

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Tutor> getMeuDono() {
        return meuDono;
    }

    public void setMeuDono(ArrayList<Tutor> meuDono) {
        this.meuDono = meuDono;
    }

    

}
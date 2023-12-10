import java.util.ArrayList;

public class Pet{

    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private Tutor tutor;

    ArrayList<Tutor> meuDono = new ArrayList<>();

    public Pet(String nome, String especie, String raca, int idade, Tutor tutor){
        this.nome=nome;
        this.especie=especie;
        this.raca=raca;
        this.idade=idade;
        this.tutor=tutor;

    }

    public void info_pet(){
        System.out.println("\n"+"///////////Informações do Pet////////////"+"\n"
                            +"Nome: "+getNome()+"\n"
                            +"Espécie: "+getEspecie()+"\n"
                            +"Raça: "+getRaca()+"\n"
                            +"Idade: "+getIdade());

            for(Tutor a : meuDono) {
                if (a.getNome() == getTutor().getNome()) {
                    System.out.print("Dono: "+ a.getNome() + "\n" + "///////////////////////////////////////" + "\n");
                }
            }
    }

    public void info_tutores(){
        for(Tutor a : meuDono){
            if(a.getNome() == getTutor().getNome()){
            System.out.println("\n"+"///////////Informações do Tutor////////////"+"\n"
        +"Nome: "+a.getNome()+"\n"
        +"CPF: "+a.getCpf()+"\n"
        +"Endereço: "+a.getEndereco()+"\n"
        +"E-mail: "+a.getEmail()+"\n"
        +"Telefone: "+a.getTelefone()+"\n"
        +"///////////////////////////////////////"+"\n");
            }
        }
    }

    public void adicionarDono(Tutor tutorA){
        meuDono.add(tutorA);
        tutorA.meusPets.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
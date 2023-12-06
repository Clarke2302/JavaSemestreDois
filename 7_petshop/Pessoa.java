import java.util.ArrayList;

public class Pessoa {
    
    private String nomeCompleto, endereco, email;
    private int cpf;
    private ArrayList<Integer>telefone;

    public Pessoa(String nomeCompleto, String endereco, String email, int cpf, ArrayList<Integer>telefone){
        
        this.nomeCompleto=nomeCompleto;
        this.endereco=endereco;
        this.email=email;
        this.cpf=cpf;
        this.telefone = new ArrayList<>();
    }

    //----------------Infos------------------

    public void info_pessoa(){
        System.out.println("///////////Informações Pessoais////////////"+"\n"
        +"Nome Completo: "+getNomeCompleto()+"\n"
        +"CPF: "+getCpf()+"\n"
        +"Endereço: "+getEndereco()+"\n"
        +"///////////////////////////////////////"+"\n");
    }

    public void info_contato(ArrayList<Integer> telefone){
        System.out.println("///////////Contato Pessoal////////////"+"\n"
        +"E-mail: "+getEmail()+"\n");

        for(Integer tel : telefone){
        System.out.print("Telefone: "+getTelefone()+"\n");
        }

        System.out.print("///////////////////////////////////////"+"\n");
    }

    //-----------Getters and Setters----------------

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Integer> getTelefone() {
        return telefone;
    }

    public void setTelefone(ArrayList<Integer> telefone, int numeroDeTelefone) {
        telefone.add(numeroDeTelefone);

        this.telefone = telefone;
    }
    
    

    }


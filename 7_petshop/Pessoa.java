import java.util.ArrayList;

public class Pessoa {
    
    private String nomeCompleto;
    private String endereco;
    private String email;
    private int cpf;
    private int telefone;


    public void info_pessoa(){
        System.out.println("\n"+"///////////Informações da Pessoa////////////"+"\n"+
        "Nome: " + getNomeCompleto()+"\n"+
        "CPF: " + getCpf()+"\n"+
        "Endereço: " + getEndereco());
    }

    public void info_contato(ArrayList<Integer> telefonesPessoa){
        System.out.println("E-mail: " + getEmail());
        for(Integer tel : telefonesPessoa ) {
            while(tel!=null) {
                System.out.println("Telefones: " + getTelefone(telefonesPessoa)
                        + "\n" + "///////////////////////////////////////");
            }
        }
    }

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

    public int getTelefone(ArrayList<Integer> telefonesPessoa) {
        telefonesPessoa.add(telefone);
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}

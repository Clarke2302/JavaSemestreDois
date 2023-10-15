import java.util.Date;
public class Usuario {
    String nomeUsuario;
    int senha;
    String email;
    Date dataNascimento;

    //construtor
    public Usuario(String nomeUsuario, int senha, String email, Date dataNascimento){
        this.nomeUsuario=nomeUsuario;
        this.senha=senha;
        this.email=email;
        this.dataNascimento=dataNascimento;
    }


    //getters and setters
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

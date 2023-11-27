import java.util.ArrayList;

public class Filial {
    // quantidade de livros em estoque, é para ver quantos livros precisamos achar ou cadastrar (se o livro não existir)
    
    int codigo, quantLivros;
    String nomeFilial, endereco, contato;
    ArrayList<Livro> livrosEmEstoque; //Criando ArrayList de Livros Criados

    public Filial (int codigo, String nomeFilial,String endereco,String contato){ //Criar Livro
        this.codigo = codigo;
        this.nomeFilial = nomeFilial;
        this.endereco = endereco;
        this.contato = contato;
        this.livrosEmEstoque = new ArrayList<>();

    }

    public int getCodigo() {
        return codigo;
    }

    public String getCodigoString() {
        return String.valueOf(codigo);
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public int getQuantLivros() {
        return quantLivros;
    }


    public void setQuantLivros(int quantLivros) {
        this.quantLivros = quantLivros;
    }


    public String getNomeFilial() {
        return nomeFilial;
    }


    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getContato() {
        return contato;
    }


    public void setContato(String contato) {
        this.contato = contato;
    }

    public ArrayList<Livro> getLivrosEmEstoque() {
        return livrosEmEstoque;
    }

    public void setLivrosEmEstoque(ArrayList<Livro> livrosEmEstoque) {
        this.livrosEmEstoque = livrosEmEstoque;
    }

    public void adicionarLivroEstoque(Livro livro){
        livrosEmEstoque.add(livro);
    }

    
}

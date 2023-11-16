public class Livro {
    private String titulo;
    private int codigo;
    private String editora;
    private String area;
    private int ano;
    private double valor;
    private int quantidadeEstoque;
    private double valorEmEstoque = valor * quantidadeEstoque;

    public Livro (int codigo, String titulo, int ano,String area,String editora, double valor, int quantidadeEstoque, double valorEmEstoque){ //Criar Livro
        this.titulo = titulo;
        this.codigo = codigo;
        this.editora = editora;
        this.area = area;
        this.ano = ano;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorEmEstoque = valorEmEstoque;

    }


    //getters and setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getValorEmEstoque() {
        return valorEmEstoque;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", codigo=" + codigo + ", editora=" + editora + ", area=" + area + ", ano="
                + ano + ", valor=" + valor + ", quantidadeEstoque=" + quantidadeEstoque + ", valorEmEstoque="
                + valorEmEstoque + "]";
    }


    
}

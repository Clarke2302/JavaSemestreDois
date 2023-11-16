public class Veiculo {
    String fabricante;
    String modelo;
    String pais;
    double posX;
    double posY;
    double valor;
    int passageiros;

    public Veiculo(String fabricante, String modelo,String pais, double posX, double posY,double valor, int passageiros ){
        this.modelo = modelo;
        this.fabricante= fabricante;
        this.pais = pais;
        this.posX = 0;
        this.posY = 0;
        this.valor = 0;
        this.passageiros = 0;
        
    }


    public void deslocamento(double posX, double posY ){
        //O método de deslocamento incrementa/decrementa os valores de posição (X/Y/Z)
        this.posX = posX;
        this.posY = posY;

    }
}

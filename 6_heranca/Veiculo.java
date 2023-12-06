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
        this.posX = posX;
        this.posY = posY;
        this.valor = valor;
        this.passageiros = passageiros;
        
    }


    public void deslocamento(double deslocaX, double deslocaY ){
        //O método de deslocamento incrementa/decrementa os valores de posição (X/Y/Z)
        this.posX += deslocaX;
        this.posY += deslocaY;

        System.out.println("Posicoes do Veículo após o deslocamento:"
        +"\n"+"Posicao X: "+posX
        +"\n"+"Posicao Y: "+posY);

    }
}

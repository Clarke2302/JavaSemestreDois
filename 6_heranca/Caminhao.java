public class Caminhao extends VeiculoTerrestre{

    //caminhao
    int eixos;
    double peso;

    public Caminhao(String fabricante, String modelo,String pais, double posX, double posY,double valor, int passageiros, String placa, String dono, int eixos, double peso){
        super(fabricante, modelo, pais, posX, posY, valor, passageiros,placa,dono);
        this.eixos=eixos;
        this.peso=peso;
    }


    public void Info() {
        
        System.out.println("=================================="+"\n"
                            +"Fabricante: "+fabricante+"\n"
                            +"Modelo: "+modelo+"\n"
                            +"País: "+pais+"\n"
                            +"Placa: "+placa+"\n"
                            +"Quantidade de eixos: "+eixos+"\n"
                            +"Peso: "+peso+"\n"
                            +"Número de Passageiros: "+passageiros+"\n"
                            +"Preço: R$"+valor+"\n"
                            +"Dono: "+dono+"\n"
                            +"==================================");
    }
    
    double cargaAtual = 0;
    public void carga(double carga){
        //peso = peso máximo
        //cargaAtual = 0
        //a carga não pode ser maior que o peso suportado

        if(peso>carga){
            cargaAtual = carga;
            double sobra = peso - cargaAtual;
            System.out.println("\n"+"O caminhão foi carregado com uma nova carga! Estamos ainda com "+sobra+" kg sobrando.");
        }
        if(peso<carga){
            System.out.println("\n"+"O caminhão não tem capacidade suficiente para levar essa carga!");
        }
    }
    
    public void descarga(double descarga, double cargaAtual){
        //a descarga não pode ser maior que a carga e que o peso
        if(descarga>cargaAtual){
            System.out.println("\n"+"Você está retirando mais do que a carga atual do caminhão!"+"\n"+"Insira um número menor ou igual a: "+cargaAtual);
        }
        if(descarga<cargaAtual){
            System.out.println("Você retirou "+descarga+" kg de carga do caminhão! Agora nós temos "+cargaAtual+" kg no caminhão!");
        }
    }

}


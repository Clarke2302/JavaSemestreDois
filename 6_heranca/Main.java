import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Deve se instanciar no minimo 1 objeto de cada classe. Todos devem estar no mesmo vetor ou lista.
        //Ao ser executado o programa escreve na tela as informações dos veiculos cadastrados.

        Scanner tec = new Scanner (System.in);

        List<Veiculo> listaDeVeiculos = new ArrayList<>();

        
        VeiculoAereo avi1 = new Aviao("Azul", "Azul corp.", "Ubuntu f28",747834923, "Escócia",60, 400, 700, 40.000, 300,"Roberto Sanchez");
        VeiculoAereo h1 = new Helicoptero("Jens and Cunny's","J&C", "Benny blue v3",993022,"Estados Unidos",800, 100, 900,300.000,30,8,"Paul Matthew");
        listaDeVeiculos.add(h1);
        listaDeVeiculos.add(avi1);
        
        VeiculoTerrestre carro = new Carro("Ford", "Ford KA 1.5 SE Flex", "EUA", 230, 500, 42.900, 5, "EYIS-UJE45", "Claudio Silva", "Gasolina", "A", 110);
        Caminhao cam = new Caminhao("Ford", "Eletronic optimus 2000", "EUA", 230, 500, 500.600, 2, "LEI7-3885", "Robertão da Borracharia", 30, 1000);
        VeiculoTerrestre m1 = new Moto("Honda", "Honda Civic v3", "Japão", 60, 20, 20.000, 2, "PIUJ-73KL", "Armando Ruiz", "Honda","Preto Fosco");
        listaDeVeiculos.add(carro);
        listaDeVeiculos.add(cam);
        listaDeVeiculos.add(m1);
        
        VeiculoMaritimo n1 = new Navio("Harland and Wolff","White Star Line", "Titanic v2",14041912,"Irlanda",550, 600, 1000.000, 1500,"Titanic","James Cameron");
        VeiculoMaritimo sub2 = new Submarino("Beatles", "Beatles inc.", "Yellow Submarine v1", 45464664, "Inglaterra",100, 500, 350, 20.000, 4, 30.000,"Billy Eilish");
        listaDeVeiculos.add(n1);
        listaDeVeiculos.add(sub2);

        //Funções
        
        avi1.Info(); //antes compra
        avi1.compra(); //compra
        avi1.Info();//depois compra

        carro.Info(); //antes troca
        carro.emplacamento(tec); //troca placa
        carro.Info(); //depois troca

        cam.Info();
        cam.carga(500);
        cam.descarga(200, 300);

        sub2.deslocamento(100, 200);

        
    }
}
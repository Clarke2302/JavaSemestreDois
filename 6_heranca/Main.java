import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Deve se instanciar no minimo 1 objeto de cada classe. Todos devem estar no mesmo vetor ou lista.
        //Ao ser executado o programa escreve na tela as informações dos veiculos cadastrados.

        List<Veiculo> listaDeVeiculos = new ArrayList<>();

        //Terrestres

        VeiculoTerrestre cam = new Caminhao("Ford", "Ford KA 1.5 SE Flex", "EUA", 230, 500, 500.600, 2, "ELIS-7385", "Robertão da Borracharia", 30, 110);
        listaDeVeiculos.add(cam);
        VeiculoTerrestre carro = new Carro("Ford", "Ford KA 1.5 SE Flex", "EUA", 230, 500, 42.900, 5, "EYIS-UJE45", "Claudio Silva", "Gasolina", "A", 110);
        listaDeVeiculos.add(carro);
        VeiculoTerrestre moto = new Moto(null, null, null, 0, 0, 0, 0, null, null, null);
        //listaDeVeiculos.add(moto);

        //Marítimos

        VeiculoMaritimo sub = new Submarino(null, null, null, 0, null, 0, 0, 0, 0, 0, 0, 0);
        //listaDeVeiculos.add(sub);
        VeiculoMaritimo navio = new Navio(null, null, null, 0, null, 0, 0, 0, 0, 0, 0, 0, null);
        //listaDeVeiculos.add(navio);

        //Aéreos

        VeiculoAereo h1 = new Helicoptero(null, null, null, 0, null, 0, 0, 0, 0, 0, 0);
        //listaDeVeiculos.add(h1);
        VeiculoAereo av = new Aviao(null, null, null, 0, null, 0, 0, 0, 0, 0);
        //listaDeVeiculos.add(av);

        // Funções

        for(int i = 0; i<listaDeVeiculos.size();i++){
            System.out.println(listaDeVeiculos.get(i));
        }



    }
}
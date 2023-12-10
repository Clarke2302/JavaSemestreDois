import java.util.ArrayList;
import java.util.Comparator;

public class Vertice {
    //Cidades

    String nomeCidade;
    ArrayList<Vertice> vizinhanca; //vertice
    ArrayList<Aresta> conexoes; //aresta

    public Vertice(String nomeCidade){
        
        this.nomeCidade=nomeCidade;
    }

    public void infoVizinhos(ArrayList<Aresta> conexoes, String Cidade){
    
}

    public void infoConexoes(ArrayList<Aresta> conexoes,String Cidade){
        Vertice origem = null;
        for (Vertice vertice : vizinhanca) {
            if (vertice.getNomeCidade().equalsIgnoreCase(Cidade)) {
                origem = vertice;
                break;
            }
        }

        if (origem == null) {
            System.out.println("Cidade não encontrada.");
            return;
        }

    for (Aresta conexao : conexoes) {
        if (conexao.getCidade1().equals(origem) || conexao.getCidade2().equals(origem)) {
            conexoes.add(conexao);
        }
    }

    if (conexoes.isEmpty()) {
        System.out.println("Nenhuma cidade vizinha encontrada.");
        return;
    }

    ordenarConexoesPorDistancia(conexoes);

    System.out.println("Cidades vizinhas ordenadas por menor distância:");
        for (Aresta conexao : conexoes) {
            Vertice vizinho = conexao.getCidade1().equals(origem) ? conexao.getCidade2() : conexao.getCidade1();
            int distancia = conexao.getDistancia();
            System.out.println("- " + vizinho.getNomeCidade() + ": " + distancia + " km");
        }
    }
    public void infoVertice(){

    }

    private void ordenarConexoesPorDistancia(ArrayList<Aresta> conexoes) {
        conexoes.sort(Comparator.comparingInt(Aresta::getDistancia));
    }
    
    public String getNomeCidade() {
        return nomeCidade;
    }
}

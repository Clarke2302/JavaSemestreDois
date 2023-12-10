import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        Vertice ver = new Vertice(null);
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n1. Cadastrar cidade");
            System.out.println("2. Cadastrar conexão");
            System.out.println("3. Listar cidades");
            System.out.println("4. Listar conexões");
            System.out.println("5. Listar cidades vizinhas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    grafo.cadastraCidade(scanner);
                    break;
                case 2:
                    grafo.cadastraConexao(scanner);
                    break;
                case 3:
                    grafo.infoCidades();
                    break;
                case 4:
                    grafo.infoConexoes();
                    break;
                case 5:
                    System.out.print("Digite o nome da cidade: ");
                    String cidade = scanner.nextLine();
                    ver.infoVizinhas(cidade);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

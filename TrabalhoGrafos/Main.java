import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        Scanner tec = new Scanner(System.in);

        int tecla = 0;

        while(tecla != 7){

            mostrarMenu();
            tecla = tec.nextInt();

            if(tecla==1){
                
                grafo.cadastraCidade(tec);
            }
            if(tecla==2){
                
                grafo.cadastraConexoes(tec);
            }
            if(tecla==3){
                grafo.infoCidades();
                
            }
            if(tecla==4){
                grafo.infoConexoes();
                
            }
            if(tecla==5){
                grafo.infoCidadesVizinhas(tec);
                
            }
            if(tecla == 6){
                //
                Vertice ver = new Vertice("Toronto");
                Vertice ver2  = new Vertice("Alaska");
                Aresta ar = new Aresta(ver, ver2, 1200);
                //
                ar.infoAresta(ar);
            }

            if(tecla==7){
                System.out.println("\n"+"Você está saindo do sistema, volte sempre ! :) ");
                
            }

        }
        tec.close();
    }

    //Menu Função

    public static void mostrarMenu(){
        System.out.println("\n"
        +"--------------Bem Vindo ao Sistema-----------------"+"\n"
        +"1 - Cadastro de Cidades: "+"\n"
        +"2 - Cadastro de Conexões: "+"\n"
        +"3 - Mostrar Cidades: "+"\n"
        +"4 - Mostrar Conexões: "+"\n"
        +"5 - Mostrar Cidades Vizinhas: "+"\n"
        +"6 - Info Aresta: "+"\n"
        +"7 - Sair do Sistema: "+"\n"
        +"---------------------------------------------------"+"\n");
        System.out.printf("Digite: ");
    }
}

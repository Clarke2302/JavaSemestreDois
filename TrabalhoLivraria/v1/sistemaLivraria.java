import java.util.ArrayList;
import java.util.Scanner;
public class sistemaLivraria {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        ArrayList<Livro> livro = new ArrayList<>(); //Criando ArrayList de Livros Criados

        int tecla = 1;
        while (tecla != 0) {

            mostraMenu();

            tecla = tec.nextInt(); //Digite o valor da escolha no menu

            if (tecla == 1) { // Cadastrar Livros

                cadastrarLivros(livro, tec);
            }

            if (tecla == 2) {//Mostrar todos os livros disponíveis

                exibirLivros(livro);
            }
            if (tecla == 3) { //Buscar por Nome

                buscaLivrosNome(livro, tec);
            }

            if (tecla == 4) { // Buscar por área/gênero livro

                buscaPorArea(livro, tec);
            }

            if (tecla == 5) { // Buscar por preço máximo

                buscaPorPreco(livro, tec);
            }

            if (tecla == 6) { //Buscar por Quantidade em estoque de Livro

                buscaPorQuant(livro, tec);
            }
            if (tecla == 7) { //Ver Valor TOTAl em estoque de Livros

                valorTotalEmEstoque(livro);
            }
            if (tecla == 0) { //Sair Programa
                System.out.println("-----------------------------------------" + "\n");
                System.out.println("Você está saindo do programa.............");
            }

        }//while

    }//fim Main

    //--------------------------Funções Privadas--------------------------------------

    public static void mostraMenu(){
        System.out.println("\n"+"======================================"+"\n"+"1 - Cadastrar novo livro"+
                "\n"+"2 - Listar livros"+"\n"+"3 - Buscar livros por nome"+"\n"+"4 - Buscar livros por área/gênero"+
                "\n"+"5 - Buscar livros por preço"+"\n"+"6 - Busca por quantidade em estoque"+"\n"+"7 - Valor total no estoque"+
                "\n"+"0 - Encerrar atividades"+"\n"+"Digite: ");
    }
    //----------------------------1---------------------------------------------
    public static void cadastrarLivros(ArrayList<Livro> livro, Scanner tec ){
        System.out.printf("\n"+"Bem-Vindo ao cadastro de livros."+"\n"+"---------------------------------------------"+"\n");

        System.out.printf("\n"+"Digite o código do livro: ");
        int codigo = tec.nextInt();
        tec.nextLine(); //se tira dá problema (pula linha)

        System.out.printf("\n"+"Agora o Título/Nome do livro: ");
        String titulo = tec.nextLine();


        System.out.printf("\n"+"Digite a editora do livro: ");
        String editora = tec.nextLine();


        System.out.printf("\n"+"Digite qual o gênero ou área de estudo desse livro: ");
        String area = tec.nextLine();


        System.out.printf("\n"+"Digite o ano que o livro foi lançado: ");
        int ano = tec.nextInt();

        System.out.printf("\n"+"Digite o valor desse livro: ");
        double valor = tec.nextDouble();

        System.out.printf("\n"+"Digite a quantidade em estoque desse livro: ");
        int quantidadeEstoque = tec.nextInt();

        double valorEmEstoque = valor*quantidadeEstoque;

        Livro id = new Livro(titulo,codigo,editora,area,ano,valor,quantidadeEstoque,valorEmEstoque);
        livro.add(id);

        System.out.println("\n"+"----------------------------------------------------------"+"\n"+"Livro Cadastrado com sucesso!!!!");
    }
    //----------------------2----------------------------------------------------
    public static void exibirLivros(ArrayList<Livro>livro){
        for(Livro id : livro){
            System.out.println("------------------------------------"+"\n");
            System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));

        }
    }
    //----------------------3-------------------------------------------------
    public static void buscaLivrosNome(ArrayList<Livro>livro, Scanner tec){
        tec.nextLine(); //buffer

        System.out.println("\n"+"Qual o nome do livro que você deseja buscar: ");
        String livroPorNome = tec.nextLine().toLowerCase();

        for(Livro id : livro){ //funciona como um for normal --> roda todos os livros cadastrados pelo usuario ao mesmo tempo que vê o tamanho da ArrayList

            //(pega livros cadastrados e vê se algum livro da ArrayList é == ao nome digitado)

            if(id.getTitulo().toLowerCase().contains(livroPorNome)){ //vendo se caracteres digitados correspondem à algum livro do sistema
                System.out.println("\n"+"Achamos o livro que você está procurando..."+"\n");
                
                System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));
                //se sim mostra o livro de mesmo nome
                

            }
        }
        System.out.println("\n"+"Não encontramos esse livro, ele não está disponível em nosso site!");
    }



    //------------------------4-----------------------------
    public static void buscaPorArea(ArrayList<Livro>livro, Scanner tec){
        tec.nextLine(); //buffer

        System.out.println("Qual a categoria/gênero do livro que voce procura: ");
        String livroPorCat = tec.nextLine().toLowerCase();


        for(Livro id : livro){
            if(id.getArea().toLowerCase().contains(livroPorCat)){
                System.out.println("\n"+"Achamos o livro que você está procurando..."+"\n");
                
                System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));
            }else{
                System.out.println("\n"+"Não encontramos esse gênero/área de livro, ele não está disponível em nosso site!");
            }
        }
        
    }

    //---------------------5------------------------------
    public static void buscaPorPreco(ArrayList<Livro>livro, Scanner tec){
        System.out.println("Qual o valor do livro que você procura: ");
        double livroPorValorMax = tec.nextDouble();

        for(Livro id : livro){
            if(id.getValor() <= livroPorValorMax){
                System.out.println("\n"+"Esses são os livros com valores menores ou igual a : R$ "+String.format("%.2f",livroPorValorMax)+"\n");
                
                System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));
            }
        }
        
        System.out.println("\n"+"Não encontramos nenhum livro com esses valores!");
        
    }
    //------------------------6--------------------------
    public static void buscaPorQuant(ArrayList<Livro>livro, Scanner tec){
        System.out.println("Qual a quantidade no estoque de livros que você procura: ");
        int livroPorQuant = tec.nextInt();

        for(Livro id : livro){
            if(id.getQuantidadeEstoque() >= livroPorQuant){
                System.out.println("\n"+"Esses são os livros com estoque maior ou igual a: "+livroPorQuant+"\n");
                
                System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));
            }
        }
            System.out.println("\n"+"Não encontramos nenhum livro com esse estoque!");
    }
            
    //------------------------7----------------------------
    public static void valorTotalEmEstoque(ArrayList<Livro>livro){
        double total = 0;
        for(Livro id : livro){

            total += id.getValor()*id.getQuantidadeEstoque();
        }
        System.out.println("Valor total dos Livros em estoque: R$"+total);
    }


}



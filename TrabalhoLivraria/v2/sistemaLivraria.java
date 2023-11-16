
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class sistemaLivraria {
    public static void main(String[] args) throws Exception {
        FileInputStream arquivo = new FileInputStream("trabalho/arquivo.txt");//arquivo txt
        Scanner ler = new Scanner(arquivo);
        
        Scanner tec = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>(); //Criando ArrayList de Livros Criados

        int tecla = 1;
        while (tecla != 0) {

            mostraMenu();

            tecla = tec.nextInt(); //Digite o valor da escolha no menu

            if (tecla == 1) { // Cadastrar Livros

                cadastrarLivros(livros, tec);
            }

            if (tecla == 2) {//Mostrar todos os livros disponíveis

                exibirLivros(livros);
            }
            if (tecla == 3) { //Buscar por Nome

                buscaLivrosNome(livros, tec);
            }

            if (tecla == 4) { // Buscar por área/gênero livro

                buscaPorArea(livros, tec);
            }

            if (tecla == 5) { // Buscar por preço máximo

                buscaPorPreco(livros, tec);
            }

            if (tecla == 6) { //Buscar por Quantidade em estoque de Livro

                buscaPorQuant(livros, tec);
            }
            if (tecla == 7) { //Ver Valor TOTAl em estoque de Livros

                valorTotalEmEstoque(livros);
            }
            if(tecla == 8) {
                carregarEstoque(ler,livros);
            }
            if(tecla == 9){
                sistemaLivraria.atualizarArquivoEstoque(livros);
                    
                    if(escreverDeuCerto==true){
                        System.out.println("\n"+"Estoque Atualizado no Sistema!");
                    }else{
                        System.out.println("\n"+"Não Conseguimos atualizar o estoque!");
                    }
            }

            if (tecla == 0) { //Sair Programa
                System.out.println("-----------------------------------------" + "\n");
                System.out.println("Antes de sair, você deseja atualizar os arquivos do estoque?"+"\n"+"Se sim: digite 9"+"\n"+"Se não: digite 0");
                int tecx = tec.nextInt();

                if(tecx == 9){
                     //Ao encerrar o sistema
                    //(Opção 0 - Encerrar atividades) o usuário deve ser indagado se quer atualizar o arquivo
                    sistemaLivraria.atualizarArquivoEstoque(livros);

                        if(escreverDeuCerto==true){
                            System.out.println("Estoque Atualizado no Sistema!");
                        }else{
                            System.out.println("Não Conseguimos atualizar o estoque!");
                        }
                }
                if(tecx == 0){
                System.out.println("Você está saindo do programa.............");
                }
            }

        }//while

    }//fim Main

    //--------------------------Funções Privadas--------------------------------------

    public static void mostraMenu(){
        System.out.println("\n"+"======================================"+"\n"+"1 - Cadastrar novo livro"+
                "\n"+"2 - Listar livros"+"\n"+"3 - Buscar livros por nome"+"\n"+"4 - Buscar livros por área/gênero"+
                "\n"+"5 - Buscar livros por preço"+"\n"+"6 - Busca por quantidade em estoque"+"\n"+"7 - Valor total no estoque"+"\n"+"8 - Carregar Estoque"+"\n"+"9 - Atualizar Arquivo de estoque"+
                "\n"+"0 - Encerrar atividades"+"\n"+"Digite: ");
    }
    //----------------------------1---------------------------------------------
    public static void cadastrarLivros(ArrayList<Livro> livros, Scanner tec ){
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
        
        Livro id = new Livro(codigo,titulo,ano,area,editora,valor,quantidadeEstoque,valorEmEstoque);
        livros.add(id);

        System.out.println("\n"+"----------------------------------------------------------"+"\n"+"Livro Cadastrado com sucesso!!!!");
    }
    //----------------------2----------------------------------------------------
    public static void exibirLivros(ArrayList<Livro>livros){
        for(Livro id : livros){
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
    public static void buscaLivrosNome(ArrayList<Livro>livros, Scanner tec){
        tec.nextLine(); //buffer

        System.out.println("\n"+"Qual o nome do livro que você deseja buscar: ");
        String livroPorNome = tec.nextLine().toLowerCase();

        for(Livro id : livros){ //funciona como um for normal --> roda todos os livros cadastrados pelo usuario ao mesmo tempo que vê o tamanho da ArrayList

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
    public static void buscaPorArea(ArrayList<Livro>livros, Scanner tec){
        tec.nextLine(); //buffer

        System.out.println("Qual a categoria/gênero do livro que voce procura: ");
        String livroPorCat = tec.nextLine().toLowerCase();


        for(Livro id : livros){
            if(id.getArea().toLowerCase().contains(livroPorCat)){
                System.out.println("\n"+"Achamos o livro que você está procurando..."+"\n");
                
                System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));
            }
        }
            System.out.println("\n"+"Não encontramos esse gênero/área de livro, ele não está disponível em nosso site!");
    }

    //---------------------5------------------------------
    public static void buscaPorPreco(ArrayList<Livro>livros, Scanner tec){
        System.out.println("Qual o valor do livro que você procura: ");
        double livroPorValorMax = tec.nextDouble();

        for(Livro id : livros){
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
    public static void buscaPorQuant(ArrayList<Livro>livros, Scanner tec){
        System.out.println("Qual a quantidade no estoque de livros que você procura: ");
        int livroPorQuant = tec.nextInt();

        for(Livro id : livros){
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
    public static void valorTotalEmEstoque(ArrayList<Livro>livros){
        double total = 0;
        for(Livro id : livros){

            total += id.getValor()*id.getQuantidadeEstoque();
        }
        System.out.println("Valor total dos Livros em estoque: R$"+total);
    }

    //----------------------8-------------------------------
    public static void carregarEstoque(Scanner ler,ArrayList<Livro> livros)throws Exception {
        //colocar livros cadastrados no arquivo txt
        

        System.out.println("\n"+"Preparando o carregamento dos livros....."+"\n");

        while(ler.hasNext()){
        
            String linha = ler.nextLine();

            if(linha!= null && !linha.isEmpty()){

            String [] SplitLinha = linha.split(",");

            double valorEmEstoque = Double.parseDouble(SplitLinha[5])*Integer.parseInt(SplitLinha[6]);

            String valorEmEstoquePString = Double.toString(valorEmEstoque);

            SplitLinha[7] = valorEmEstoquePString;

            Livro livro1 = new Livro (Integer.parseInt(SplitLinha[0]),SplitLinha[1],Integer.parseInt(SplitLinha[2]),SplitLinha[3],SplitLinha[4],
            Double.parseDouble(SplitLinha[5]),Integer.parseInt(SplitLinha[6]),Double.parseDouble(SplitLinha[7]));

            livros.add(livro1); //colocando livros na ArrayList

            }
            
            
        }
        System.out.println("======================================"+"\n"+"Todos os livros foram carregados!");
        //System.out.println(livro);
    }

    static boolean escreverDeuCerto;

    //----------------------9-----------------------------
    public static void atualizarArquivoEstoque(ArrayList<Livro> livros)throws Exception{
        //Outra solicitação do cliente é que todas as modificações feitas através do sistema sejam guardadas novamente no arquivo txt.
        // Tal ação deve ocorrer através de uma opção no menu (Opção 9 - Atualizar arquivo de estoque).
        FileWriter arq = new FileWriter("trabalho/arquivo.txt");//arquivo txt

        try{

        for(Livro coloca: livros){ //37282829,Tomates Verdes Fritos,1967,Ficcao Historica,Globo Filmes,48.90,5
                arq.write(coloca.getCodigo() + "," + coloca.getTitulo() + "," + coloca.getAno() + "," + coloca.getArea() + "," + coloca.getEditora() + "," + coloca.getValor() + "," + coloca.getQuantidadeEstoque() + ","+ coloca.getValorEmEstoque()+ "\n");
                escreverDeuCerto = true;
                
        }

        }catch(IOException e){
            System.out.println(e.getMessage());
            escreverDeuCerto = false;
        }
        arq.close();
    }


}



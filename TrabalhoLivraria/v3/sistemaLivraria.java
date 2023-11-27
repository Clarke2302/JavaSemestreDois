
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class sistemaLivraria {
    public static void main(String[] args) throws Exception {
        
        Scanner tec = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>(); //ArrayList de Livros
        ArrayList<Filial> filiais = new ArrayList<>(); //Criando ArrayList de Filiais

        int tecla = 1;
        while (tecla != 0) {

            mostraMenu();

            tecla = tec.nextInt(); //Digite o valor da escolha no menu

            if(tecla == 1){ //Cadastrar Filiais
                
                cadastrarFilial(filiais, tec);

            }

            if (tecla == 2) { // Cadastrar Livros

                cadastrarLivros(livros,filiais, tec);
            }

            if (tecla == 3) {//Mostrar todos os livros disponíveis

                exibirLivros(livros);
            }
            if (tecla == 4) { //Buscar por Nome

                buscaLivrosNome(livros,filiais, tec);
            }

            if (tecla == 5) { // Buscar por área/gênero livro

                buscaPorArea(livros,filiais, tec);
            }

            if (tecla == 6) { // Buscar por preço máximo

                buscaPorPreco(livros,filiais, tec);
            }

            if (tecla == 7) { //Buscar por Quantidade em estoque de Livro

                buscaPorQuant(livros,filiais, tec);
            }
            if( tecla == 8){

                buscaPorCodigo(livros,filiais,tec);
            }
            if (tecla == 9) { //Ver Valor TOTAl em estoque de Livros

                valorTotalEmEstoque(livros);
            }
            if( tecla == 10){ //Listar estoque de Filial específica

                listagemEstoque(filiais,tec); //erro
            }
            if(tecla == 11) {
                carregarEstoque(livros, filiais);
            }
            if(tecla == 12){
                sistemaLivraria.atualizarArquivoEstoque(livros,filiais);
                    
                    if(escreverDeuCerto==true){
                        System.out.println("\n"+"Estoque Atualizado no Sistema!");
                    }else{
                        System.out.println("\n"+"Não Conseguimos atualizar o estoque!");
                    }
            }

            if (tecla == 0) { //Sair Programa
                System.out.println("-----------------------------------------" + "\n");
                System.out.println("Antes de sair, você deseja atualizar os arquivos do estoque?"+"\n"+"Se sim: digite 12"+"\n"+"Se não: digite 0");
                int tecx = tec.nextInt();

                if(tecx == 12){
                     //Ao encerrar o sistema
                    //(Opção 0 - Encerrar atividades) o usuário deve ser indagado se quer atualizar o arquivo
                    sistemaLivraria.atualizarArquivoEstoque(livros,filiais);

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

    //--------------------------Funções--------------------------------------

    public static void mostraMenu(){
        System.out.println("\n"+"======================================"+"\n"
                +"1 - Cadastrar Filial "+"\n"
                +"2 - Cadastrar novo livro"+"\n"
                +"3 - Listar livros"+"\n"
                +"4 - Buscar livros por nome"+"\n"
                +"5 - Buscar livros por área/gênero"+"\n"
                +"6 - Buscar livros por preço"+"\n"
                +"7 - Busca por quantidade em estoque"+"\n"
                +"8 - Buscar livros por código"+"\n"
                +"9 - Valor total no estoque"+"\n"
                +"10 - Listagem de Estoque"+"\n"
                +"11 - Carregar Estoque"+"\n"
                +"12 - Atualizar Arquivo de estoque"+"\n"
                +"0 - Encerrar atividades"+"\n"+"Digite: ");
    }
    //------------------1-----------------------------
    public static void cadastrarFilial(ArrayList<Filial> filiais, Scanner tec){
        
        System.out.println("\n"+"Digite um código para esta Filial");
        int code = tec.nextInt();

        if(code<100){
            for(Filial fi : filiais ){
                if(code == fi.getCodigo()){
                    System.out.println("\n"+"Esse código é igual ao de outra filial, digite um código diferente!");
                    
                }
            }
            tec.nextLine(); //buffer
                System.out.println("\n"+"Digite o nome dessa filial:");
                String nomeF = tec.nextLine();
                
                System.out.println("\n"+"Digite o endereço da filial:");
                String enderecoDig = tec.nextLine();

                System.out.println("\n"+"Digite o telefone dessa filial:");
                String cont = tec.nextLine();
                

                Filial fifi = new Filial(code, nomeF, enderecoDig, cont);
                filiais.add(fifi);
                
                System.out.println("\n"+"Filial Cadastrada com sucesso!");
                
            }else if(code>99){ //maior que 2 dígitos
            System.out.println("\n"+"Digite um codigo com 2 dígitos!");
            
        }
    }

    //----------------------------2---------------------------------------------
    public static void cadastrarLivros(ArrayList<Livro> livros,ArrayList<Filial>filiais, Scanner tec ) throws Exception{
        System.out.printf("\n"+"Bem-Vindo ao cadastro de livros."+"\n"+"---------------------------------------------"+"\n");

        System.out.println("Primeiramente digite o código (2 dígitos) da Filial onde você quer cadastrar o livro:");
        int codFilialDig = tec.nextInt();
        
        Filial filial = null;
    
        for (Filial f : filiais) {
            if (f.getCodigo() == codFilialDig) {
                filial = f;
                break;
            }
        }
            if(filial == null){
                System.out.println("\n"+"Não existem filiais cadastradas, por favor cadastre alguma!");
                cadastrarFilial(filiais, tec);
                filial = filiais.get(filiais.size()-1);
            }

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
            
            Livro id = new Livro(codigo,titulo,ano,area,editora,valor,quantidadeEstoque,valorEmEstoque, filial);
            livros.add(id);
            filial.adicionarLivroEstoque(id);

            System.out.println("\n"+"----------------------------------------------------------"+"\n"+"Livro Cadastrado com sucesso!!!!");
            
        }
    
    //----------------------3----------------------------------------------------
    public static void exibirLivros(ArrayList<Livro>livros){
        for(Livro id : livros){
            System.out.println("------------------------------------"+"\n");
            System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()+"\n"));
                    

        }
    }
    //----------------------4-------------------------------------------------
    public static void buscaLivrosNome(ArrayList<Livro>livros, ArrayList<Filial> filiais, Scanner tec){
    
        System.out.println("Digite o código da Filial a ser buscado o livro:");
        int filialCodigo = tec.nextInt();

        Filial filial = procurarFilialCadastrada(filiais, filialCodigo);
        tec.nextLine();
        
        System.out.println("\n"+"Qual o nome do livro que você deseja buscar: ");
        String livroPorNome = tec.nextLine().toLowerCase();
        boolean encontrei = false;

        for(Livro id : filial.getLivrosEmEstoque()){ //funciona como um for normal --> roda todos os livros cadastrados pelo usuario ao mesmo tempo que vê o tamanho da ArrayList

            //(pega livros cadastrados e vê se algum livro da ArrayList é == ao nome digitado)

            if(id.getTitulo().toLowerCase().contains(livroPorNome)){ //vendo se caracteres digitados correspondem à algum livro do sistema
                System.out.println("\n"+"Achamos o livro que você está procurando..."+"\n"+"Filial "+filial.getCodigo()+"\n");
                
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
        if(encontrei = false){
        
        System.out.println("\n"+"Não encontramos esse livro, ele não está disponível em nossas filiais!");
        }
        
    }



    //------------------------5-----------------------------
    public static void buscaPorArea(ArrayList<Livro>livros, ArrayList<Filial> filiais, Scanner tec){
        tec.nextLine(); //buffer

        System.out.println("Digite o código da Filial a ser buscado o livro:");
        int filialCodigo = tec.nextInt();

        Filial filial = procurarFilialCadastrada(filiais, filialCodigo);

        tec.nextLine(); //buffer

        System.out.println("Qual a categoria/gênero do livro que voce procura: ");
        String livroPorCat = tec.nextLine().toLowerCase();
        boolean encontrei = false;

        for(Livro id : filial.getLivrosEmEstoque()){
            if(id.getArea().toLowerCase().contains(livroPorCat)){
                System.out.println("\n"+"Achamos o livro que você está procurando..."+"\n"+"Filial "+filial.getCodigo()+"\n");
                
                System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));
            }
        }
        if(encontrei = false){
        
        System.out.println("\n"+"Não encontramos esse gênero/área de livro, ele não está disponível em nosso site!");
        }
        
    }

    //---------------------6------------------------------
    public static void buscaPorPreco(ArrayList<Livro>livros, ArrayList<Filial> filiais, Scanner tec){
        System.out.println("Digite o código da Filial a ser buscado o livro:");
        int filialCodigo = tec.nextInt();

        Filial filial = procurarFilialCadastrada(filiais, filialCodigo);

        System.out.println("Qual o valor do livro que você procura: ");
        double livroPorValorMax = tec.nextDouble();
        boolean encontrei = false;
        for(Livro id : filial.getLivrosEmEstoque()){
            if(id.getValor() <= livroPorValorMax){
                System.out.println("\n"+"Filial "+filial.getCodigo()+"\n"+"Esses são os livros com valores até ou iguais a : R$ "+String.format("%.2f",livroPorValorMax)+"\n");
                
                System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));
                    encontrei = true;
            }
        }
        if(encontrei = false){
        
        System.out.println("\n"+"Não encontramos nenhum livro com esses valores!");
        }
        
    }
    //------------------------7--------------------------
    public static void buscaPorQuant(ArrayList<Livro>livros, ArrayList<Filial> filiais, Scanner tec){
        System.out.println("Digite o código da Filial a ser buscado o livro:");
        int filialCodigo = tec.nextInt();

        Filial filial = procurarFilialCadastrada(filiais, filialCodigo);

        System.out.println("Qual a quantidade no estoque de livros que você procura: ");
        int livroPorQuant = tec.nextInt();
        boolean encontrei = false;
        for(Livro id : filial.getLivrosEmEstoque()){
            if(id.getQuantidadeEstoque() >= livroPorQuant){
                System.out.println("\n"+"Filial "+filial.getCodigo()+"\n"+"Esses são os livros com estoque maior ou igual a: "+livroPorQuant+"\n");
                
                System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));
            }
        }
        if(encontrei = false){
        
        System.out.println("\n"+"Não encontramos nenhum livro com esse estoque!");
        }
            
    }
    //------------------------8-------------------------------

    public static void buscaPorCodigo(ArrayList<Livro> livros, ArrayList<Filial> filiais, Scanner tec) {

        System.out.print("\n"+"Digite o código do livro: ");
        int codigoLivro = tec.nextInt();
        
    
        boolean encontrouLivro = false;
        double valorTotalEstoque = 0.0;
    
        for (Filial filial : filiais) {
            if (filial.getNomeFilial().toLowerCase().contains("filial")){
            for (Livro id : filial.getLivrosEmEstoque()) {
                if (id.getCodigo() == codigoLivro) {
                    if(!encontrouLivro){
                    System.out.println("\n"+">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno());
                    encontrouLivro = true;
                    }
                    System.out.println("Valor: R$ "+String.format("%.2f", +id.getValor())+" >>> "
                    +filial.getNomeFilial()+", estoque: "+id.getQuantidadeEstoque()+" unidades");
                    
                    valorTotalEstoque += id.getValorEmEstoque();
    
                }
            }
        }else{
            for (Livro id : filial.getLivrosEmEstoque()) {
                if (id.getCodigo() == codigoLivro) {
                    if(!encontrouLivro){
                    System.out.println("\n"+">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno());
                    encontrouLivro = true;
                    }
                    System.out.println("Valor: R$ "+String.format("%.2f", +id.getValor())+" >>> Filial "
                    +filial.getNomeFilial()+", estoque: "+id.getQuantidadeEstoque()+" unidades");
                    
                    valorTotalEstoque += id.getValorEmEstoque();
    
                }
            }
        }
    }
    
        if (encontrouLivro) {
            System.out.printf("Valor total em estoque: R$"+String.format("%.2f", valorTotalEstoque));
        } else {
            System.out.println("Nenhum livro encontrado com o código " + codigoLivro + ".");
        }
    }
            
    //------------------------9----------------------------
    public static void valorTotalEmEstoque(ArrayList<Livro>livros){
        double total = 0;

        if(livros.isEmpty()){
            System.out.println("\n"+"Nenhum livro cadastrado!"+"\n");
        }else{
        for(Livro id : livros){

            total += id.getValor()*id.getQuantidadeEstoque();
        }
    System.out.printf("Valor total em estoque: R$"+String.format("%.2f", total));
    }
}

    //----------------------10----------------------------
    public static void listagemEstoque(ArrayList<Filial> filiais, Scanner tec){
        System.out.println("\n"+"Digite o código da Filial:");
        int filialCodigo = tec.nextInt();

        Filial filial = procurarFilialCadastrada(filiais, filialCodigo);
    
        if (filial == null) {
            System.out.println("Filial com o código " + filialCodigo + " não foi encontrada.");
            return;
        }
        if (filial.getNomeFilial().toLowerCase().contains("filial")){
        System.out.println("\n"+"Listagem de Estoque na " + filial.getNomeFilial()+"\n"
                            +"=========================================="+"\n");
        for (Livro id : filial.getLivrosEmEstoque()) {
            System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()+"\n"));
        }
    
        double valorTotalFilial = calcularValorTotalEstoqueFilial(filial.getLivrosEmEstoque(), filialCodigo);
        System.out.printf("Valor total do estoque da Filial %s: R$%.2f\n", filialCodigo, valorTotalFilial); //erro

    }else{
        System.out.println("\n"+"Listagem de Estoque na Filial " + filial.getNomeFilial()+"\n"
                            +"=========================================="+"\n");
        for (Livro id : filial.getLivrosEmEstoque()) {
            System.out.println(">>>>>>>Cod#"+id.getCodigo()+"\n"+
                    "Titulo/Editora: "+id.getTitulo()+"/"+id.getEditora()+
                    "\n"+"Categoria: "+id.getArea()+"\n"+
                    "Ano: "+id.getAno()+"\n"+
                    "Valor: R$ "+String.format("%.2f", +id.getValor())+"\n"+
                    "Estoque: "+id.getQuantidadeEstoque()+" unidades"+"\n"+
                    "Valor total em estoque: R$ "+String.format("%.2f",+id.getValorEmEstoque()));
        }
    
        double valorTotalFilial = calcularValorTotalEstoqueFilial(filial.getLivrosEmEstoque(), filialCodigo);
        System.out.printf("Valor total do estoque da Filial %s: R$%.2f\n", filialCodigo, valorTotalFilial); //erro

    }
}

    //----------------------11-------------------------------
    public static void carregarEstoque(ArrayList<Livro> livros,ArrayList<Filial> filiais)throws Exception {
        //colocar livros cadastrados no arquivo txt

        System.out.println("\n"+"Preparando o carregamento dos livros....."+"\n");

        try {
            FileInputStream arquivo = new FileInputStream("arquivo.txt");//arquivo txt
            Scanner ler = new Scanner(arquivo);
            System.out.println("\n"+"O estoque foi carregado com sucesso!");
            //ler.close();
            
        } catch (Exception e) {
            System.out.println("\n"+"Erro ao carregar o estoque.");
            e.printStackTrace();
            return;
        }

        FileInputStream arquivo = new FileInputStream("arquivo.txt");
        Scanner ler = new Scanner(arquivo);

        //String antesCod = "#FL";
        //String reais = "R$";

            while(ler.hasNext()){ //carregar Filial ---> 4 linhas

                String linha = ler.nextLine();

                if(linha!= null && !linha.isEmpty()){
                
                String [] SplitLinha = linha.split(",");
        
                String nomeFilial = SplitLinha[0].replace("#FL", ""); //só o código/numero da filial
                int codFilial = Integer.parseInt(nomeFilial); //passando para int

                Filial fifi = procurarFilialCadastrada(filiais, codFilial);
                
                //String nomeFilial = SplitLinha[1]; //String enderecoFilial = SplitLinha[2]; String contatoFilial = SplitLinha[3];
                
                if(fifi == null){
                
                fifi = new Filial (codFilial, SplitLinha[1], SplitLinha[2], SplitLinha[3]);
                filiais.add(fifi);
                }


            while(ler.hasNext()){ //carregar livro ----> 7 linhas  //mudei pra line = antigo --> ler.hasNextLine

                linha = ler.nextLine();
                
                if(linha!= null && !linha.isEmpty()){

                SplitLinha = linha.split(",");

                String comRS = SplitLinha[5].replace("R$",""); //erro
                
                double valorSemRS = Double.parseDouble(comRS);

                double valorEmEstoque = Double.parseDouble(comRS)*Integer.parseInt(SplitLinha[6]);
        
                
                //        0           1         2        3            4                 5               6                       7                   8
                //int codigo, String titulo, int ano,String area,String editora, double valor, int quantidadeEstoque, double valorEmEstoque, Filial filialCadastrada
                Livro livro1 = new Livro (Integer.parseInt(SplitLinha[0]),SplitLinha[1],Integer.parseInt(SplitLinha[2]),SplitLinha[3],SplitLinha[4],
                valorSemRS,Integer.parseInt(SplitLinha[6]),valorEmEstoque,fifi);

                livros.add(livro1); //colocando livros na ArrayList
                fifi.adicionarLivroEstoque(livro1);

                }
                
            }
        }
    }
        ler.close();
        
    }

    static boolean escreverDeuCerto;

    //----------------------12-----------------------------
    public static void atualizarArquivoEstoque(ArrayList<Livro> livros,ArrayList<Filial> filiais)throws Exception{
        //Outra solicitação do cliente é que todas as modificações feitas através do sistema sejam guardadas novamente no arquivo txt.
        // Tal ação deve ocorrer através de uma opção no menu (Opção 9 - Atualizar arquivo de estoque).
        FileWriter arq = new FileWriter("arquivo.txt");//arquivo txt
            
        String antesCod = "#FL";
        String reais = "R$";

            for (Filial filial : filiais) {
                arq.write(antesCod+filial.getCodigo() + ","+ filial.getNomeFilial() + ","+ filial.getEndereco() + ","+ filial.getContato() + "\n");

            try{
            
                for(Livro coloca: livros){
                    arq.write(coloca.getCodigo() + "," + coloca.getTitulo() + "," + coloca.getAno() + "," + coloca.getArea() + "," + coloca.getEditora() + "," +reais+coloca.getValor() + "," + coloca.getQuantidadeEstoque() + "\n");
                    escreverDeuCerto = true;
                    
            }

            }catch(IOException e){
                System.out.println(e.getMessage());
                escreverDeuCerto = false;
            }
        }
        arq.close();
    }
    // ------------------Acha Filial----------------------
    public static Filial procurarFilialCadastrada(ArrayList<Filial> filiais, int codFilialDig) {
        for(Filial filial : filiais){
            if(filial.getCodigo() == codFilialDig ||filial.getCodigoString() == String.valueOf(codFilialDig)){
        
                return filial;
            }
        }
        return null;
    }

    //------------------Calcula Valor de Estoque em Filial---------------
    public static double calcularValorTotalEstoqueFilial(ArrayList<Livro> livros, int filialCodigo) {
        double total = 0.0;
    
        for (Livro livro : livros) {
            if (livro.getFilialCadastrada().getCodigoString().equals(filialCodigo)) {
                total += livro.getValorEmEstoque();
            }
        }
    
        return total;
    }
    


}



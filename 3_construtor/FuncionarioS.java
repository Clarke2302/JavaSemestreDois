public class FuncionarioS {
    
    private String nome ;
    private int idade ;
    private double altura ;

/////
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome=nome;
}
public int getIdade(){
    return idade;
}
public void setIdade(int idade){
    this.idade =idade;
}
public double getAltura(){
    return  altura;
}
public void setAltura(double altura){
    this.altura=altura;
}
//////

public static void main (String[]args){

    FuncionarioS f1 = new FuncionarioS();
    f1.setNome("José Durval");
    f1.setIdade(68);
    f1.setAltura(1.70);

    System.out.println("-------------------------------------"+"\n");
    System.out.println("Dados do Funcionário:"+"\n");
    System.out.println("Nome: "+f1.getNome()+"\n"+"Idade: "+f1.getIdade()+" anos"+"\n"+"Altura: "+f1.getAltura()+"0"+"\n");
    System.out.println("-------------------------------------");


    }
}

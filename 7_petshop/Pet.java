import java.util.ArrayList;

public class Pet{

String especie, raca, nome;
int idade;
ArrayList<Tutor> meuDono;


    public Pet(String nome, String especie, String raca, int idade, ArrayList<Tutor>meuDono){
        this.nome=nome;
        this.especie=especie;
        this.raca=raca;
        this.idade=idade;
        this.meuDono= new ArrayList<>();
    }

    public void info_pet(){

    }

    public void info_tutores(){
        
    }

}
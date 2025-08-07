
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayString {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

       // String[] nomes1 = {"leandro"};

        nomes.add("davidson");
        nomes.add("ana");
        nomes.add("lúcia");
        nomes.add("Abel");


        Collections.sort(nomes);


//        System.out.println(nomes1[0]);
//        System.out.println(nomes.get(0));
//        System.out.println(nomes.get(1)+ " " + nomes.get(2));

        for(String nome: nomes){
            System.out.println(nome);
        }



    }
}

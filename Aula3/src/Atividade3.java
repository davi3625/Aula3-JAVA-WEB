import java.util.ArrayList;
import java.util.Collections;

public class Atividade3 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        Collections.sort(numeros);

        for(Integer numero: numeros){
            System.out.println(numero);
        }







    }
}

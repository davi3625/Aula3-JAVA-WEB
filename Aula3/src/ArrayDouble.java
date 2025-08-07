import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayDouble {

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        notas.add(5.0); //notas(o)
        notas.add(5.0);
        notas.add(5.0);
        notas.add(5.0);

        // ordenadas as notas
        Collections.sort(notas);

        System.out.println("\nNotas ordenadas");
        for(Double nota: notas){
            System.out.println(nota);
        }

        double soma = 0;
        for (Double nota : notas){
            soma += nota;
        }

        System.out.println("\nSoma das notas: " + soma);

        double media = soma / notas.size();
        System.out.println("\n Media final " + String.format("%.1f", media));

        if (media >= 7) {
            System.out.println("Você esta Aprovado :)");
        }else if (media>= 5) {
            System.out.println("Voce esta em Recuperação :! ");
        }else{
            System.out.println("Você esta Reprovado   :(");
        }






    }
}

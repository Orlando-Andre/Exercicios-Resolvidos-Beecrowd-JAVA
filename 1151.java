import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        int i, n, soma, penultimo = 1, antepenultimo = 0;
        n = input.nextInt();
        for (i = 1; i <= n; i = i + 1) {
            if(i == n){
                System.out.println(antepenultimo);
            }
            else{
                System.out.print(antepenultimo + " ");
                soma = antepenultimo + penultimo;
                antepenultimo = penultimo;
                penultimo = soma;
            }
        }
        input.close();
    }
}

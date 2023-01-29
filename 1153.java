import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        int i, n, multiplicacao = 1;
        n = input.nextInt();
        for(i = n; i >= 1; i = i - 1){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
        input.close();
    }
}

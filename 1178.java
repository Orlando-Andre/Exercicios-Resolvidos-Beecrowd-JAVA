import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        final int TAM = 100;
        double[] N = new double[TAM];
        int i; 
        double X;
        X=input.nextDouble();
        N[0] = X;
        for(i = 1 ; i < TAM - 1; i++){
            X = X/2.0;
            N[i] = X;
        }
        for(i = 0; i < TAM; i++){
            System.out.printf("N[%d] = %.4f\n", i , N[i]);
        }   
        input.close();
    }
}
 
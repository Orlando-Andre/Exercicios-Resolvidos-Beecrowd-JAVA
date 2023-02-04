import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        final int TAM = 100;
        float[] A = new float[TAM];
        int i;
        for(i = 0 ; i < TAM; i++){
            A[i] = input.nextFloat();
        }
        for(i = 0; i < TAM; i++){
            if(A[i] <= 10){
                System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }
        input.close();
    }
}
 
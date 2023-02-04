import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TAM = 20;
        int[] N = new int[TAM];
        int i;
        for(i = TAM - 1 ; i >= 0; i--){
            N[i] = input.nextInt();
        }
        for(i = 0; i < TAM; i++){
            System.out.printf("N[%d] = %d\n", i , N[i]);
        } 
        input.close();
    }
}
 
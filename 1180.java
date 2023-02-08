import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, menor, posicao;
        N = input.nextInt();
        int[] X = new int[N];
        int i; 
        for(i = 0 ; i < N; i++){
            X[i] = input.nextInt();
            
        }
        menor = X[0];
        posicao = 0;
        for(i = 1; i < N; i++){
            if(X[i] < menor){
                menor = X[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
        input.close();
    }
}
 
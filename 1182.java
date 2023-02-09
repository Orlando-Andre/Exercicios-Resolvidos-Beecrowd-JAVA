import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        float [][] A = new float [12][12];
        float soma = 0.0f, media;
        int colunaOp;
        char operação;
        colunaOp = input.nextInt();
        operação = input.next().charAt(0);
        for(int i = 0 ; i < 12; i++){
            for(int j = 0 ; j < 12 ; j++){
                A[i][j] = input.nextFloat();
                if(j == colunaOp){
                    soma = soma + A[i][j];
                }
            }
        }
        if(operação == 'S'){
            System.out.printf("%.1f\n",soma );
        }
        else{
            media = (float)(soma/12);
            System.out.printf("%.1f\n", media);
        }
        input.close();
    }
}
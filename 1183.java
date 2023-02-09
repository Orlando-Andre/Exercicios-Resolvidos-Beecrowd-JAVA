import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        float [][] A = new float [12][12];
        float soma = 0.0f, media, cont = 0.0f;
        char operação;
        operação = input.next().charAt(0);
        for(int i = 0 ; i < 12; i++){
            for(int j = 0 ; j < 12 ; j++){
                A[i][j] = input.nextFloat();
            }
        }
        for(int i = 0 ; i < 12-1; i++){
            for(int j = i+1 ; j < 12 ; j++){
                soma = soma + A[i][j];
                cont++;
            }
        }
        if(operação == 'S'){
            System.out.printf("%.1f\n",soma );
        }
        else{
            media = (float)(soma/cont);
            System.out.printf("%.1f\n", media);
        }
        input.close();
    }
}


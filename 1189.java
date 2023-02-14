import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        double [][] A = new double [12][12];
        double soma = 0.0, media = 0.0;
        double cont = 0.0;
        char operação;
        int x = 0;
        operação = input.next().charAt(0);
        for(int i = 0 ; i < 12; i++){
            for(int j = 0 ; j < 12 ; j++){
                A[i][j] = input.nextDouble();
            }
        }
        for(int j = 0 ; j < 5 ; j++){
            x++;
            for(int i = x ; i < 12 - x; i++){
                soma = soma + A[i][j];
                cont++;
            }
        }
        if(operação == 'S'){
            System.out.printf("%.1f\n",soma );
        }
        else{
            media =soma/cont;
            System.out.printf("%.1f\n", media);
        }
        input.close();
    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int i;
        double S = 1;
        for(i = 2; i <= 100; i = i + 1){
            S = S + 1.00 / i;
        }
        System.out.printf("%.2f\n",S);
        input.close();
    }
}

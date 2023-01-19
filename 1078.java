import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int n, i, tabuada;
        n = input.nextInt();
        tabuada = 0;
        for( i = 1; i <= 10 ; i = i + 1){
            tabuada = i * n;
            System.out.println(i + " x " + n + " = "+ tabuada);
        }
        input.close();
    }
}

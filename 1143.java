import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int n, i, quadrado, cubo;
        n = input.nextInt();
        for(i = 1; i <= n ; i = i + 1){
            quadrado = i * i;
            cubo = i * i * i;
            System.out.println(i +  " "+quadrado + " "+ cubo);
        }
        input.close();
    }
}

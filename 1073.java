import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i , n , quadrado;
        n = input.nextInt();
        for( i = 1 ; i <= n; i = i + 1 ){
            if( i % 2 == 0){
                quadrado = i * i;
                System.out.println(i + "^" + 2 + " = " + quadrado);
            }
        }
        input.close();
    }
}

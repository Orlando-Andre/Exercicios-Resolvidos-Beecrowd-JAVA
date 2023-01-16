import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  N;
        int pares = 0 ;
        for(int i = 0; i < 5; i++){
            N = input.nextInt();
            if(N % 2 == 0){
                pares++;
            }
        }
        System.out.printf("%d valores pares\n", pares);
        input.close();
    }
}
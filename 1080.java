import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int i, n, maior = 0, posicao = 0;
        for(i = 1; i <= 100; i = i + 1){
            n = input.nextInt();
            if(n > maior){
                maior = n;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        input.close();
    }
}

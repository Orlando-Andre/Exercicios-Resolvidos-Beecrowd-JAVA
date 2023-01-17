import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        N = input.nextInt();
        if(N % 2 == 0){
            N = N + 1;
        }
        for(int i =  0; i < 6; i++){
            System.out.println(N);
            N = N + 2;
        }
        input.close();
    }
}
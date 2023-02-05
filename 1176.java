import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        int t, x, i, j;

        t = input.nextInt();
        for (i = 0; i < t; i++) {
           x = input.nextInt();
           long[] Fib = new long[x+1];
           if(x == 0){
                Fib[0] = 0;
                System.out.printf("Fib(%d) = %d\n",x,Fib[x]);
            }
            else{
                if(x==1){
                    Fib[0] = 0;
                    Fib[1] =1;
                System.out.printf("Fib(%d) = %d\n",x,Fib[x]);
                }
                else{
                    Fib[0] = 0;
                    Fib[1] = 1;
                    for(j = 2 ; j < x+1; j++){
                        Fib[j]= Fib[j-1] + Fib[j - 2];
                    }
                    System.out.printf("Fib(%d) = %d\n",x,Fib[x]);
                }
            }
        }
        input.close();
    }
}

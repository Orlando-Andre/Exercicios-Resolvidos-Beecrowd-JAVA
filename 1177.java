import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N[] = new int[1000], T, X, i;
        T = input.nextInt();
        for( i= 0, X = 0; i <1000 && X <= T-1; i++, X++){
            N[i] = X;
            if(X == T-1){
                X = -1;
            }
            System.out.printf("N[%d] = %d\n",i,N[i]);
        }
        
    }
}
 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X[] = new int[10];
        for(int i=0; i <10; i++){
            X[i] = input.nextInt();
            if(X[i] <= 0){
                X[i] = 1;
            }
            System.out.printf("X[%d] = %d\n",i,X[i]);
        }
        input.close();
    }
}
 
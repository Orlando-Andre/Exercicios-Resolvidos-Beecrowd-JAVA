import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int i,n;
        n = input.nextInt();
        for(i = 1; i <= 10000; i = i + 1){
            if(i % n == 2){
            System.out.println(i);
            }  
        }
        input.close();
    }
}

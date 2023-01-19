import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int i, n, x;
        n = input.nextInt();
        for(i = 1; i <= n; i = i + 1){
            x = input.nextInt();
            if(x==0){
                System.out.println("NULL");
            }
            else{
                if(x % 2 == 0){
                    if(x>0){
                        System.out.println("EVEN POSITIVE");
                    }
                    else{
                        System.out.println("EVEN NEGATIVE");
                    }
                }
                else{
                    if(x>0){
                        System.out.println("ODD POSITIVE");
                    }
                    else{
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }
        }
        input.close();
    }
}

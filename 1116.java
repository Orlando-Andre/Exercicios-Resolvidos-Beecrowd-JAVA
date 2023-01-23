import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        int i, n, x, y;
        float divisao = 0;
        n = input.nextInt();
        for(i = 0; i < n ; i = i + 1){
            x = input.nextInt();
            y = input.nextInt();
            if(y == 0){
                System.out.println("divisao impossivel");
            }
            else{
                divisao = x /(float)(y);
                System.out.printf("%.1f\n",divisao);
            }
        }
        input.close();
    }
}

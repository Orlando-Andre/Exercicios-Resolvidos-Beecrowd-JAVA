import java.util.Locale;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int N;
        float v1, v2, v3, soma,mediaPond;
        N = input.nextInt();
        for(int i = 0 ; i < N; i ++){
            soma = 0;
            v1 = input.nextFloat();
            v2 = input.nextFloat();
            v3 = input.nextFloat();
            soma = (float)((v1*2)+(v2*3)+(v3*5));
            mediaPond = (float)(soma/10.0);
            System.out.printf("%.1f\n",mediaPond);
        }
        input.close();
    }
}

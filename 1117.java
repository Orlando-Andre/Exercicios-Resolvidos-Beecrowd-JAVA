import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        float N1, N2, media;
        N1 = input.nextFloat();
        while(N1< 0 || N1 > 10.0){
            System.out.println("nota invalida");
            N1 = input.nextFloat();
        }
        N2 = input.nextFloat();
        while(N2< 0 || N2 > 10.0){
            System.out.println("nota invalida");
            N2 = input.nextFloat();
        }
        media = (float)((N1 + N2) / 2.0);
        System.out.printf("media = %.2f\n" , media);
        input.close();
    }
}


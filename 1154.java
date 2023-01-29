import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        int i, Id, soma = 0;
        float media;
        Id = input.nextInt();
        for(i = 0; Id > 0; i = i + 1){
            soma = soma + Id;
            Id = input.nextInt();
        }
        media = soma / (float) (i);
        System.out.printf("%.2f\n" , media);
        input.close();
    }
}

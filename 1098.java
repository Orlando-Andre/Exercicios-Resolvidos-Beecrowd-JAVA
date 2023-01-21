import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int a, b;
        float i, j;
        for (i = 0.0f; i < 2.1; i += 0.2) {
            for (j = 1.0f; j <= 3.0; j++) {
                if (i > 0 && i < 1 || i > 1 && i < 2) {
                    System.out.printf("I=%.1f J=%.1f\n", i, i+j);
                } else {
                    a = (int) (i);
                    b = (int) (i + j);
                    System.out.printf("I=%d J=%d\n", a, b);
                }
            }
        }
        input.close();
    }
}


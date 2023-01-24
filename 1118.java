import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		float  nota1,nota2,media;
		int X;
		do {
    		nota1 = input.nextFloat();
    		while(nota1 < 0 || nota1 > 10){
    		    System.out.println("nota invalida");
    		    nota1 = input.nextFloat();
    		}
    		nota2 = input.nextFloat();
    		while(nota2 < 0 || nota2 > 10){
    		    System.out.println("nota invalida");
    		    nota2 = input.nextFloat();
    		}
    		media = (float)((nota1 + nota2) / 2);
    		System.out.printf("media = %.2f\n",media);
    		System.out.println("novo calculo (1-sim 2-nao)");
    		X = input.nextInt();
    		while(X < 1 || X > 2) {
    		    System.out.println("novo calculo (1-sim 2-nao)");
    		    X = input.nextInt();
    		}
    	} while(X != 2);
	}
}

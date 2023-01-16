import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner input = new java.util.Scanner(System.in);
	    int contador, i;
	    float numero, soma, media;
	    contador = 0;
	    soma =(float)(0.0); 
	    for(i = 0; i < 6 ; i = i + 1){
	        numero = input.nextFloat();
	        if(numero > 0){
	            soma = soma + numero;
	            contador = contador + 1;
	        }
	    }
		media = (float)(soma / contador);
		System.out.println(contador + " valores positivos");
		System.out.printf("%.1f\n",media);
		input.close();
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner input = new java.util.Scanner(System.in);
		int i, n, x , contadorIn, contadorOut;
		contadorIn = 0;
		contadorOut = 0;
		n = input.nextInt();
		for ( i = 0; i < n; i = i + 1){
		    x = input.nextInt();
		    if( x >= 10 && x <= 20){
		        contadorIn = contadorIn + 1;
		    }
		    else{
		        contadorOut = contadorOut + 1;
		    }
		}
		System.out.println(contadorIn + " in");
		System.out.println(contadorOut + " out");
	}
}

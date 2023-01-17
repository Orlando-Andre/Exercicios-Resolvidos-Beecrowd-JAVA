import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner input = new java.util.Scanner(System.in);
	    int i, contPar, contImpar, contPos, contNeg, n;
	    contPar = 0  ; 
	    contImpar = 0 ; 
	    contPos = 0; 
	    contNeg = 0;
	    for( i = 0; i < 5; i = i + 1){
	        n = input.nextInt();
	        if( n % 2 == 0){
	            contPar = contPar + 1;
	        }
	        else{
	            contImpar = contImpar + 1;
	        }
	        if(n > 0 ){
	            contPos = contPos + 1;
	        }
	        else{
	            if(n!=0)
	            contNeg = contNeg + 1 ;
	        }
	    }
	    System.out.println(contPar + " valor(es) par(es)");
	    System.out.println(contImpar + " valor(es) impar(es)");
	    System.out.println(contPos + " valor(es) positivo(s)");
	    System.out.println(contNeg + " valor(es) negativo(s)");
		input.close();
	}
}

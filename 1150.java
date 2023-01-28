import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int x,z,cont = 1;
	    x = input.nextInt();
	    z = input.nextInt();
	    
	    while(x >= z){
	        z = input.nextInt();
	    }
	    
	   int soma = x;
	    
	    while(soma <= z){
	        x = x + 1;
	        soma = soma + x;
	        
	        cont++;
	    }
	    System.out.println(cont);
	    input.close();
	}
}

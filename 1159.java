import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int x;
	    int soma = 0;
	    
	    x = input.nextInt();
	    while(x != 0){
	        
	        if(x % 2 != 0){
	            x = x + 1;
	        }
	       
	        for(int i = 0; i < 5; i++) {
	            soma = soma + x;
	            x = x + 2;
	        }
	        System.out.println(soma);
	        soma = 0;
	        x = input.nextInt();
	        
	    } 
	}
}

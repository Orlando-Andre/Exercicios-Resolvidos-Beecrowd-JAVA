import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int M, N;
		M = input.nextInt();
		N = input.nextInt();
		while(M != N){
    		if(M < N){
    		    System.out.println("Crescente");
    		}
    		else{
    		    System.out.println("Decrescente");
    		    
    		}
        	M = input.nextInt();
    		N = input.nextInt();
		}
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    int M, N, soma, Aux;
	    M = input.nextInt();
	    N = input.nextInt();
	    while(M > 0 && N > 0){
	        if(M > N){
	            Aux = N;
	            N = M;
	            M = Aux;
	        }
	        soma = 0 ;
	        for(int i = M ; i <=  N ; i++){
	            System.out.print(i + " ");
	            soma = soma +  i;
	        }
	        System.out.println("Sum=" + soma);
	        M = input.nextInt();
	        N = input.nextInt();
	    }
	    input.close();
	}
}

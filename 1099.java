import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N,X,Y,Aux,soma = 0;
		N = input.nextInt();
		for(int i = 0; i < N; i++){
		    X = input.nextInt();
		    Y = input.nextInt();
		    if(X>Y) {
		        Aux = X;
		        X = Y;
		        Y = Aux;
		    }
		    for(int j = X + 1; j < Y; j++){
		        if(j % 2 != 0){
		            soma += j;
		        }
		    }
		    System.out.println(soma);
		    soma =0;
		}
		input.close();
	}
}

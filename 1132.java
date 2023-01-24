import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X, Y, soma = 0,Aux;
		X = input.nextInt();
		Y = input.nextInt();
		if(X > Y){
		    Aux = X;
		    X = Y;
		    Y = Aux;
		}
		for(int i = X ; i <= Y; i++){
		    if( i % 13 != 0){
		        soma = soma + i;
		    }
		}
		System.out.println(soma);
	}
}

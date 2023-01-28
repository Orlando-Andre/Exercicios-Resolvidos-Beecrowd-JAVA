import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, n;
		int soma = 0;
		a = input.nextInt();
		n = input.nextInt();
		while(n <= 0 ){
		    n = input.nextInt();
		}
		for(int i = 0 ; i <= n - 1; i++){
		    soma = soma + a + i;
		}
		System.out.println(soma);
		input.close();
	}
}

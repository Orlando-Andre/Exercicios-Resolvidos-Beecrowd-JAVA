import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,x,y,soma = 0;
		
		n = input.nextInt();
		
		for(int i = 0 ; i < n; i++){
		    soma = 0;
		    x = input.nextInt();
		    y = input.nextInt();
		    for(int j = 0; j < y; j++){
		        if(x%2==0){
		            x = x+1;
		        }
		        soma = soma + x;
		        x = x+1;
		    }
		    System.out.println(soma);
		}
		input.close();
	}
}

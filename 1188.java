import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] A = new double[12][12];
		double media = 0.0, soma = 0.0;
		double cont = 0.0;
		char operacao;
		
		operacao = input.next().charAt(0);
		
		for(int i = 0 ; i < 12; i++){
		    for(int j = 0; j < 12; j++){
		        A[i][j] = input.nextDouble();
		    }
		}
		int x = 0;
		for(int i = 11; i > 6 ; i--){
		    x++;
		    for(int j = i - 1; j >= x ;j--){
		        soma = soma + A[i][j];
		        cont++;
		    }
		}
		
		if(operacao == 'S'){
		    System.out.printf("%.1f\n",soma);
		}
		else{
		    media = (soma/cont);
		    System.out.printf("%.1f\n");
		}
		input.close();
	}
}

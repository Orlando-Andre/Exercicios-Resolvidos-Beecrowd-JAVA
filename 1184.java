import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letra;
		float soma = 0f;
		float media = 0.0f;
		int cont = 0;
		
		float [][] matriz = new float[12][12];
		
		letra = input.next().charAt(0);
		
		for(int i = 0; i<12;i++){
		    for(int j = 0; j < 12; j++){
		        matriz[i][j] = input.nextFloat();
		    }
		}
		
		for(int i = 0; i<12;i++){
		    for(int j = 0; j < i; j++){
		        soma = soma + matriz[i][j];
		        cont++;
		    }
		}
		if(letra == 'S'){
		    System.out.printf("%.1f\n",soma);
		}
		else{
		    media = soma / cont;
		    System.out.printf("%.1f\n",media);
		}
		input.close();
	}
}

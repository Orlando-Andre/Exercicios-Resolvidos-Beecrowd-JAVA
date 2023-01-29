public class Main {
	public static void main(String[] args) {
		float soma = 1;
		float x = 3.0f;
		float j = 2.0f;
		for(int i = 1 ; i < 20;i++){
		    soma = soma + x / j;
		    x = x + 2;
		    j = j * 2;
		}
	    System.out.printf("%.2f\n",soma);
	}
}

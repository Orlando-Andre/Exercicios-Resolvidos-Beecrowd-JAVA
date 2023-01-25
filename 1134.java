import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int codigo ,alcool = 0, gasolina = 0, diesel = 0;
		
	     codigo = input.nextInt();
	    
		 while(codigo < 1 || codigo > 4) {
		    codigo = input.nextInt();
		 }
		 while(codigo != 4){
		    switch(codigo) {
                case 1:
		            alcool++;
		            break;
                case 2:
                    gasolina++;
		            break;
		        case 3:
		            diesel++;
		            break;
		    }
		    codigo = input.nextInt();
		    while(codigo < 1 || codigo > 4) {
		        codigo = input.nextInt();
		    }
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: "+ diesel);
	}
}

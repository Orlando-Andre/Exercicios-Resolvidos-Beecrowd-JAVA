import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int x;
	    int y;
	    int divisores = 0;
	    x = input.nextInt();
	    for(int i = 0; i < x; i++){
	        y = input.nextInt();
	        
	        for(int z = 1; z <= y; z++){
	            if(y % z == 0){
	                divisores++;
	            }
	        }
	        
	        if(divisores == 2){
	            System.out.println(y + " eh primo");
	        }
	        else{
	           System.out.println(y + " nao eh primo");
	        }
	        divisores = 0;
	    }
	}
}
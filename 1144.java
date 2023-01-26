import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int a,c, d,e,f;
	    
	    a = input.nextInt();
	    for(int b = 1 ; b <= a; b++){
	        c = b * b;
	        d = b * b * b;
	        System.out.printf("%d %d %d\n",b,c,d);
	        e = c + 1;
	        f = d + 1;
	        System.out.printf("%d %d %d\n",b,e,f);
	        
	    }
		input.close();
	}
}

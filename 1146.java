import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, i;
		x = input.nextInt();
		while(x != 0){
		    for( i = 1 ; i < x ; i++){
		        System.out.print(i + " ");
		    }
		    System.out.println(i);
		    x = input.nextInt();
		}
		input.close();
	}
}

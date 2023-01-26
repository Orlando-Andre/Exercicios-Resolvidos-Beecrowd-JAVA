import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int i, x, y, contador = 0;
        x = input.nextInt();
        y = input.nextInt();
        for(i = 1; i<= y; i = i + 1){
            System.out.print(i);
            contador = contador + 1;
            if(contador == x){
                System.out.print("\n");
                contador = 0;
            }
            else{
                System.out.print(" ");
            }
        }
        input.close();
    }
}

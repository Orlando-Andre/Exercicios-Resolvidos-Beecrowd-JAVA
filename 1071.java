import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  X ,Y, Aux = 0, soma = 0; 
        X = input.nextInt();
        Y = input.nextInt();
        if(X > Y){
            Aux = X; 
            X = Y ; 
            Y = Aux;
        }
        for(int i =  X + 1; i < Y; i++){
            if( i % 2 != 0){
                soma = soma + i;
            }
        }
        System.out.println(soma);
        input.close();
    }
}
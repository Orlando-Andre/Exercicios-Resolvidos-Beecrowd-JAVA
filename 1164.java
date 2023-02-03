import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nCasos, numero, soma = 0;
        nCasos = input.nextInt();
        for(int i = 0; i < nCasos ; i++){
            numero = input.nextInt();
            for(int x = numero - 1; x >= 1; x-- ){
                if(numero % x == 0){
                    soma = soma + x;
                }
            }
        if( soma == numero){
            System.out.println(numero +" eh perfeito");
        }
        else{
            System.out.println(numero + " nao eh perfeito");
        }
        soma = 0;
        }
        input.close();
    }
}

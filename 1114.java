import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        int senha;
        senha = input.nextInt();
        while(senha != 2002){
            System.out.println("Senha Invalida");
            senha = input.nextInt();
        }
        System.out.println("Acesso Permitido");
        input.close();
    }
}


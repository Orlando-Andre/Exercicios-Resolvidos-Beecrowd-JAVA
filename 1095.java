import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int J, I;
        I = -2;
        for(J = 60; J >= 0 ; J = J - 5){
            I = I + 3;
            System.out.println("I=" + I  + " J=" + J);
        }
        input.close();
    }
}

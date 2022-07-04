/*@autor: Orlando André 
 * 
 *@name: Tipos de Triângulos
*/
/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada. */

import java.util.Locale;
import java.util.Scanner;
public class 1045 {  //P.S colocar Main
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        float A, B, C, AUX;
        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextFloat();
        if(C > A || C > B){ 
            if(B < A){
                AUX = C;
                C = B;
                B = AUX;
            }
            else{
                AUX = A;
                A = C;
                C = AUX;
            }
        }
        if(B > A){
            AUX = A;
            A = B;
            B = AUX;
        }
        if(A >= (B + C)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
    
            if((A*A) == (B*B + C*C)){
                System.out.println("TRIANGULO RETANGULO");
            }
            if((A*A) > (B*B + C*C)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if((A*A) < (B*B + C*C)){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(A==B && A==C){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else{
                if(A==B || A==C || C==B){
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
        input.close();
    }        

}
    
/*@autor: Orlando André 
 * 
 *@name: Sort Simples 
*/
/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.*/

import java.util.Scanner;
public class 1042 {//P.S colocar Main
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int A, B, C, Ai, Bi, Ci, AUX;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        Ai = A;
        Bi = B;
        Ci = C;
        if(A>B || A>C){
            if(B<C){
                AUX = A;
                A = B;
                B = AUX;
            }
            else{
                AUX = A;
                A = C;
                C = AUX;
            }
        }
        if(B>C){
            AUX = C;
            C = B;
            B = AUX;
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C +"\n");
        System.out.println(Ai);
        System.out.println(Bi);
        System.out.println(Ci);
        input.close();

    }
    
}

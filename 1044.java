/*@autor: Orlando André 
 * 
 *@name: Múltiplos
*/
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.*/

import java.util.Scanner;
public class 1044 {  //P.S colocar Main
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        int A, B,aux;
        A = input.nextInt();
        B = input.nextInt();
        if(A>B){
            aux = B;
            B = A;
            A = aux;
        }
        if(B % A ==0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
        input.close();
    }
}        
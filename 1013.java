/*@autor: Orlando André 
 * 
 *@name: O Maior
*/
/*Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaioAB = (a + b + abs(a-b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior". */

import java.util.Locale;
import java.util.Scanner;
public class 1013 {//P.S colocar Main
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        int A, B, C, maiorAb, maiorAbc;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        maiorAb = (A + B + Math.abs(A - B))/2;
        maiorAbc = (maiorAb + C + Math.abs(maiorAb - C))/2;
        System.out.println(maiorAbc+" eh o maior");
        input.close();
    }
}
    
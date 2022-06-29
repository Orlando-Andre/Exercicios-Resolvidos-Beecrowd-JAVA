/*@autor: Orlando André 
 * 
 *@name: Cédulas
*/
/* Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.*/

import java.util.Locale;
import java.util.Scanner;
public class 1018 {//P.S colocar Main
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        int valorLido, resto, n100, n50;
        int n20, n10, n5, n2, n1;
        valorLido = input.nextInt();
        n100 = valorLido / 100;
        resto = valorLido % 100;
        n50 = resto / 50;
        resto = resto % 50;
        n20 = resto / 20;
        resto = resto % 20;
        n10 = resto / 10;
        resto = resto % 10;
        n5 = resto / 5;
        resto = resto % 5;
        n2 = resto / 2;
        resto = resto % 2;
        n1 = resto /1;
        System.out.println(valorLido);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
        input.close();
    }
}
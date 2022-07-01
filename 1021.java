/*@autor: Orlando André 
 * 
 *@name: Notas e Moedas
*/
/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal. */

import java.util.Locale;
import java.util.Scanner;
public class 1021 { //P.S colocar Main
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        int n100, n50, n20, n10, n05, n02;
        int moedas1, moedas50, moedas25, moedas10, moedas05, moedas01;
        double qtdDinheiro, moedas, resto;
        qtdDinheiro = input.nextDouble();
        n100 = (int)qtdDinheiro / 100;
        resto = qtdDinheiro % 100.0;
        n50 = (int)resto / 50;
        resto = resto % 50.0;
        n20 = (int)resto / 20;
        resto = resto % 20.0;
        n10 = (int)resto / 10;
        resto = resto % 10.0;
        n05 = (int)resto / 5;
        resto = resto % 5.0; 
        n02 =(int)resto / 2;
        resto = resto % 2.0;
        moedas = resto *100;
        moedas1 = (int)moedas / 100;
        resto = moedas % 100.0;
        moedas50 = (int)resto / 50;
        resto = resto % 50.0;
        moedas25 = (int)resto / 25;
        resto = resto % 25.0;
        moedas10 = (int)resto / 10;
        resto = resto % 10.0;
        moedas05 = (int)resto / 5;
        resto = resto % 5.0;
        moedas01 = (int)resto / 1;
        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n05 + " nota(s) de R$ 5.00");
        System.out.println(n02 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");
        input.close();
    }
}

        
  
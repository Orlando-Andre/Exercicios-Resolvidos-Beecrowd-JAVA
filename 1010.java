/*@autor: Orlando André 
 * 
 *@name: Cálculo Simples
*/
/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.*/

import java.util.Locale;
import java.util.Scanner;
public class 1010 { //P.S colocar Main
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        int codigo1, codigo2, qtdPecas1, qtdPecas2;
        double valor1, valor2, TOTAL;
        codigo1 = input.nextInt();
        qtdPecas1 = input.nextInt();
        valor1 = input.nextDouble();
        codigo2 = input.nextInt();
        qtdPecas2 = input.nextInt();
        valor2 = input.nextDouble();
        TOTAL = (valor1*qtdPecas1) + (valor2*qtdPecas2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , TOTAL);
        input.close();
    }
}
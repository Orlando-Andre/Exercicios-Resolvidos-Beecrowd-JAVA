/*@autor: Orlando André 
 * 
 *@name: Idade em Dias
*/
/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.*/

import java.util.Scanner;
public class 1020 {
    public static void main (String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int nIdadeD, ano, mes, dia;
        nIdadeD = input.nextInt();
        ano = nIdadeD / 365;
        nIdadeD = nIdadeD % 365;
        mes = nIdadeD / 30;
        nIdadeD = nIdadeD % 30;
        dia = nIdadeD;
        System.out.print(ano + " ano(s)\n"+ mes + " mes(es)\n"+ dia +" dia(s)\n");
        input.close();
    }
}


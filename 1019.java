/*@autor: Orlando André 
 * 
 *@name: Salário
*/
/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.*/

import java.util.Scanner;
public class Main { //P.S colocar Main
    public static void main (String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int N, horas, minutos, segundos;
        N = input.nextInt();
        horas = N / 3600;
        N = N % 3600;
        minutos = N / 60;
        N = N % 60;
        segundos = N;
        System.out.println(horas + ":" + minutos + ":" + segundos);
        input.close();
    }
}
/*@autor: Orlando André 
 * 
 *@name: Área
*/
/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal. */

import java.util.Locale;
import java.util.Scanner;
public class 1012 { //P.S colocar Main
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        Double a, b, c;
        Double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO, PI = 3.14159;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        TRIANGULO = (a*c)/2;
        CIRCULO = Math.pow(c, 2) * PI;
        TRAPEZIO = (a + b) * c / 2;
        QUADRADO = b * b;
        RETANGULO = a * b;
        System.out.printf("TRIANGULO: %.3f\n" , TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n" , CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n" , TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n" , QUADRADO);
        System.out.printf("RETANGULO: %.3f\n" , RETANGULO);
        input.close();
    }
}

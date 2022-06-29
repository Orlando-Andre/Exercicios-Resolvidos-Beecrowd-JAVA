/*@autor: Orlando André 
 * 
 *@name: Distância Entre Dois Pontos
*/
/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = raiz quadrada (x2 -x1)² + (y2 - y1)²

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.*/

import java.util.Locale;
import java.util.Scanner;
public class 1015 { //P.S colocar Main
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        float X1, X2, Y1, Y2, DISTANCIA;
        X1 = input.nextFloat();
        Y1 = input.nextFloat();
        X2 = input.nextFloat();
        Y2= input.nextFloat();
        DISTANCIA =(float)Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
        System.out.printf("%.4f\n" , DISTANCIA);
        input.close();
    }
}

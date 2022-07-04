/*@autor: Orlando André 
 * 
 *@name: Aumento do salário
*/
/*A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:


Salário	                            Percentual de Reajuste
0 - 400.00                                   15%
400.01 - 800.00                              12%
800.01 - 1200.00                             10%
1200.01 - 2000.00                            7%
Acima de 2000.00                             4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo. */

import java.util.Locale;
import java.util.Scanner;
public class 1048 {  //P.S colocar Main
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        float sInicial, sFinal, reajuste;
        sInicial = input.nextFloat();
        if(sInicial <= 400.00){
            reajuste = (float)(sInicial * 0.15);
            sFinal = (float)(sInicial + reajuste);
            System.out.printf("Novo salario: %.2f\n" , sFinal);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else{
            if(sInicial <= 800.00){
                reajuste = (float)(sInicial * 0.12);
                sFinal = (float)(sInicial + reajuste);
                System.out.printf("Novo salario: %.2f\n" , sFinal);
                System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                System.out.println("Em percentual: 12 %");
            }
            else{
                if(sInicial <= 1200.00){
                    reajuste = (float)(sInicial * 0.1);
                    sFinal = (float)(sInicial + reajuste);
                    System.out.printf("Novo salario: %.2f\n" , sFinal);
                    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                    System.out.println("Em percentual: 10 %");
                }
                else{
                    if(sInicial <= 2000.00){
                        reajuste = (float)(sInicial * 0.07);
                        sFinal = (float)(sInicial + reajuste);
                        System.out.printf("Novo salario: %.2f\n" , sFinal);
                        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                        System.out.println("Em percentual: 7 %");
                    }
                    else{
                        reajuste = (float)(sInicial * 0.04);
                        sFinal = (float)(sInicial + reajuste);
                        System.out.printf("Novo salario: %.2f\n" , sFinal);
                        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                        System.out.println("Em percentual: 4 %");
                    }
                }
            }
        }
        input.close();
    }
}

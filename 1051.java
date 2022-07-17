/*@autor: Orlando André 
 * 
 *@name: Imposto de Renda
*/
/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Renda               Imposto
0 a 2000            isento
2000.01 até 3000    8%
3000.01 até 4500    18%
acima de 4500       28%


Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento". */

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        float salario, imposto,impostop, imposto0, imposto1, imposto2, diferenca, diferenca1, diferenca2;
        salario = input.nextFloat();
        if(salario <= 2000.00){
            System.out.println("Isento");
        }
        else{
            if(salario <= 3000.00){
                impostop = (float)((salario - 2000.00) * 0.08);
                System.out.printf("R$ %.2f\n" , impostop);
            }
            else{
                if(salario <= 4500.00){
                    impostop = (float)(salario - 2000.00);
                    diferenca = (float)(impostop - 1000.00);
                    imposto0 = (float)(1000.00 *0.08);
                    imposto1 = (float)(diferenca * 0.18);
                    System.out.printf("R$ %.2f\n" , imposto0 + imposto1);
                    }
                else{
                    impostop = (float)(salario - 2000.00);
                    diferenca = (float)(impostop - 1000.00);
                    imposto0 = (float)(1000.00 *0.08);
                    imposto1 = (float)(1500.00 *0.18);
                    diferenca1 = (float)(diferenca - 1500.00);
                    imposto2 = (float)(diferenca1 * 0.28);
                    System.out.printf("R$ %.2f\n" , imposto0 + imposto1 + imposto2);
                }
            }
        }
        input.close();
    }
}        


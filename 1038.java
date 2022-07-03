/*@autor: Orlando André 
 * 
 *@name: Lanche
*/
/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Código  Especificação         Preço
1       Cachorro Quente      R$ 4,00
2       X-Salada             R$ 4,50
3       X-Bacon              R$ 5,00
4       Torrada Simples      R$ 2,00
5       Refrigerantes        R$ 1,50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.*/

import java.util.Locale;
import java.util.Scanner;
public class 1038 {//P.S colocar Main
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new java.util.Scanner(System.in);
        int codigo, qtd;
        float preco;
        codigo = input.nextInt();
        qtd = input.nextInt();
        if(codigo == 1){
            preco = (float)(4.00 * qtd);
        }
        else{
            if(codigo == 2){
                preco = (float)(4.50 * qtd);
            }
            else {
                if(codigo == 3){
                preco = (float)(5.00 * qtd);
                }
                else{
                    if(codigo == 4){
                        preco = (float)(2.00 * qtd);
                    }
                    else{
                        preco = (float)(1.50 * qtd);
                    }
                }
            }
        }
        System.out.printf("Total: R$ %.2f\n",preco);
        input.close();
    }        

}
/*@autor: Orlando André 
 * 
 *@name: tempo de jogo
*/
/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.*/

import java.util.Scanner;
public class 1046 {  //P.S colocar Main
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int horaInicial, horaFinal, duracao;
        horaInicial = input.nextInt();
        horaFinal = input.nextInt();
        if(horaInicial == horaFinal){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else{
            if(horaInicial > horaFinal){
                duracao = Math.abs(horaInicial - 24) + horaFinal;
                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            }
            else{
                duracao = horaFinal - horaInicial;
                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

            }
        }
       
        input.close();

    }
    
}
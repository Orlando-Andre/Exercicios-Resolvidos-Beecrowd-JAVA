/*@autor: Orlando André 
 * 
 *@name: Tempo de jogo em minutos
*/
/*Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: "O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)" */

import java.util.Scanner;

public class 1047 {  //P.S colocar Main
	
	public static void main(String[] args){
		Scanner input = new java.util.Scanner(System.in);
		int hInicio, mInicio, hFim, mFim,resultado = 0, mInicioTotal, mFimTotal,qtdMin24;
	    hInicio = input.nextInt();
		mInicio = input.nextInt();
		hFim = input.nextInt();
		mFim = input.nextInt();
		mInicioTotal = (hInicio * 60) + mInicio;
		mFimTotal= (hFim * 60) + mFim;
		qtdMin24 = 24 * 60;
		if (mFimTotal > mInicioTotal){
			resultado = mFimTotal - mInicioTotal;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
		}
		else{
		    if(mInicioTotal > mFimTotal){
		        resultado = (qtdMin24 - mInicioTotal) + mFimTotal;
		        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
		    }
		    else{
		        if(mFimTotal == mInicioTotal){
		            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		        }
		    }
		}
		input.close();
	}
}
	

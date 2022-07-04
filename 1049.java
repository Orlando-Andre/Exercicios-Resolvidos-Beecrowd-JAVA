/*@autor: Orlando André 
 * 
 *@name: Animal
*/
/* Ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.


IMAGEM IMAGEM IMAGEM IMAGEM IMAGE IMAGEM IMAGEM IMAGEM IMAGEM IMAGEM IMAGEM IMAGEM IMAGEM IMAGEM IMAGEM IMAGEM IMAGEM IMAGE IMAGEM IMAGEM IMAGEM


Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida. */

import java.util.Scanner;

public class 1049 {  //P.S colocar Main
	public static void main(String[] args) {
		Scanner input = new java.util.Scanner(System.in);
		String tipo, classe, alimentacao;
		tipo = input.next();
		classe = input.next();
		alimentacao = input.next();
		if(tipo.equals("vertebrado")){
		    if(classe.equals("ave")){
		        if(alimentacao.equals("carnivoro")){
		            System.out.println("aguia");
		        }
		        else{
		            System.out.println("pomba");
		        }
		    }
		    else{
		        if(alimentacao.equals("onivoro")){
		            System.out.println("homem");
		        }
		        else{
		            System.out.println("vaca");
		        }
		    }
		}
		else{
		    if(classe.equals("inseto")){
		        if(alimentacao.equals("hematofago")){
		            System.out.println("pulga");
		        }
		        else{
		            System.out.println("lagarta");
		        }
		    }
		    else{
		        if(alimentacao.equals("hematofago")){
		            System.out.println("sanguessuga");
		        }
		        else{
		            System.out.println("minhoca");
		        }
		    }
		}
		input.close();
	}
}

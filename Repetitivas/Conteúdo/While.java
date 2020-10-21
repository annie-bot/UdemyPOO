// É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
// Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.

  //Sintaxe:
  //while ( condição ) {
  //comando 1
  //comando 2
  //}
    //Regras:
    // V: executa e volta
    //F: pula fora
    
//Exemplo:

package Repetitiva;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0; // é necessário inicializar com 0, o elemento neutro da soma para inicialização da variável.
		while (x != 0) 
		{
		soma = soma + x; // para armazenar as entradas e somar tudo no final
		x = sc.nextInt();
		}
		
		System.out.println("Soma = " + soma);
		sc.close();
	}

}

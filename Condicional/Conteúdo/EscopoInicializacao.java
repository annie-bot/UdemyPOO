//Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
// Escopo é a parte onde as variáveis são declaradas, antes da estrutura de controle (onde algoritmos ou comandos são implantados).
// Uma variável não pode ser usada se não for iniciada (atribuída um valor ou significado).

  // Exemplos:
package Condicional;

import java.util.Scanner;

public class EscopoInicializacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double price = sc.nextDouble();
		if (price > 100.0) {
			double discount = price * 0.1;
		}
		System.out.println(discount);
		// desconto não foi iniciado no escopo e apenas na estrutura de controle, sendo assim, assim que a condição foi lida, ele foi descartado.
		// Correção:
		
		double price = sc.nextDouble();
		double discount = 0;
		
		if (price > 100.0) {
			double discount = price * 0.1;
		}
		System.out.println(discount);
		
		// Agora com o discount sendo declarado no escopo inicial, ele pode ser lido normalmente.
		sc.close();		
	}

}

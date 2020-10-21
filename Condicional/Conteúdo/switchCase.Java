//Quando se tem várias opções de fluxo a serem tratadas com base no
//valor de uma variável, ao invés de várias estruturas if-else encadeadas,
//alguns preferem utilizar a estrutura switch-case.

//Sintaxe: 
	//switch ( expressão ) {
	//case valor1:
	//comando1
	//comando2
		//break;
	//case valor2:
	//comando3
	//comando4
		//break;
	//default (caso nenhum dos casos satisfaça, serve como um else):
	//comando5
	//comando6
		//break;
	//}
  
//Exemplo:
package Sequencial;

public class switchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}

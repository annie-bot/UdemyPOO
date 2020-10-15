package Condicional;
import java.util.Scanner;

public class ExercícioCondicional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o número?");
		
		int numero;
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Número positivo");
		}
		else {
			System.out.println("Número Negativo");
		}
		sc.close();
	}

}

package Condicional;

import java.util.Scanner;

public class ExercicioCondicional2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o número?");

		int numero;
		numero = sc.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("Número Par");
		}
		else {
			System.out.println("Número Impar");
		}
		sc.close();

	}

}

package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("O número está em qual intervalo? Digite seu número:");

		double num = sc.nextInt();

		if (num < 0.0 || num > 100.0) {
			System.out.println("Está fora de intervalo!");
		} else if (num <= 25.0) {
			System.out.println("Está no intervalo [0,25]");
		} else if (num <= 50.0) {
			System.out.println("Intervalo [25,50]");
		} else if (num <= 75.0) {
			System.out.println("Intervalo [50,75]");
		}

		else
			System.out.println("Intervalo [75,100]");

		sc.close();
	}
}

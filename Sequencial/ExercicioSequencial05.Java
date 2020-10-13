package Sequencial;

import java.util.Scanner;
import java.util.Locale;

public class Sequencial5 {

	public static void main(String[] args) {
		// Exercício 05
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int c1, n1;
		double vp1;

		int c2, n2;
		double vp2;
		double total;

		c1 = sc.nextInt();
		n1 = sc.nextInt();
		vp1 = sc.nextDouble();
		c2 = sc.nextInt();
		n2 = sc.nextInt();
		vp2 = sc.nextDouble();
		
		total = (n1 * vp1) + (n2 * vp2);

		System.out.printf("Valor a pagar: R$ %.2f", total);

		sc.close();
	}

}

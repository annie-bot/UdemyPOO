package Condicional;

import java.util.Scanner;

public class Reloginho {

	public static void main(String[] args) {

		int hora;

		System.out.println("Quantas horas?");

		Scanner sc = new Scanner(System.in);

		hora = sc.nextInt();
		if (hora < 12) {
			System.out.println("Bom Dia!");
		} else {
			if (hora < 18) {
				System.out.println("Boa Tarde!");
			} else {
				System.out.println("Boa Noite!");
			}
		}
		sc.close();
	}
}

package Condicional;

import java.util.Scanner;

public class ExercicioCondicional4 {

	public static void main(String[] args) {

		System.out.println("Que horas começou o jogo?");
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();

		System.out.println("Que horas terminou o jogo?");
		int horaFinal = sc.nextInt();

		int horaTotal;

		if (horaInicial < horaFinal) {
			horaTotal = horaFinal - horaInicial;
		} else {
			horaTotal = 24 - horaInicial + horaFinal;
		}
		System.out.println("O jogo durou " + horaTotal + " hora(s)!");
		sc.close();
	}
}

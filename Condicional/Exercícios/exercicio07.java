package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Em qual quadrante se encontra? Digite as coordenadas:");

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x == 0.0 && y == 00) 
		{
			System.out.println("Está no ponto de Origem!");			
		}
		else if (x > 0.0 && y > 0.0)
		{
			System.out.println("Está no Quadrante 1!");
		}
		else if (x > 0.0 && y > 0.0)
		{
			System.out.println("Está no Quadrante 2!");
		}
		else if (x < 0.0 && y < 0.0)
		{
			System.out.println("Está no Quadrante 3!");
		}
		else 
		{
			System.out.println("Está no Quadrante 4!");
		}
				
		sc.close();
	}

}

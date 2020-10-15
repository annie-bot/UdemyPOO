package Condicional;

import java.util.Scanner;

public class ExercicioCondicional03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Os números são multiplos?");
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
	
		if(X % Y == 0 || Y % X == 0) {
			System.out.println("São números multiplos!");
		}
		else {
			System.out.println("Não São Multiplos!");
		}
		sc.close();

	}

}

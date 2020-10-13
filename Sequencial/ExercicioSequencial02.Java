package Sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Sequencial2 {

	public static void main(String[] args) {
		// Exercício 02
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		// casas decimais conforme exemplos.

		Locale.setDefault(Locale.US); // COLOCAR ANTES DO SCANNER PRA LER COM PONTO
    
		Scanner sc = new Scanner(System.in);
		
		double area, raio, pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}

package Sequencial;
import java.util.Scanner;

public class ExercicioSequencial {

	public static void main(String[] args) {
		//Exercício 01
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
		// 10
		// 30
		// SOMA = 40
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int soma;
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
					
		System.out.println("SOMA = "+ soma);
		
		sc.close();

	}

}

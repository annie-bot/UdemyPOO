package Sequencial;
import java.util.Scanner;
import java.util.Locale;
public class Sequencial4 {

	public static void main(String[] args) {
// Exercício 04
		Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
		
		int nf, ht;
		double vph, salario;
		
		nf = sc.nextInt();
		ht = sc.nextInt();
		vph = sc.nextDouble();
		
		salario = (double) ht * vph;
									
		System.out.printf("Número = %d %nSalário = U$ %.2f", nf, salario);
		
		sc.close();
	}

}

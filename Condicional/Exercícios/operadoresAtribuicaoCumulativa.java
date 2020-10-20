package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class AtribuicaoCulmulativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos > 100.0)
		{
		conta = conta + (minutos - 100) * 2; 
		}
		
		System.out.printf("Valor a pagar R$: %.2f %n", conta);
		
		sc.close();

	}

}

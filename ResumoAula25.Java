package Sequencial;

import java.util.Locale;
import java.util.Scanner;

//Para fazer entrada de dados, nós vamos criar um OBJETO do tipo "Scanner" da seguinte forma:
// Scanner sc = new Scanner(System.in);
// variavel= sc
// tipo Scanner (para fazer entrada de dados pelo teclado)

public class EntradaDeDados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// sempre usar sc.close() quando não precisar mais do OBJETO sc

		String x;
		x = sc.next();
		// Para Strings .next();
		System.out.println("Você Digitou: " + x);
      //Abacate
      //Você Digitou: Abacate

		// Para Inteiros .nextInt();
		int x1 = sc.nextInt();
		System.out.println("Você Digitou: " + x1);
       //10
       //Você Digitou: 10

		// Para Decimais .nextDouble();
		// OBS.: Para decimais com PONTO, deve declarar antes do scanner principal:
		// Locale.setDefault(Locale.US);

		double x2 = sc.nextDouble();
		System.out.printf("Você Digitou: %.2f %n", x2);
		// Digitar com PONTO
        //2.5
       //Você Digitou: 2.50 
       
    // Para CHAR .next().charAt(0);
		char F;
		F = sc.next().charAt(0);
		System.out.println("Você Digitou: " + F);
		// Se digitar mais de um caractere na entrada do console, irá imprimir apenas a
		// primeira;
        //T
        //Você Digitou: T
        
        
		// Para ler vários dados diferentes na mesma linha
		
		String a;
		int b;
		double c;

		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		// Vários dados na mesma linha separados por espaço:
		
		System.out.println("Dados Digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
    
		//Matheus 17 1.89
    //Dados Digitados: 
    //Matheus
    //17
    //1.89
    
		sc.close();
	}
}

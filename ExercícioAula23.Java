import java.util.Locale;

public class Exercicio {

	public static void main(String[] args) {
//Em um novo programa, inicie as seguintes variáveis:

		String produto1 = "Computador";
		String produto2 = "Mesinha de Escritório";
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		double preço1 = 2100.0;
		double preço2 = 650.50;
		double medida = 53.234567;
//Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:

System.out.printf("PRODUTOS: %s, cujo preço é: $ %.2f %n%s cujo preço é: $ %.2f %n", produto1, preço1, produto2, preço2);
System.out.printf("Recorde: %d anos, código %d e gênero: %c%n", idade, codigo, genero);
System.out.printf("Medida com oito casas decimais: %.8f %nArredondada com 3 casas decimais: %.3f %n", medida, medida);
Locale.setDefault(Locale.US);
System.out.printf("Com ponto decimal Americano: %.3f", medida);
	}

}
// PRODUTOS: Computador, cujo preço é: $ 2100,00 
// Mesinha de Escritório cujo preço é: $ 650,50 
// Recorde: 30 anos, código 5290 e gênero: F
// Medida com oito casas decimais: 53,23456700 
// Arredondada com 3 casas decimais: 53,235 
// Com ponto decimal Americano: 53.235

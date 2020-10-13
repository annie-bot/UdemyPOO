package Sequencial;
public class Atribuicao {
// comando de atribuicao
	public static void main(String[] args) {
		// processamento de dados (variaveis);
		// <variavel> =(recebe) <expressão>;
		// dessa forma a variável recebe o resultado da expressão;

		// Exemplo 1
		int x, y;
		x = 5;
		y = 10 * x;
		System.out.println(x);
		System.out.println(y);
	}
}
public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		double b;
		a = 5;
		b = 10 * a;
		System.out.println(a);
		System.out.println(b);
		// vai imprimir 50.0 por causa do DOUBLE;
	}
}

public class Exemplo3 {
	public static void main(String[] args) {

		double b, B, h, area;
		//para DOUBLE sempre usar o ponto decimal no número para indicar
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		//area = (recebe) o resultado da expressão
		System.out.println(area);
    // vai imprimir 35.0 por causa do DOUBLE
		
		// para FLOAT sempre usar o f		
		float b1, B1, h1, area1;
		b1 = 6f;
		B1 = 8f;
		h1 = 5f;
		area1 = (b1 + B1) / 2f * h1;
		System.out.println(area1);
    // vai imprimir 35.0 por causa do FLOAT
	}
}
public class Exemplo4 {
	public static void main(String[] args) {
	int a, b;
	double resultado;
	a = 5;
	b = 2;
	resultado = a / b;
	System.out.println(resultado);
//vai imprimir 2.0 por que as variáveis são inteiras
	
	int a1, b1;
	double resultado1;
	a1 = 5;
	b1 = 2;
	// CASTING: converteu os inteiros em double ao adicionar (double) antes da expressão;
  
	resultado1 = (double) a1 / b1;
	System.out.println(resultado1);
}
}

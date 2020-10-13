public class Main {

	public static void main(String[] args) {
		//ln = quebra de linha
		System.out.println("Hello World");
		System.out.println("Bom dia");
		// sem quebra de linha:
		System.out.print("Hellow World");
		System.out.print("Bom dia");
	}

}
public class Exemplos {
	public static void main(String[] args) {
	//sintaxe: <tipo> <nome> = <valor inicial (opicional)>
		
int idade = 25;
double altura = 1.68;
char sexo = 'F';
double x  = 10.893457;

	//saída de dados em JAVA
	// Sem quebra de linhas no final:
System.out.print(idade);
System.out.print(altura);
System.out.print(sexo);
	// Com quebra de linhas no final
System.out.println();
System.out.println(idade);
System.out.println(altura);
System.out.println(sexo);
//Para escrever o conteúdo de uma variável com ponto flutuante
System.out.println(x);
// Para controlar as casas decimais:
// quebra de linha nas casas decimais: %n
System.out.printf("%.2f%n", x);
}
}

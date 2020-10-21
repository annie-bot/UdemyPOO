//Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.

//Sintaxe:
  //( condição ) ? valor_se_verdadeiro : valor_se_falso
  
  //Exemplo:
  
 package Sequencial;
public class condicionalTernaria {
	public static void main(String[] args) 
  {
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Desconto = %.2f", desconto);
	}
}

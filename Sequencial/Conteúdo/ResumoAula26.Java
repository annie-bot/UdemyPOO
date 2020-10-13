package Sequencial;

import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		// Para ler um texto ATÉ A QUEBRA DE LINHA
		// .nextLine();
		
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
    
// Bom dia
// Boa tarde
// Boa noite
  
// vai imprimir: 
  
// DADOS DIGITADOS: 
// Bom dia
// Boa tarde
// Boa noite
    
    
		// Quebra de linha pendente
		int x;
		String s4, s5, s6;
		
		x = sc.nextInt();
		// para evitar o pulo de linha insira um .nextLine(); vazio
		sc.nextLine();
		s4 = sc.nextLine();
		s5 = sc.nextLine();
		s6 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
    
    //29
    // Bom dia
    // Boa tarde
    // Boa noite
    
  // vai imprimir: 
  
    // DADOS DIGITADOS: 
    // 29    
    // Bom dia
    // Boa tarde
    // Boa noite
    
		sc.close();
		}
	}


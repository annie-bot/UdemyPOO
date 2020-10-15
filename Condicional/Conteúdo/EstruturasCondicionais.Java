//Estrutura Condicional Simples:
		// if(condição comparativa ou lógica){
		  // <comando 1>
		  // <comando 2>}
		// Executa o bloco de comandos que for verdadeiro, pula o bloco de comandos falso.
		
//Exemplos:
		int x = 5;
		System.out.println("Bom dia");

		if (x > 0) {
			System.out.println("Boa tarde");
		}
		System.out.println("Bom noite");
		// vai imprimir os 3 comandos

		int y = 5;
		System.out.println("Bom dia");

		if (y < 0) {
			System.out.println("Boa tarde");
		}
		System.out.println("Bom noite");
// vai imprimir apenas "Bom dia" e "Boa noite" pq a condição if não é verdadeira
		
// Estrutura Condicional Composta:
		// if(condição comparativa ou lógica){
		   // <comando 1>
		  // <comando 2>}
		// else {
		  //	<comando 3>
		  //	<comando 4>}
		// Se a condição for verdadeira, executa o bloco IF, se for falsa, executa o bloco ELSE.
	
	//Exemplos:
		
		int hora = 5;
		System.out.println("Quantas horas?");
		Scanner sc = new Scanner(System.in);
		
		hora = sc.nextInt();
		if(hora < 12) {
			System.out.println("Bom Dia!");
		}
		else{
		System.out.println("Boa Tarde!");
		}
		sc.close();
		
//Encadeamento de Estruturas Condicionais:
		//if ( condição 1 ) {
			//comando 1
			//comando 2 }
		//else {
			// if ( condição 2 ) {
			// comando 3
			// comando 4} }
		// else {
			// comando 5
			// comando 6}

	}
}
//Exemplos e exercício aqui:https://github.com/annie-bot/UdemyPOO/blob/main/Condicional/Exerc%C3%ADcios/CondicionaisCompostas.Java

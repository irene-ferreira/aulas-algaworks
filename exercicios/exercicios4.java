package exercicios;

import java.util.Scanner;

public class exercicios4 {
	
	public static void main(String[] args) {
		
		Scanner chave = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		 int anoatual = chave.nextInt();
		 
		 System.out.println("Digite o ano de nascimento: ");
		  int anonascimento = chave.nextInt();
		 
			System.out.println("Digite nome: "  );
	         String nome = chave.next();
	         int idade = anoatual - anonascimento;
	         
	         System.out.println(nome +" tem "  + idade + " anos");	         
	        		 
	         chave.close();
	}

	
}

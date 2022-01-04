package exercicios;

import java.util.Scanner;

public class exercicios3 {

public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Digite o primeiro numero: ");
	int n1 = leitor.nextInt();
	System.out.print("Digite o segundo numero: ");
	int n2 = leitor.nextInt();
	
	int maior; 
	
	if(n1>n2) {
		maior = n1;
		System.out.println("Maior:" +  maior + " Não são iguais");
	}else if (n1<n2){
		maior = n2;
		System.out.println("Maior:" +  maior + " Não são iguais");
	}else {
		System.out.print("São igauis!");	
	}

	leitor.close();
	
}
	
	
	
	
}

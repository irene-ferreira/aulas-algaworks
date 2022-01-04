
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o 1 numero: ");
		int numero1 = teclado.nextInt();
		
		System.out.println("Digite o 2 numero: ");
		int numero2 = teclado.nextInt();
		
		int soma = numero1 + numero2;
		int sub = numero1 - numero2;
		int mult = numero1 * numero2;
		int div = numero1 / numero2;
		
		System.out.println(numero1 + " + " + numero2 + " = " + soma);
		System.out.println(numero1 + " - " + numero2 + " = " + sub);
		System.out.println(numero1 + " x " + numero2 + " = " + mult);
		System.out.println(numero1 + " / " + numero2 + " = " + div);
		
	}
}

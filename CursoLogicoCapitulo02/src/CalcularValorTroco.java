import java. util .Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double ValorProduto = scanner. nextDouble();
		
		System.out.print("Digite quantidade passada pelo cliente: ");
		Double ValorPassadoPeloCliente = scanner.nextDouble();
		
		Double resultado = ValorPassadoPeloCliente - ValorProduto;
		
		System.out.println("Troco: " + resultado);
		
		scanner.close();
		
	}
	
}


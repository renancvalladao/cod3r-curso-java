package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		double salario1 = Double.parseDouble(scanner.nextLine().replace(',', '.'));
		
		System.out.print("Informe o segundo salário: ");
		double salario2 = Double.parseDouble(scanner.nextLine().replace(',', '.'));
		
		System.out.print("Informe o terceiro salário: ");
		double salario3 = Double.parseDouble(scanner.nextLine().replace(',', '.'));
		
		double mediaSalarios = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos salários é " + mediaSalarios);
		
		scanner.close();
	}
}

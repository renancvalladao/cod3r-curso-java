package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro sal�rio: ");
		double salario1 = Double.parseDouble(scanner.nextLine().replace(',', '.'));
		
		System.out.print("Informe o segundo sal�rio: ");
		double salario2 = Double.parseDouble(scanner.nextLine().replace(',', '.'));
		
		System.out.print("Informe o terceiro sal�rio: ");
		double salario3 = Double.parseDouble(scanner.nextLine().replace(',', '.'));
		
		double mediaSalarios = (salario1 + salario2 + salario3) / 3;
		System.out.println("A m�dia dos sal�rios � " + mediaSalarios);
		
		scanner.close();
	}
}

package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // Declara��o e inicializa��o
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
//		a = "...";
		
//		Infere o tipo da vari�vel
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
//		c = 4.5;
		
		double d; // Vari�vel foi declarada
		d = 123.65; // Vari�vel foi inicializada
		System.out.println(d); // Vari�vel foi usada!
		
//		N�o funciona, para utilizar var � necess�rio declarar e inicializar
//		var e;
//		e = 123.45;
		
		var f = 12;
//		f = 12.01;
		System.out.println(f);
	}
}

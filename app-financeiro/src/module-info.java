import br.com.cod3r.app.Calculadora;

module app.financeiro {
	requires java.base; // j� � disponibilizado por padr�o
//	requires app.calculo;
	requires app.api;
	uses Calculadora;
}
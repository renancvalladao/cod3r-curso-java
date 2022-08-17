import br.com.cod3r.app.Calculadora;

module app.financeiro {
	requires java.base; // já é disponibilizado por padrão
//	requires app.calculo;
	requires app.api;
	uses Calculadora;
}
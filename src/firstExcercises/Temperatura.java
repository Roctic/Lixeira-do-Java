package firstExcercises;

public class Temperatura {
	
	public static void main(String[] args) {
		// (ªF - 32) * 5/9 = ªC 
		
		double TemperaturaF = 82.4;
		final double AjusteTemperatura = 32;
		double Parenteses = TemperaturaF - AjusteTemperatura;
		
		final double AjusteValor = 5.0/9.0;
		double resultado = Parenteses * AjusteValor;
		
		System.out.println("A temperatura em Celsius é " + resultado);
		
		/*Correção do Exercício
		 * Apesar do resultado está correto algumas mudanças poderiam ter sido feitas
		 * Primeiro a definição das constantes, realiza-se uma identificação das mesmas
		 * 
		 * Solução >>>
		 * final double FATOR = 5.0/9.0;
		 * final double AJUSTE = 32;
		 * Valores imutáveis colocados em evidência
		 * Após isso as variaveis são inseridas 
		 *
		 * double fahrenheit = 82,4;
		 * double celsius = (fahrenheit - AJUSTE) * FATOR;
		 * (Fª 82.4 - 32) * 0,555555556
		 * System.Out.println("Resultado em Cª " + celsius);
		 * 
		 */
		
		
	}
}

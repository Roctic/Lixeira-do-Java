package firstExcercises;

public class Inferencia {
	
	public static void main(String[] args) {
	//O java consegue interpretar o valor de uma variavel mesmo sem ela ser definida
		
	//X = 4.7;
	
	/*Aqui ele consegue identificar que seria uma variavel double com valor de ponto flutuante
	 * Podendo ser aplicado para Inteiros, Flutuantes e Strings
	 */
	//Variveis com o mesmo nome não podem ser atribuidas a outros valores
	
	/*double Y = 5.0;
	 *Y = "Hello";
	 *Não posso atribuir uma string em uma variavel Inteira
	 */
	
	//O tipo de uma variavel pode ser declarado e inicializado em outro momento
	double Z; //Declaração
	Z = 8.4; //Atribuição
	System.out.println(Z); //Impressão
	
	//Variaveis podem declaradas Flutuantes podem se comportar como Inteiras, o contrário não
	var f = 22.0;
	f = 12;
	System.out.println(f);
	
	
	}
}

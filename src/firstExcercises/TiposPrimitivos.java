package firstExcercises;

public class TiposPrimitivos {
	public static void main(String[] args) {	
	//Existem 8 tipos primitivos no Java
	
	//4 Representam números Inteiros	
	byte anosDeEmpresa = 23;	
	short numeroDeVoos = 542;
	int idUser = 56789;	
	long pontosAcumulados = 3_134_845_223L;
	
	/*O Java não analisa o valor e sim o tipo, long não é reconhecido sem o L no final 
	 * nesse caso é como se o long fosse identificado por um int
	 * _ para separação numérica
	 *(quantidade de bytes armazenados 1, 2, 4 e 8 respectivamente)
	 */ 
	 
	//2 Representam números Reais
	float salario = 1_320.33F;  
	double vendasAcumuladas = 2_991_797_103.01;
	
	//Situação parecida com a anterior, nesse caso se usa o F para definir o ponto flutuante
	
	 System.out.println(anosDeEmpresa *365);
	 System.out.println(numeroDeVoos / 2);
	 System.out.println(idUser + "recebe" + salario);
	 System.out.println(pontosAcumulados / vendasAcumuladas);
	 
	 //Os 2 últimos representam caracteres 
	 boolean Ativo = false; //true
	 char status = 'A'; // /u001, aqui pode ser usado alguma numeração da tabela unicode para representar uma letra, char aceita especificamente apenas UMA letra
	 System.out.println("Funcionário Ativo? " + Ativo);
	 System.out.println("Status " + status);
	 
	
	/*números Literais são os valores adicionados previamente, sem entradas de usuario
	 *int a = 3; Literal Inteiro
	 *double b = 3.2; Literal Double 
	 *Deve se tomar cuidado com as conversões entre tipos, pode ser que ocorra erros
	 *int cabe em double sem problemas, porém o contrário não
	 */
	 
	}
}

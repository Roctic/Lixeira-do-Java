package firstExcercises;

public class NotacaoPonto {
	
	public static void main(String[] args) {
	String s = "Good Morning X";
	s = s.replace("X", "Robot");
	s = s.toUpperCase();
	s = s.concat("???");
	System.out.println(s);
	
	String x = "Sam".toUpperCase();
	System.out.println(x);
	
	String y = "Good Night X"
			.replace("X", "V")
			.toUpperCase()
			.concat("???");
	System.out.println(y);
	
	//Tipos primitivos não possuem operador ".'
	//dá-se a entender que o . seria um método, uma ação ou talvez um verbo
	}

}

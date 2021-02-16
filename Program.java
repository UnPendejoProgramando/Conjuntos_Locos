import java.util.HashSet;
import java.util.Set;

class Program{
	public static void main(String[] args){
		//Set<String> conjunto = new HashSet();
		//conjunto.add("Manzana");
		//conjunto.add("Papaya");
		/*for (String x: conjunto){
			System.out.println(x);
		}*/
		
		Set<String> A = new HashSet();
		Set<String> B = new HashSet();
		
		A.add("1");
		A.add("3");
		A.add("5");
		A.add("8");
		A.add("9");
		A.add("10");
		
		B.add("2");
		B.add("4");
		B.add("6");
		B.add("7");
		B.add("9");
		B.add("10");
		
		System.out.println("UNION");

		A.addAll(B); //Agrega todos los elementos "Hace la union"
			
		for (String x: A){
			System.out.println(x);
		}
		System.out.println("--------------------------------------");
		
		A.add("1");
		A.add("3");
		A.add("5");
		A.add("8");
		A.add("9");
		A.add("10");
		
		B.add("2");
		B.add("4");
		B.add("6");
		B.add("7");
		B.add("9");
		B.add("10");
		System.out.println("Diferencia");

		A.removeAll(B); //Elimina todos los elementos "Hace la diferencia"
		
			
		for (String x: A){
			System.out.println(x);
		}
		System.out.println("--------------------------------------");

		A.add("1");
		A.add("3");
		A.add("5");
		A.add("8");
		A.add("9");
		A.add("10");
		
		B.add("2");
		B.add("4");
		B.add("6");
		B.add("7");
		B.add("9");
		B.add("10");

		
		System.out.println("Interseccion");

		A.retainAll(B); //Elimina los elementos que no estan en ambos conjuntos "Hace la interseccion"
			
		for (String y: A){
			System.out.println(y);
		}
		System.out.println("--------------------------------------");

	}	
}
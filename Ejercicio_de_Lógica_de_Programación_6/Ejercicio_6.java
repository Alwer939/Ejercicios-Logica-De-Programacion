public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa la palabra a invertir");
		String palabra = input.nextLine();
		
//		StringBuilder nos permite realizarle operaciones como un reverse para invertir el String
//		Y con un toString lo convertimos en String simple
		StringBuilder palabraInvertida = new StringBuilder(palabra);
		palabra = palabraInvertida.reverse().toString();
		System.out.println(palabra);
		input.close();
	}

}
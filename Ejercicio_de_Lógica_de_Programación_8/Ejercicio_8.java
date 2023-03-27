package ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {

//	Funcion para descubrir si es primo el numero
	static boolean divisor(int num){
//		Un numero es primo cuando solo s epuede dividir entre el 1 y él mismo
//	    La validacion d e1 es para evitar procesos de cargar el ciclo innecesariamente
		if(num == 1) {
	    	return false;
	    }
//		Con esta verificacion obtenemos si se puede dividir por un numero que no sea el mismo o el 1
		for(int c = 2; c<num ; c++) {
	      if(num % c == 0){
//				Regresar false es por que no es primo, se puede dividir con otro numero
	        return false;
	      }
	    }
//		Regresar true es por que no tiene un divisor que lo deje en 0, por tanto, es primo
	   return true;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] numeros = new int[10]; // Declaramos el tamaño del arreglo en 10
		
		System.out.println("Ingresa los 10 numeros");
		for (int i = 0; i < 10; i++) {
			numeros[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.println("Numeros Ingresados");
		for (int i = 0; i < numeros.length; i++) { // imprimir numeros
			System.out.println("pos["+i+"] = " + numeros[i]);
		}

		int numPrimos = 0;
//		numPrimos es utilizado para indicar el indice en donde ordenaremos el numero primo siguiente
		
		for (int i = 0; i < numeros.length; i++) {
			if(divisor(numeros[i])) { // divisor me da true si es numero primo
				
//				Se realiza un cambio de valor con el indice que sigue en numeroPrimo
				int aux = numeros[numPrimos];
				numeros[numPrimos] = numeros[i];
				numeros[i] = aux;
				numPrimos++;
			}
		}
		System.out.println();
		System.out.println("Numeros Ordenados");
		for (int i = 0; i < numeros.length; i++) { // imprimir numeros
			System.out.println("pos["+i+"] = " + numeros[i]);
		}
		input.close();
	}// Cierre Main
}// Cierre Class
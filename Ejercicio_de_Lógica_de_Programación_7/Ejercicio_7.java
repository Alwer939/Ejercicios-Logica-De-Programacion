public class Ejercicio_7 {
	
	static Scanner input = new Scanner(System.in);
	
//	Validacion para saber si es numero el dato ingresado por el usuario
	public static boolean isNumber(String palabra) {
		boolean resultado;
		try {
            Integer.parseInt(palabra);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
		
		return resultado;
	}
	
//	Validacion para confirmar que la hora sea numero y este en el rango 0 - 24
	public static int validarHora() {
		System.out.println("Ingresa la hora de ese dia iniciando en 0 y terminando en 24");
		String numeroIngresado = input.nextLine();
		
		if(isNumber(numeroIngresado)) {
			int hora = Integer.parseInt(numeroIngresado);
			
			if(hora >= 0 && hora <=24) {
				return hora;			
			}
			else {
				System.out.println("Numero invalido, por favor intenta de nuevo");
				return validarHora();
			}
		}
		else {
			System.out.println("No ingresaste numeros invalido, por favor intenta de nuevo");
//			Mandando un return de la misma funcion dejara de hacer callback hasta que sea true y me regrese el numero
			return validarHora();
		}
	}// Cierre validarHora

//	Validacion para confirmar que los minutos sea numero y este en el rango 0 - 24
	public static int validarMin() {
		System.out.println("Ahora los min, iniciando en 0 y terminando en 60");
String numeroIngresado = input.nextLine();
		
		if(isNumber(numeroIngresado)) {
			int min = Integer.parseInt(numeroIngresado);
			
			if(min >= 0 && min <=60) {
				return min;			
			}
			else {
				System.out.println("Numero invalido, por favor intenta de nuevo");
				return validarMin();
			}
		}
		else {
			System.out.println("No ingresaste numeros invalido, por favor intenta de nuevo");
//			Mandando un return de la misma funcion dejara de hacer callback hasta que sea true y me regrese el numero
			return validarMin();
		}
		
	}// Cierre validarMin
	
	public static int validarDia() {
		System.out.println("Ingresa el dia de la semana del Lunes al Viernes");
		String dia = input.nextLine();
		String [] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
//		Indice y el for me daran el numero de dias que ya pasaron y en el que estoy actualmente
		int indice = -1;
		for(int i=0; i<semana.length && indice == -1; i++){
//			equals me comprueba que sean igual la palabra al del arreglo semana
			if(dia.equals(semana[i])) {
//			guardamos el indice y le sumamos 1 para seleccionar del 1 - 5 los dias y no del 0 - 4
				indice = i + 1;
			}
		}
		
		if(indice == -1) {
			System.out.println("No ingresaste un dia de la semana valido");
			return validarDia();
		}
		else{
			return indice;
		}
	}// Cierre validarDia

	public static void main(String[] args) {
		
		int indice = validarDia();			
		int hora = validarHora();
		int min = validarMin();
		
		int minDia = 24 - hora;
//		Todo lo que tenga en horas lo multiplico * 60 para obtenerlo en minutos
		minDia = minDia *60;
		minDia = minDia - min;
//		Resta me da el numero de dias que siguen hasta el viernes
		int resta = 5 - indice;
//		Por lo que primero lo multiplico *24 que equivale a las hora de un dia
		resta = (resta * 24) *60; // y despues * 60 para obtener el resultado en minutos

		int minActuales = (minDia + resta) - 540; // estos 540 que restamos son las 9 horas que
//													 quedan del viernes de 15 - 24 horas
		System.out.println("Faltan " + minActuales + " minutos para el fin de semana");
		
		input.close();
	}// Cierre Main
}// Cierre Class
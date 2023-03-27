public class Ejercicio_9 {

  //	funcion para ingresar las 20 palabras al diccionario
    public static Map<String, String> ingresarValores() {
      Map<String, String> diccionario = new HashMap<>();
  
  //		Agregar elementos a mi libreta de direcciones
      diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("carta", "card");
        diccionario.put("arbol", "tree");
        diccionario.put("rojo", "red");
        diccionario.put("amarillo", "yellow");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("ordenador", "computer");
        diccionario.put("raton", "mouse");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("montaña", "mountain");
        diccionario.put("baloncesto", "basketball");
        diccionario.put("juego", "game");
        diccionario.put("caballo", "horse");
        diccionario.put("mar", "sea");
        diccionario.put("sonido", "sound");
        diccionario.put("musica", "music");
  
      return diccionario;
    }
    
    public static void main(String[] args) {
      
      Map<String, String> diccionario = new HashMap<>();
  
  //		Agregar elementos a mi libreta de direcciones
      diccionario = ingresarValores();// Traido de una funcion para no llenar el Main con insertaciones
  
      Scanner input = new Scanner(System.in);
      
      System.out.println("Ingresa la palabra a traducir en minusculas");
      String palabra = input.nextLine();
      
      if(diccionario.get(palabra) != null) { // Verificamos si la palabra se encuentra en el diccionario
        System.out.println(diccionario.get(palabra));			
      }
      else {
        System.out.println("La palabra no se encuentra en el diccionario");			
      }
      input.close();
    }// Cierre Main
  }// Cierre Class
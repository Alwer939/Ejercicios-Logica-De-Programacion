public class Ejercicio_10 {
	
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
      
      Scanner input = new Scanner(System.in);
      
      Map<String, String> diccionario = new HashMap<>();
  
  //		Agregar elementos a mi libreta de direcciones
      diccionario = ingresarValores();// Traido de una funcion para no llenar el Main con insertaciones
  
      ArrayList<String> copiaDiccionario = new ArrayList<String>();
        ArrayList<String> palabras = new ArrayList<String>();
        
  //	    addAll me agrega todos los datos a la copia en diccionario
        copiaDiccionario.addAll(diccionario.keySet());// kesySet selecciona unicamente los Keys del HashMap
        Collections.shuffle(copiaDiccionario);
        // shuffle mueve los valores dentro de manera aleatoria, por lo que queda random su contenido
        
        for (int i = 0; i < 5; i++) {// for para agregar los 5 datos o palabras a traducir
          palabras.add(copiaDiccionario.remove(0));// agregamos el que se encuentre en el indice 0 y posterior lo eliminamos
        }										   // del arreglo de la copia del diccionario
        
        int aciertos=0;
        int errores=0;
  
        for (String siguientePalabra : palabras) { // For para pasar por las 5 palabras a traducir
  
          System.out.println("Introduzca la traducción de la palabra " + siguientePalabra);
  
        String traduccion = input.nextLine();
        
        if(traduccion.contains(diccionario.get(siguientePalabra))) { // Verificamos si el contenido existe en el diccionario
              aciertos++;
              System.out.println("Muy bien! Acertaste!!");
        }
        else {
              errores++;
              System.out.println("Lo siento, no es correcta la traduccion :c");
        }
          
          }// Cierre for las palabras a traducir
        System.out.println("Tuviste " + aciertos + " aciertos y " + errores + " equivocaciones en las traducciones.");
      
      input.close();
    }// Cierre Main
  }// Cierre Class
let num1 = prompt("Escribe el Primer número");
let num2 = prompt("Escribe el Segundo número");
let num3 = prompt("Escribe el Tercer número");

const mayorYmenor = (arr = []) => {
  if(!isNaN(arr[0]) && !isNaN(arr[1]) && !isNaN(arr[2])){ // Validar si los datos ingresados son numeros
    
    // sort ordena los datos de menor a mayor
    arr.sort();
    console.log(arr);
    // reverse revierte el indice de los datos, por lo que el ultimo dato ahora es el primero y asi sucesivamente
    arr.reverse();
    console.log(arr);
  }
  else{
    return 'Los datos ingresados no son números';
  }
}

mayorYmenor([num1,num2,num3]);
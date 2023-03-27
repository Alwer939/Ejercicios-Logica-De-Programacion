const obtenerFibonacci = () => {
  let num = prompt("Ingresa el numero para obtener su factorial");
  if(!isNaN(num)){

    if(num != 0){ //  Esta comprovacion es para validar que no se quede en 0 la serie
      let fibo = [0,1]; //  Inicializamos los 2 primeros elementos para facilitar la obtencion de la serie 
      for(let i=2; i < num; i++){  //  Se inicializa i en 2 porque los primeros dos elementos ya los tenemos
        fibo.push(fibo[i-1] + fibo[i-2]); //  Para obetener el siguiente elemento de la serie, sumamos los dos elementos anteriores
      }
      return fibo;
    }
  }
  else{
    alert('El dato ingresado no es número, por favor vuelve a ingresarlo');
    obtenerFibonacci();
  }
}

console.log(obtenerFibonacci());
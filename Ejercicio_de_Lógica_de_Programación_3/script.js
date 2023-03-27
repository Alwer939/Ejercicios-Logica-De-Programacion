const obtenerFactorial = () => {
  let num = prompt("Ingresa el numero para obtener su factorial");
  if(!isNaN(num)){

    parseInt(num);
    let suma = 1;
    for(let i = 1; i<num; i++){
      suma += suma * i;
    }
    return suma;
  }
  else{
    alert('El dato ingresado no es número, por favor vuelve a ingresarlo');
    obtenerFactorial();
  }
}

console.log(obtenerFactorial());
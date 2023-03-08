const convetidorCelcius = () => {
  let num = prompt("Escribe los grados Celcius");
  if(!isNaN(num)){
    parseInt(num);
    return `${num} °C son ${(num * 9/5) + 32} °F y ${num + 273.15} en K `;
  }
  else{
    alert('El dato ingresado no es número, por favor vuelve a ingresarlo');
    convetidorCelcius();
  }
}

console.log(convetidorCelcius());
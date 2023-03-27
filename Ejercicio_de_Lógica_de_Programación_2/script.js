const convetidorCelcius = () => {
  let num = prompt("Escribe los grados Celcius");
  if(!isNaN(num)){

    parseInt(num);

    // a tomar en cuenta: Celcious (C) Farenheit (F) y Kelvin (K)
    // las formulas son las siguientes
    // De Celcious a Farengei solo se multiplican los (C * 9/5) + 32
    // De Celcious a Kelvin solo sumamos C + 273.15
    return `${num} °C son ${(num * 9/5) + 32} °F y ${num + 273.15} en °K `;
  }
  else{
    alert('El dato ingresado no es número, por favor vuelve a ingresarlo');
    convetidorCelcius();
  }
}

console.log(convetidorCelcius());
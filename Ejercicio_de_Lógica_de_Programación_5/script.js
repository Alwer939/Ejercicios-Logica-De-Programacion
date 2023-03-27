const numeroSecreto = 5;
let numeros = [];
const atinarElnumero = () => {
  let num = prompt("Ingresa el numero para intentar atinarle al numero secreto");
  if(!isNaN(num)){
    numeros.push(num);
    if(num != numeroSecreto){
      alert('Ups, el número secreto es incorrecto, vuelve a intentarlo.');  
      atinarElnumero();
    }
    else{
      alert('Felicidades, adivinaste el número secreto.');
      console.log(`A continuacion los numeros que ingresaste: ${numeros}`);
    }
  }
  else{
    alert('El dato ingresado no es número, por favor vuelve a ingresarlo');
    atinarElnumero();
  }
}

atinarElnumero();
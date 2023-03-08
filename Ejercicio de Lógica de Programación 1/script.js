let num1 = prompt("Escribe el Primer número");
let num2 = prompt("Escribe el Segundo número");
let num3 = prompt("Escribe el Tercer número");

const mayorYmenor = (arr = []) => {
  if(!isNaN(arr[0]) && !isNaN(arr[1]) && !isNaN(arr[2])){
    arr.forEach( e => parseInt(e));
    for(let a = 0; a < arr.length ; a++){
      for(let i = a+1; i < arr.length ; i++){
        if(arr[a] < arr[i]){
          let aux = arr[a];
          arr[a] = arr[i];
          arr[i] = aux;
          i = a+1;
        }
      }
    }
    const menTomay = arr;
    return arr + '\n' + menTomay.reverse();    
  }
  else{
    return 'Los datos ingresados no son números';
  }
}

console.log(mayorYmenor([num1,num2,num3]));
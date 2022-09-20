<script>
var teste = parseInt(prompt(""));
var numero = 0;
var contador = 0;

for(let i = 0;i<teste;i++) {
    numero = parseInt(prompt(""));
    for(let j = 2;j<numero;j++) {
        if(numero%j==0) {
            contador++;
        }
    }
    if(contador==0) {
        console.log(numero + " é primo");
        contador = 0;
    } else {
        console.log(numero + " não é primo");
        contador = 0;
    }
}


</script>

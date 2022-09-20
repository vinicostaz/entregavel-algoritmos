<script>
var N = parseInt(prompt("Qual o valor de N?"));
var contador = 0;
var contador2 = 0;

for(let i = 0;i<N;i++) {
    var X = parseInt(prompt("Digite um número"))
    if(X%1===0) {
        contador++;
    } if(X>=1) {
        contador++;
    } if(X<=N) {
        contador++;
    }
    if(contador==3) {
        contador2++;
        contador = 0;
    }
}

console.log("Foram digitados " + contador2 + " inteiros");

</script>

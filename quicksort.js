<script>
function QuickSort(Array){
  if(Array.length <= 1){
    return Array;
  }

  const pivot = Array[Array.length - 1];
  const leftArray = [];
  const rightArray = [];

  for(let i=0; i < Array.length-1;i++){
    Array[i] < pivot ? leftArray.push(Array[i]) :  rightArray.push(Array[i])
  }

  return [...QuickSort(leftArray) ,pivot,...QuickSort(rightArray)];

}

const numeros = [-1,1,654,93,89,999,77,3,22,106,442,-9, -1];
console.log(QuickSort(numeros));


</script>

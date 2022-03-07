const array1 = [1, 3, 2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,43,534,666,98,121,100];

//largest no.
console.log(Math.max(...array1));

//smallest no.
console.log(Math.min(...array1));

//even count
function getEvenNumbers() {
    var arr = [4,5,7,8,14,45,76];
    
    var Counteven = arr.filter(number => number % 2 == 0);
    document.write('Even Numbers: ' + Counteven);
}
getEvenNumbers();
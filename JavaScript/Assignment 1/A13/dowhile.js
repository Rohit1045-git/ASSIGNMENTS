var numbers = [10, 42, 5, 87, 61, 34, 99];
var i = 0; 
var e = 0;
do{
    e = e + numbers[i]; 
    i++;
}while(i < numbers.length) {}

document.write(e);
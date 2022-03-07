let n=prompt("Enter:");
let i=0;
let sum=0;
if (n%3==0 || n%5==0){
    for (let i = 0; i <=n; i++) {
        sum=sum+i;
        
    }
}
else{
    console.log("Please write multiple of 3 and 5 only")
}

console.log(sum);
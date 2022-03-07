let year=prompt("Enter year:")
let n=year+20;
for(year;year<=n;year++){
    if(year%4==0 && year%100==0){
        console.log(year+"its leap year");
    }
    
}
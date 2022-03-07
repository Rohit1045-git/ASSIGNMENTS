let heads = 0;
let tails = 0;
 
    x = (Math.floor(Math.random() * 2) == 0);
    if(x){
    	flip("heads");
    }else{
        flip("tails");
    }


console.log(x);
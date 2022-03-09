let order={
    id:101,
    title:"book of GOATS",
    price:500,
    printorder : function( ){
        return (this.id);
    },
    getPrice : function(){
        return (this.price);
    }
};

let order2=Object.assign({},order);
console.log(order);
console.log(order2);

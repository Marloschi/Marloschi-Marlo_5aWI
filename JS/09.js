for (i = 1; i<=16; i++){
    if(i < 5 || i>8 && i < 13){
        console.log("O")
        
    } else{
        console.log("X")
    }
    if (i%4 == 0){
        console.log("/n")
    }
}

a = 0

for (i = 1; i<=100; i++){

    if (i%2 == 0){
        a += i
    }
}
console.log(a)
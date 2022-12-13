let random = Math.random() * 1000
let randomAsInteger = Math.round(random)
console.log(randomAsInteger)


if (randomAsInteger > 800){
    console.log("Die Zahl ist größer als 800")
}
if (randomAsInteger >= 500 && randomAsInteger <= 800){
    console.log("Die Zahl ist zwischen 500 und 800")
}
if (randomAsInteger >= 200 && randomAsInteger <= 500){
    console.log("Die Zahl ist zwischne 200 und 500")
}
if (randomAsInteger < 200){
    console.log("Die Zahl ist kleiner als 200")
}
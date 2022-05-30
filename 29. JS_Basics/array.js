var myArray = [1, 2, 3, 4, 5];

console.log(myArray[1]); //einzellen stelle ausgeben
console.log(myArray); //array ausgeben
console.log(myArray.length + " elemente"); //array laenge ausgeben



var myArray2 = [];

for(var i = 0; i < 5; i++){
    myArray2[myArray2.length] = "Element " + i;
}
console.log(myArray2)


var myArray3 = [1, 2, 4, 4, 5];
myArray3.splice(3, 1, 4, 3); //splice(index, anzahl der zu löschenden elemente)
console.log(myArray3);
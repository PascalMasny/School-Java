# 2 SA 

# Software-Ergonomie

## Ergonomie

Ergonimie passt die technische Umgebung an den Menschen an.

<br>
<br>

## Software-Ergonomie

- Bedienung der Software
- Funktionalität der Software
- auftretende probleme: Monotonität & Überforderung

=> können zur ablehnung der software führen

## ABC Modell

- Aufgabe
- Benutzer
- Computer

- Aufgabenangemessenheit (geeigente Funktionalitär, keine unnötigen Funktionen)
- Selbstbereibbarkeit (Verständlich mit Feedback)
- Steuerbarkeit (Steuerung des Dialogs duch den user)
- Erwartungskonformität (konsitent, Anpassung an den User)
- Fehlertoleranz (einfache Korektur von Fehlern)
- Individualisierbarkeit (Anpassbarkeit an den User)
- Lernförderlichkeit (Minimierung der Lernzeit)

## Arten von Usern

- Anfänger
- Gelegenheitsnutzer
- Experte

## WIMP 

- Windows
- Icons
- Menues
- Pointer

Erkennungsmerkmale von GUIs
























# Java Script

## Print
```js
console.log("Helle World");
```

```js
alert("Helle World");
```

<br>
<br>

## Variablen

```js
var n = 10;
```

```js
var m = "10";
```

<br>
<br>

```js
var myArray = [1, 2, 3]

console.log(myArray[1]); // 2
console.log(myArray); // [1, 2, 3]
console.log(myArray.length + " elemente"); // 3 Elemente


var myArray2 = [];

for(var i = 0; i < 5; i++){
    myArray2[myArray2.length] = "Element " + i;
}
console.log(myArray2) // Element 1; Element 2 ...


var myArray3 = [1, 2, 4, 4, 5];myArray3.splice(3, 1, 4, 3); //splice(index, anzahl der zu löschenden elemente)
console.log(myArray3);
```

<br>
<br>

## Operatoren

```js
var n = 10;
var m = "10";

console.log(n == m); 
//true bcs. n und m sind gleich, typysierung zählt nicht
```

<br>
<br>

## For Schleifen
```js
//möglichkeit 1
for(i = 0; i <= 5; i++){
    console.log(i); 
}

//möglichkeit 2
var i = 0;
while(i<=5){
    console.log(i);
    i++;
}
```

<br>
<br>

## If

```js
var time = 12;

if (time < 10) {
    greeting = "Good morning";
} 
else if (time < 20) {
    greeting = "Good day";
}
else {
    greeting = "Good evening";
}

console.log(greeting);
```

<br>
<br>

## Fuktionen und Prozeduren

```js
function mySum(var1, var2){
    return var1 + var2;
}

function myPrint(myString){
    console.log(myString);
}
```

<br>
<br>

## Objekte

```js
var myObj = {
    name: "Peter";
    age: 18;
}

console.log(myObj.name + " " + myObj.age);
```

<br>
<br>

## Classen

```js
class MyClass {
    constructor(name, age){
        this.name = name;
        this.age = age;
    }

    myPrint(){
        console.log(this.name + " " + this.age);
    }
}

var myObj = MyClass("Peter", 18);
console.log(Myobj.name + " "+ MyObj.age + " " + MyObj.myPrint);
```


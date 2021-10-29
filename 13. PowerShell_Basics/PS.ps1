#Hello World
echo "Hello World"

#Variablen (keine Datentypen)
$var1 = "Pascal"

#Arrays (@ kann weggelassen werden, sollte aben nicht)
$array = @("Pwershell" , "Bash" , "Perl", "JS")

echo $array[0]
echo $array.Length

# if
if ($var1 -eq "Pascal"){
echo "Hallo Pascal"}
else{
echo "Du bist nicht Passi"}

#schleifen
for ($i=0; $i -lt 4; $i++){
echo $i
}

#foreach
foreach($text in $array){
echo $text}

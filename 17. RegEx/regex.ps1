$pasword_txt = Get-Content -Path .\rockyou_smal.txt

#Aufgbe 1a
$pasword_txt | Measure-Object -Line -Character

#Aufgabe 1b
echo "1234" | Measure-Object -AllStats
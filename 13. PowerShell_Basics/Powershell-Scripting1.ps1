# Aufagbe 1
for ($i=20; $i -lt 41; $i += 2){
echo $i
}

# Aufgabe 2
$n = 0
for ($i=0; $i -lt 41; $i++){
$n = $n + $i
}
echo $n

# Aufgabe 3
$ip = Test-Connection 1.1.1.1 -Quiet
echo $ip

# Aufgabe 4
Write-Host "Hello There"

# Aufgabe 5
$ip_array = @("1.1.1.1" , "8.8.8.8" , "213.2.2.1")

foreach($ip in $ip_array){
    echo $ip
    $ping = Test-Connection $ip -Quiet
    echo $ping
}

#Aufgabe 6
$net = "10.7.0."
$ip_end = 1..5
$ip_range = [System.Collections.Generic.List[string]]::new()

foreach ($i in $ip_end){
    if(Test-Connection $net$i -Quiet -Count 2){
    echo $net$i
    $ip_range.Add($net+$i)
    }
}
$ip_range


foreach($i in $ip_range){
    echo $ip_range
}

#Aufgabe 7
$net = "10.7.4."
$ipend = 1..10

#Remove-Item .\test.csv

foreach($i in $ipend){
    if(Test-Connection $net$i -Count 1 -Quiet){
        Get-NetNeighbor $net$i | Select-Object -Property IPAddress, LinkLayerAddress | Export-Csv -Path .\test.csv -NoTypeInformation -Append -Delimiter ";"
    }  
}
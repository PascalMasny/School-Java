$ip = "10.7.4.1"
$ports = 53

#Remove-Item .\test.csv

foreach($i in $ports){
    Test-NetConnection -computername $ip -Port $ports -InformationLevel Quiet | Export-Csv -Path .\test.csv -NoTypeInformation -Append -Delimiter ";"
}


$ip = "google.com"
$port_array = Import-Csv -Path \commonports.txt -Delimiter ":"


foreach($i in $port_array){
   $resullt = Test-NetConnection -computername $ip -Port $i.Port -InformationLevel Quiet -WarningAction SilentlyContinue

   if($resullt -eq "treu"){
    Write-Host $i.Protokoll ":" $i.Port "=" $resullt
   }
   else{
    Write-Host $i.Protokoll ":" $i.Port "=" $resullt
   }
}


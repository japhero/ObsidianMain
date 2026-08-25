


# Pujan Thread 

Basically, the current telemetry link software is terrible.  
  
  
The transmitter just hucks 8 byte packets into the void and there's no ACK, buffering or automatic power control (needed because if you are transmitting at max power at low distance you can overwhelm the receive signal chain so we transmit at low power locally) theoretically when you lose connection you step up the transmitter power(but we can't detect loss of connection)  
  
So basically implement ACK to monitor loss of signal, increase packet length (less framing overhead), buffer packets locally if we lose connection and dump on regaining connection, and also dynamic power control  


The repo for both transmit and receive are on the GitHub






## OLED
- adafruit SPI and I2C [link](https://www.adafruit.com/product/5297)
- Nominal current is 35mA

### PU res calcs

- $880 \Omega$ min resistor since .2*Vdd is the max LOW voltage for the LED driver 
- in fast mode at 400Khz




## PCB connectors
- Through hole components add costs because the factor must drill holes 

### **Types of connectors**


SETTLED: JST XH 2.5mm

- **Board to board**

- **Wire to board**
	- Terminal block connector
	- Consider 
		- The wireguage 
		- Number of contacts

- **Input/output**


**Info about Connectors**
- Pitch = the center-to-center spacing between adjacent pins.


## Charlie Plexing
- 8 active LED's 
	- https://www.digikey.com/en/products/detail/w%C3%BCrth-elektronik/151051VS04000/4490015 
	- https://www.digikey.com/en/products/detail/kingbright/WP710A10CGDK/20381490







# Power Regulation


## Input connector 

**Pheniox connector**
- https://www.digikey.com/en/products/detail/phoenix-contact/1711026/260390
- 



## Buck converter [Digikey](https://www.digikey.com/en/products/detail/traco-power/TSR-1-2433E/12171286)

**TSR 1E**
- Input voltage: 24V
- Output voltage 3.3 V


## TVS diode [Digikey](https://www.digikey.com/en/products/detail/littelfuse-inc/SMBJ28A-E/27575160)
- 30V 
- TODO: Replace in BOM
- Standoff: 28V
- Clamping max: 45.4V



## FUSE's
- what current 
	- 12A?


**Glass Reusable** 
- [Fuse](https://www.digikey.com/en/products/detail/bel-fuse-inc/3SB-12-R/1009744)
	- Needs holder -> [Holder](https://www.digikey.com/en/products/detail/littelfuse-inc/01240061H/14641014) 
	- [ALT](https://www.digikey.com/en/products/detail/littelfuse-inc/01240060H/14641008)
- Total cost is 3$ with fuses and holder each additional fuse is 1$






## Reverse Polarity input protection

- P-Channel Mosfet with the required specs is hard to find could try reverse polarity input protection:
	- https://www.analog.com/en/resources/technical-articles/low-iq-ideal-diode-controller-with-reverse-input-protection.html
	- 


### P-Channel MosFet
- https://www.digikey.com/en/products/detail/infineon-technologies/IPB120P04P4L03ATMA2/11657627
-  Need to adjust TVS 



# Thermistor selection:

https://www.digikey.com/en/products/detail/tewa-sensors-llc/TT7-10KC8-3/10264800





# Resources 
# Java-Applications
This repository contains working code of advnaced Java applicaitons for commercial purposes.

# Meteorological Aviation Report
METAR (Meteorological Aviation Report) is a format for reporting weather information, either for pilots in pre-flight whether briefings or by meteorologists to aid them in weather forecasting. This application decodes a few sample abbreviations. (+  -  B  DZ  E  HZ  RA  SN).

Here is a sample METAR report:

SPECI KPWK 042100Z 05010KT 10SM BKN030
OVC036 M01/M08 A3049 RMK AO2 T10111078

Translation:
SPECI means that this is an unscheduled METAR report issued when certain criteria are met.
KPWK is the airport identifier for Chicago Executive Airport 18 miles northwest of the city center.
Z means Zulu time (Coordinated Universal Time): 4:21:00pm.
KT means wind direction and speed: direction 50 degrees clockwise from North and speed 10 knots. 
SM means visibility: 10 miles.
BKN means clouds with cloud bottoms at 3,000 ft. are broken (cover 5/8 to 7/8 of sky).
OVC means that clouds with cloud bottoms at 3,600 ft. are overcast (cover all of the sky).
M01/M08 means that the temperature is minus 1 Celsius and that the dew point is minus 8 Celsius.
A indicates an altimeter pressure reading of 10.49 inches of mercury.
RMK means that the Remarks Section follows.
A02 indicates that the station is automated with a precipitation discriminator
T10171017 is a breakdown of the temperature and dew point in eight digits separated into two groups of four.

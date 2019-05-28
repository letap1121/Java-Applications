# Java-Applications
This repository contains working code of advnaced Java applicaitons for commercial purposes.

# Meteorological Aviation Report Application
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

# Postal Numeric Encoding Technique Application
Print Address with POSTNET bar code. (POSTNET means Postal Numeric Encoding Technique.)

For each line the address is written like the examples to the output file labels.txt:
Anna Lee
123 Nice Street
Memphis TN 38141-8346
|::||:|::|::::||:|::|:::|||::|:::||::|::|:||::::|:||

Stan Smith
456 De La Vina Street
Santa Barbara CA 93101-3298
||:|::::||::::||||::::::||::||:::|:||:|::|::|::|::||

The bar code is encoded using this table:
 
1	2	3	4	5	6	7	8	9	0
:::||	::|:|	::||:	:|::|	:|:|:	:||::	|:::|	|::|:	|:|::	||:::

In addition to encoding the 9 digits of the zip code, the bar code includes initial (i) and terminal (t) frame bars and a check sum (cs), which is 10 - the sum of the zip code digits mod 10. Thus the zip code 38141-8346 is encoded like this:
i   3     8     1     4     1     8     3     4     6     cs  t
| ::||: |::|: :::|| :|::| :::|| |::|: ::||: :|::| :||:: ::|:| |

The sum of the digits is 38 and 38 % 10 is 8, so the  sum is 10 - 8 = 2. The initial and terminal frame bars are always |.

# Transaction Manager Application
Implements and tests the base class Transaction, and the derived classes GoldTransaction, and LumberTransaction.

The Transaction class implements the PurchaseReceipt interface, which inherits from the Comparable interface. This means that in addition to supplying the methods getId, getBuyer, getSeller, and getAmount, a compareTo method is also supplied. It returns 1 if this._id > other._id, it should return -1 if this._id > other._id; or return 0 if this._id == other._id.

Included a traditional test class Test1 and a JUnit test class Test2 that tests all of the methods in the Transaction class, and all of the non-inherited methods in the derived classes. Overridden methods are tested again for the derived classes. 

Implemented and tested a TransactionManager class that manages objects that implement the PurchaseReceipt interface.  These objects are Transaction objects and the objects of their derived classes.

The Transaction and TransactionManager classes implement the Serializable interface so that it can be serialized to or deserialized from a .ser file. 

Wrote a traditional test class Test3 that tests the TransactionManager class.

# Transaction Checker For Transaction Manager (Observer Pattern)

Implements and test the base class Transaction, and the derived classes GoldTransaction, and LumberTransaction.

The Transaction class implements the PurchaseReceipt interface, which inherits from the Comparable interface. This means that in addition to supplying the methods getId, getBuyer, getSeller, and getAmount, a compareTo method is also supplied. It returns 1 if this._id > other._id, it should return -1 if this._id > other._id; or return 0 if this._id == other._id.

Included a traditional test class Test1 and a JUnit test class Test2 that tests all of the methods in the Transaction class, and all of the non-inherited methods in the derived classes. Overridden methods are tested again for the derived classes. 

Implemented and tested a TransactionManager class that manages objects that implement the PurchaseReceipt interface.  These objects are Transaction objects and the objects of their derived classes.

The Transaction and TransactionManager classes implement the Serializable interface so that it can be serialized to or deserialized from a .ser file. 

Wrote a traditional test class Test3 that tests the TransactionManager class.

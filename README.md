# E-LEARNING REST API WITH SPRING BOOT

### INHERITANCE STRATEGY
A resource could be of different types either, File, Text or Video. Checkout the Database as different inheritance strategy were implemented.
1. SINGLE_TABLE: A single table per class hierarchy.
![SINGLE_TABLE.png](src%2Fmain%2Fresources%2Fstatic%2FSINGLE_TABLE.png)

2. JOINED: A strategy in which fields that are specific to a subclass are mapped to a separate table than the fields that are common to the parent class, and a join is performed to instantiate the subclass.
![JOINED.png](src%2Fmain%2Fresources%2Fstatic%2FJOINED.png)

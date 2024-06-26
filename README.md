# SPRING DATA JPA

### INHERITANCE STRATEGY
A resource could be of different types either, File, Text or Video. Checkout the Database as different inheritance strategy were implemented. Checkout the commit history in this repo to know the difference implementations.
1. SINGLE_TABLE: A single table per class hierarchy. The Resource table includes all attribute from its child class(File, Text, Video)
![SINGLE_TABLE.png](src%2Fmain%2Fresources%2Fstatic%2FSINGLE_TABLE.png)

2. JOINED: A strategy in which fields that are specific to a subclass are mapped to a separate table than the fields that are common to the parent class, and a join is performed to instantiate the subclass. Each table(File, Text, Video) would include the attribute from its class.
![JOINED.png](src%2Fmain%2Fresources%2Fstatic%2FJOINED.png)

3.TABLE_PER_CLASS: A table per concrete entity class. Each table(File, Text, Video) would include the attribute from the parent class(Resource)
![TABLE_PER_CLASS.png](src%2Fmain%2Fresources%2Fstatic%2FTABLE_PER_CLASS.png)

### EMBEDDABLE
@Embeddable, it means instances of that class can be embedded within other entities.
<p>In the embedded package, the OrderId class was used to create componsite primary class in the Order entity class.
The Address class was used to create entity instance in Order entity class 
</p>
NB: The scenario above was used to understand the concept of embeddable, and is no way a functional feature in this project
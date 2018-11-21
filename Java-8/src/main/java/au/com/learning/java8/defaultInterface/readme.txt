1. Usually, when a new abstract method is added to an interface, all implementing 
classes will break until they implement the new abstract method. 
In Java 8, this problem has been solved by the use of default method. 

2. In case of a class implementing two interfaces with same default method in both 
interfaces, compiler forces to add an implementation for the default method to 
avoid the diamond problem. It is ok to add a method with exactly the same definition 
in the implementing class without overriding. This will not cause diamond problem either as 
as the method defined in implementing class will always take precedence. 


2. Cannot have implementation for a method in an interface without defining it default or static. 

3. Static methods of an interface are not accessible using an instance object. They are accessible 
only through interface. InterfaceA.staticMethod(). However, Static methods of a class
are accessible through instance object as well. 

https://www.buggybread.com/2014/10/java-8-interview-questions-and-answers.html 

 
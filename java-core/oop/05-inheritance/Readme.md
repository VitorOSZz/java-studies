# Inheritance

Inheritance is the ability of a class to inherit from another class.  
It is one of the pillars of Object-Oriented Programming (OOP).

You can create a class called `Animal`, then create a class `Dog` that extends `Animal`, and a class `Cat` that also extends `Animal`.  
Each subclass can have its own exclusive features or override methods from the parent class. This will be explained in the Polymorphism section.

## How to create a subclass

It’s simple. In another class file, write:

```java
public class Cat extends Animal
```
Now, Cat has access to all attributes and methods of Animal.

Note: it is important to use inheritance only when it is really appropriate.  
In this example, Cat and Dog are truly animals.

## Benefits of Inheritance

- Code reuse
- Better organization
- Easier maintenance
- Support for polymorphism

# Polymorphism

Polymorphism is when a subclass inherits from a superclass, like “Cat extends Animal”, and Animal has a method.

```java
public String doSound() {
    return "Sound";
}
```
And Cat wants to have the same method, but returning “Meow” instead of “Sound”.
To do that, we use overriding.

## Overriding

Overriding is overriding a method that already exists in the superclass.

```java
@Override // Indicates that this method overrides a superclass method
public String doSound() {
    return "Meow";
}
```
Now, if an instance of Cat calls this method, the output will be “Meow”.
But this is not the only type of polymorphism that exists in Java.
Java also supports overloading.

## Overloading

Overloading is having more than one way to use a method, by changing its parameters.
In the Cat example, another instance of Cat may want to make a different sound, like “Meooow”, or return an empty String.

To do that:

```java
public String doSound() {
    return "Meow";
}

public String doSound(String text) {
    return text;
}
```
Now, this class can call the method with the default output “Meow”, or pass a new text and return it.
This is overloading.
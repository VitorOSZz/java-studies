# Wrapper Classes
"Java is OOP", this is true, but it has an exception because primitive types aren’t objects. (And this isn’t a problem; it’s actually an advantage.)
For databases, collections, ArrayLists, and others, this is a limitation.
To fix that in Java, you can create objects that wrap the primitive types. The table below shows the mapping:

## Table

```
byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
boolean -> Boolean
char -> Character
```


## Null value
An important and relevant fact about Wrapper classes is primitive types don't accept null, it's a compile error, but with wrapper classes you can put null type in a variable, like:

```
public class Main {
    public static void main(String[] args) {
        Integer cellphone = null;
        String secret = null;
        System.out.println(cellphone);
        System.out.println(secret);
    }
}
```

Expected:

```
null
null
```
Note: if "cellphone + 1" happens, a NullPointerException will occur.
## Integer
you can put an int value on an Integer variable like:

```
public class Main {
    public static void main(String[] args) {
        // Create an Integer arrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Adding: This Value is first a double, cast to int.
        for (int i = 0; i < 5; i++) {
            arrayList.add((int) (Math.random()*100));
        }
        // Adding: int
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        for (Integer i : arrayList) {
            System.out.println(i + " | class: " + i.getClass());
        }
    }
}
```
Expected: "x | class: class java.lang.Integer"

Integer can get an int and change to Integer. And that's autoboxing, the reverse is unboxing

### Integer Methods
``Integer.parseInt()`` to put a String and get an int

``Integer.toBinaryString()`` to get int in Binary code

``Integer.toHexString()`` to get int in Hex code


# 1- Memory
## In the memory we have two parts: *Stack* and *Heap*

### Stack
#### Stack is a memory area to store variables.
#### If the variable is a primitive type, it stores the variable with its data. If it's not, when it is an object (an instance of a class) it is only a reference. Note java does not have pointers, so we call it reference.
### Note: In java String is an object.

### Heap
#### Heap is a memory area to store data of objects.
#### For variables that are not primitive types (objects), they exist in the stack but the value of that variable is just a reference.
### The reference tells where the data is in the heap. In other words, the data is on the heap, and the variable in the stack refers to that data.

```
public class Main {
    public static void main(String[] args) {

        int x = 10;
        Product y = new Product("Tv", 750.99, 10);
    }
}
```

```
public class Product {

    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

```

![alt text](images/1-memory-area.png "Memory area")

# 2- Aliasing
## A curious fact and source of many bugs for inattentive developers is aliasing, a situation that occurs when two variables refer to the same object in the heap.
```
public class Main {
    public static void main(String[] args) {

        Product x = new Product("Tv", 750.99, 10);
        Product y = x;

        System.out.println(x.name);
        y.name = "Computer";
        System.out.println(x.name);
    }
}
```

Output:
```
Tv
Computer
```

![alt text](images/2-1.aliasing.png "Memory area")
![alt text](images/2-2.aliasing.png "Memory area")

#### "But why are there two String objects here if "TV" is no longer in the code?" the answer is on next chapter: Garbage Collector

# 3- Garbage Collector
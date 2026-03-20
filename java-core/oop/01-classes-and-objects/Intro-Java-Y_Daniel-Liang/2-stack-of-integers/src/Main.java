import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(0);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(5);
        stack.push(5);
        stack.push(8);
        stack.push(9);

        System.out.printf("Stack Contents: %s\n", Arrays.toString(stack.getElements()));
        System.out.printf("Stack.pop: %s\n", stack.pop());
        System.out.printf("Stack Contents: %s\n", Arrays.toString(stack.getElements()));
        System.out.printf("Stack.peek: %s\n", stack.peek());
        System.out.printf("Stack Contents: %s\n", Arrays.toString(stack.getElements()));
        System.out.printf("Stack.getSize: %s\n", stack.getSize());

        System.out.println();
        System.out.println();
        stack.removeEvery(5);
        System.out.println("Removed every 5");
        System.out.printf("Stack Contents: %s\n", Arrays.toString(stack.getElements()));
        System.out.printf("Stack.pop: %s\n", stack.pop());
        System.out.printf("Stack Contents: %s\n", Arrays.toString(stack.getElements()));
        System.out.printf("Stack.peek: %s\n", stack.peek());
        System.out.printf("Stack Contents: %s\n", Arrays.toString(stack.getElements()));
        System.out.printf("Stack.getSize: %s\n", stack.getSize());

    }
}
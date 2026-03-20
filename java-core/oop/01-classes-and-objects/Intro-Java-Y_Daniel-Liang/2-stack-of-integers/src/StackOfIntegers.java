public class StackOfIntegers {
    private Integer[] elements;
    private int size;

    public StackOfIntegers() {
        this.size = 16;
        this.elements = new Integer[size];
    }

    public StackOfIntegers(int size) {
        this.size = size;
        this.elements = new Integer[size];
    }

    public void push(int value) {
        int index = 0;

        for (Integer i : elements) {
            if ( i == null) {
                elements[index] = value;
                return;
            }
            index++;
        }
    }

    public Integer pop() {
        int index = 0;
        Integer lastElement = null;

        for (int i = this.elements.length-1; i > 0; i--) {
            if (this.getElements()[i] != null) {
                lastElement = this.getElements()[i];
                this.getElements()[i] = null;
                return lastElement;
            }
        }
        return -1;
    }

    public Integer peek() {
        int index = 0;
        Integer lastElement = null;

        for (Integer i : elements) {
            if (i != null) {
                lastElement = i;
            }
            index++;
        }
        return lastElement;
    }

    public Integer[] getElements() {
        return this.elements;
    }

    public int getSize() {
        int size = 0;
        for (Integer i : this.elements) {
            if (i != null) {
                size++;
            }
        }

        return size;
    }

    public void removeEvery(int value) {
        for (int i = this.elements.length-1; i > 0; i--) {
            if (this.getElements()[i] != null && this.getElements()[i] == value) {
                this.elements[i] = null;
            }
        }
    }
}

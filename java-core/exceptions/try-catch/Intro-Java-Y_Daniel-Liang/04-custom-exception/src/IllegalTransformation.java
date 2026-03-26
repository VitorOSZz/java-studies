public class IllegalTransformation extends Exception {

    public IllegalTransformation() {
        super("Illegal transformation");
    }

    public IllegalTransformation(String name) {
        super(name);
    }

    public IllegalTransformation(String name, Throwable cause) {
        super(name, cause);
    }
}

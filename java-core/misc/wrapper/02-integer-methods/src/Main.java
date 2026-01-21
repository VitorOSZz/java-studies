public class Main {
    public static void main(String[] args) {
        String id = "5041";

        //=Integer intId = id; => java: incompatible types: java.lang.String cannot be converted to java.lang.Integer
        int intId = Integer.parseInt(id);


        System.out.println(intId+50);
        System.out.println("52 in Binary: " + Integer.toBinaryString(52));
        System.out.println("52 in Hex: " + Integer.toHexString(52));
    }
}
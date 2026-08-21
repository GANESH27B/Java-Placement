public class WrapperClasses {
    public static void main(String[] args) {
        int primitiveValue = 42;
        Integer boxedValue = primitiveValue;
        int unboxedValue = boxedValue;
        Integer parsedValue = Integer.parseInt("100");

        System.out.println("Boxed: " + boxedValue);
        System.out.println("Unboxed: " + unboxedValue);
        System.out.println("Parsed: " + parsedValue);
    }
}
public class StaticAndInstanceMethod {
    static void staticMethod() {
        System.out.println("This is a static method");
    }

    void instanceMethod() {
        System.out.println("This is an instance method");
    }

    public static void main(String[] args) {
        staticMethod();

        StaticAndInstanceMethod example = new StaticAndInstanceMethod();
        example.instanceMethod();
    }
}
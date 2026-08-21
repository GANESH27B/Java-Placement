public class Strings {
    public static void main(String[] args) {
        String message = "Java Programming";

        System.out.println("Length: " + message.length());
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Contains Java: " + message.contains("Java"));
        System.out.println("First word: " + message.substring(0, 4));

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" Java");
        System.out.println("StringBuilder: " + builder);
    }
}
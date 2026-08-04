import java.util.*;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "hello world";
        String s3 = "   Java Programming   ";

        System.out.println("length(): " + s1.length());

        System.out.println("charAt(1): " + s1.charAt(1));

        System.out.println("substring(6): " + s1.substring(6));

        System.out.println("substring(0,5): " + s1.substring(0,5));

        System.out.println("equals(): " + s1.equals(s2));

        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));

        System.out.println("compareTo(): " + s1.compareTo(s2));

        System.out.println("compareToIgnoreCase(): " + s1.compareToIgnoreCase(s2));

        System.out.println("contains(): " + s1.contains("World"));

        System.out.println("startsWith(): " + s1.startsWith("Hello"));

        System.out.println("endsWith(): " + s1.endsWith("World"));

        System.out.println("indexOf('o'): " + s1.indexOf('o'));

        System.out.println("lastIndexOf('o'): " + s1.lastIndexOf('o'));

        System.out.println("replace(): " + s1.replace("World", "Java"));

        System.out.println("replaceFirst(): " + "Java Java".replaceFirst("Java", "Python"));

        System.out.println("replaceAll(): " + "Java Java".replaceAll("Java", "Python"));

        System.out.println("toUpperCase(): " + s1.toUpperCase());

        System.out.println("toLowerCase(): " + s1.toLowerCase());

        
        System.out.println("trim(): " + s3.trim());

        System.out.println("strip(): " + s3.strip());

        System.out.println("stripLeading(): '" + s3.stripLeading() + "'");

        System.out.println("stripTrailing(): '" + s3.stripTrailing() + "'");

        String[] arr = s1.split(" ");
        System.out.println("split(): " + Arrays.toString(arr));

        System.out.println("concat(): " + s1.concat(" Welcome"));

        System.out.println("isEmpty(): " + "".isEmpty());

        System.out.println("isBlank(): " + "   ".isBlank());

        char[] ch = s1.toCharArray();
        System.out.print("toCharArray(): ");
        for(char c : ch)
            System.out.print(c + " ");
        System.out.println();

        byte[] bytes = s1.getBytes();
        System.out.println("getBytes(): " + Arrays.toString(bytes));

        char[] c = new char[5];
        s1.getChars(0,5,c,0);
        System.out.println("getChars(): " + Arrays.toString(c));

        System.out.println("matches(): " + "12345".matches("\\d+"));

        System.out.println("hashCode(): " + s1.hashCode());
        System.out.println("intern(): " + s1.intern());

        System.out.println("valueOf(): " + String.valueOf(123));

        char[] letters = {'J','A','V','A'};
        System.out.println("copyValueOf(): " + String.copyValueOf(letters));

        System.out.println("join(): " + String.join("-", "A","B","C"));

        System.out.println("format(): " + String.format("Age = %d", 22));

        System.out.println("repeat(): " + "Hi ".repeat(3));

        System.out.println("lines():");
        String multi = "Java\nPython\nC++";
        multi.lines().forEach(System.out::println);

        System.out.println("subSequence(): " + s1.subSequence(0,5));

        System.out.println("contentEquals(): " + s1.contentEquals("Hello World"));
    }
}
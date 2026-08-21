import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++");
        languages.forEach(language -> System.out.println(language));
    }
}
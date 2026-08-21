import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandling {
    public static void main(String[] args) {
        Path file = Path.of("java-concepts-example.txt");

        try {
            Files.writeString(file, "Java file handling");
            System.out.println(Files.readString(file));
            Files.deleteIfExists(file);
        } catch (IOException exception) {
            System.out.println("File error: " + exception.getMessage());
        }
    }
}
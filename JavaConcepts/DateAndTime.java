import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate examDate = today.plus(30, ChronoUnit.DAYS);
        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println("Today: " + today);
        System.out.println("Exam date: " + examDate);
        System.out.println("Current date and time: " + currentTime);
    }
}
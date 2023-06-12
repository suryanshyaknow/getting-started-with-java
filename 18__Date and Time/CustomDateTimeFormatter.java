import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomDateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime dtnow = LocalDateTime.now();
        System.out.println("now: " + dtnow);

        // Formatting the date as per desired pattern
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy H:m:ss (E)");
        System.out.println("now (formatted): " + dtnow.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println("now (ISO_OFFSET_DATE): " + dtnow.format(dateTimeFormatter2));
    }
}

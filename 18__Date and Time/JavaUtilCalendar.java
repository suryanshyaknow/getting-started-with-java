import java.util.Calendar;
import java.util.TimeZone;

public class JavaUtilCalendar {

    public static void main(String[] args) {

        /**
         * Calendar (java.util.Calendar)
         * 
         * Calendar class is an abstract class, so we cannot create an instance of it
         * directly. Instead, we can use the `getInstance()` method to obtain a Calendar
         * object that represents the current date and time based on the default time
         * zone and locale.
         */
        Calendar cal = Calendar.getInstance();
        // System.out.println("Calendar cal: " + cal);
        System.out.println("cal.getCalendarType() = " + cal.getCalendarType()); // gregory
        System.out.println("cal.getTimeZone() = " + cal.getTimeZone());
        System.out.println("cal.getTimeZone().getId() = " + cal.getTimeZone().getID());
        System.out.println();
        
        Calendar calDubai = Calendar.getInstance(TimeZone.getTimeZone("Asia/Dubai"));
        System.out.println("calDubai.getCalendarType() = " + calDubai.getCalendarType()); // gregory
        System.out.println("calDubai.getTimeZone() = " + calDubai.getTimeZone());
    }
}

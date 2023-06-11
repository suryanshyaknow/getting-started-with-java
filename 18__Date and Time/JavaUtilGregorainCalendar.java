import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaUtilGregorainCalendar {
    public static void main(String[] args) {

        // Initializing an instance of class `GregorianCalendar`
        GregorianCalendar gcal = new GregorianCalendar();

        // isLeapYear()
        System.out.println("gcal.isLeapYear(1972) = " + gcal.isLeapYear(1972));
        System.out.println("gcal.isLeapYear(1999) = " + gcal.isLeapYear(1999));

        /**
         * `roll(int field, boolean up)`
         * 
         * This method adds/subtracts a single unit of time from the specified time
         * field.
         * true = rolls up the value by 1.
         * false = rolls down the value by 1.
         */
        System.out.println("Date before rolling: " + gcal.getTime());

        gcal.roll(Calendar.MONTH, true);
        gcal.roll(Calendar.DATE, false);
        gcal.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling: " + gcal.getTime());

        /**
         * `hashcode()`
         * 
         * This method returns the hashcode of the calendar object.
         */
        System.out.println("The hashcode for this calendar is: " + gcal.hashCode());

    }
}

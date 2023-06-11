import java.util.Date;

/**
 * java.util.Date
 * 
 * In Java, dates are typically stored using the `java.util.Date` class or its
 * subclasses. However, it's important to note that `java.util.Date` is a bit
 * outdated and has some limitations.
 * 
 * Java provides a more robust date and time API starting from Java 8 with the
 * `java.time` package.
 * 
 * i. The `java.util.Date` class internally represents a date as the number of
 * milliseconds since "January 1, 1970, 00:00:00 GMT" (also known as the epoch).
 * 
 * This means that it stores a date and time value as a long integer
 * representing the number of milliseconds elapsed since the epoch.
 * 
 * ii. Moreover, the `java.util.Date class`, which is part of the older date and
 * time API, represents dates starting from the year 1900.
 */
public class JavaUtilDate {
    public static void main(String[] args) {

        System.out.println("Number of hours passed since 1970: " + System.currentTimeMillis() / 1000 / 60 / 60);

        // Current Date and Time
        Date currentDate = new Date(); // represents the time at which it was allocated, measured to the nearest
                                       // millisecond.
        System.out.println("Current date and time: " + currentDate);
        System.out.println("currentDate.getTime() = " + currentDate.getTime());
        System.out.println("currentDate.getDate() = " + currentDate.getDate());
        System.out.println("currentDate.getYear() = " + currentDate.getYear());
        System.out.println();

        /**
         * NOTE: The year parameter is an offset from 1900. Therefore, 0 represents the
         * year 1900.
         */
        Date date1 = new Date(0, 11, 26);
        System.out.println(date1);
        System.out.println("date1.getTime() = " + date1.getTime());
        /**
         * NOTE: The reason we are getting a negative value when calling date1.getTime()
         * is due to the way the java.util.Date class handles dates before "January 1,
         * 1970".
         * 
         * Any date before this reference point will have a negative value when calling
         * the getTime() method.
         */
        System.out.println("date1.getDate() = " + date1.getDate());
        System.out.println("date1.getYear() = " + date1.getYear());
        System.out.println();

        Date date2 = new Date(-1900, 11, 26);
        System.out.println(date2);
        System.out.println("date2.getTime() = " + date2.getTime());
        System.out.println("date2.getDate() = " + date2.getDate());
        System.out.println("date2.getYear() = " + date2.getYear());
        System.out.println();
    }
}

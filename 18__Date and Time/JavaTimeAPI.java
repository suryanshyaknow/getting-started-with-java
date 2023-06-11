import java.time.*;

public class JavaTimeAPI {
    public static void main(String[] args) {

        /**
         * `Clock` class (abstract)
         * 
         * This class provides access to the current instant, date and time zone
         * using a time-zone.
         */
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl);
        System.out.println("cl.getZone()" + cl.getZone());
        System.out.println("cl.instant() = " + cl.instant());
        System.out.println();

        /**
         * `Duration` class (abstract)
         * 
         * This class is used to measure time in seconds and nano seconds.
         * This class is immutable.
         */
        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON); // LocalTime.MIN = '00:00' , LocalTime.NOON =
                                                                       // '12:00'
        System.out.println(d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN); // LocalTime.MAX = '23:59:59.999999999' ,
                                                                      // LocalTime.MIN = '00:00'
        System.out.println(d2.isNegative());
        System.out.println();

        /**
         * `LocalDate` class (abstract)
         */
        LocalDate lDate = LocalDate.now();
        System.out.println(lDate);

        // Returns a copy of the LocalDate but alters the year as per argument passed
        System.out.println(lDate.withYear(1999));
        System.out.println();

        /**
         * `LocalTime` class (abstract)
         */
        LocalTime lTime = LocalTime.now();
        System.out.println(lTime);

        LocalTime t1 = LocalTime.of(1, 29, 59);
        System.out.println("Time before: " + t1);
        LocalTime t2 = t1.plusHours(1);
        System.out.println("Time after: " + t2);
        System.out.println();

        /**
         * `LocalDateTime` class (abstract)
         */
        LocalDateTime dtnow = LocalDateTime.now();
        System.out.println(dtnow);

    }
}

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String name = "Spidey";
        int year = 1999;

        // String Interpolation
        float a = 1972.99f;
        System.out.printf("The name is %s and was born in the year %d.\n", name, year);
        System.out.format("The name is %s and was born in the year %d.\n", name, year);
        System.out.format("a = %8.2f\n", a); // 8 spaces shall be taken including the rest of the digits

        // String Methods
        // String.substring(start, end)
        String say_what = "Spidey they say!";
        System.out.println(say_what.substring(5));
        System.out.println(say_what.substring(5, 10)); // excluding the 10th idx

        // String.replace(toBeReplaced, replaceBy)
        // Will replace every occurrence of `toBeReplaced` by `replaceBy`!
        System.out.println(say_what.replaceAll("say", "know"));

        // String.startsWith("something")
        System.out.println("say_what.startsWith(\"Spi\") = " + say_what.startsWith("Spi"));
        System.out.println("say_what.startsWith(\"Spy\") = " + say_what.startsWith("Spy"));

        // String.endsWith("something")
        System.out.println("say_what.endsWith(\"say!\") = " + say_what.endsWith("say!"));
        System.out.println("say_what.endsWith(\"said!\") = " + say_what.endsWith("said!"));

        // String.charAt(idx)
        System.out.println("say_what.charAt(5) = " + say_what.charAt(5));

        // string.indexOf() and string.lastIndexOf()
        say_what = "Spidey they say and say!";
        System.out.println("say_what.indexOf(\"say\") = " + say_what.indexOf("say"));
        System.out.println("say_what.lastIndexOf(\"say\") = " + say_what.lastIndexOf("say"));

    }
    
}

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        System.out.print("Enter your favourite rapper: ");
        Scanner scanner = new Scanner(System.in);
        String favRapper = scanner.nextLine();

        // switch (favRapper) {
        //     case "Shady":
        //         System.out.println("Why be a king when you could be a God?!");
        //         break;
        //     case "Drizzy":
        //         System.out.println(
        //                 "I been losin' friends and findin' peace,\nBut honestly, that sound like a fair trade to me.");
        //         break;
        //     case "Tupac":
        //         System.out.println("All eyez on me!");
        //         break;
        //     case "Narci":
        //         System.out.println("Janani, mai 'raamdoot' Hanuman.");
        //         break;

        //     default:
        //         System.out.println("They Don't Give A F*** About Us!");
        // }

        // Enhanced Switch
        switch (favRapper) {
            case "Shady" -> System.out.println("Why be a king when you could be a God?!");
            case "Drizzy" -> System.out.println(
                    "I been losin' friends and findin' peace,\nBut honestly, that sound like a fair trade to me.");
            case "Tupac" -> System.out.println("All eyez on me!");
            case "Narci" -> System.out.println("Janani, mai 'raamdoot' Hanuman.");

            default -> System.out.println("They Don't Give A F*** About Us!");
        }

        scanner.close();
    }
    
}

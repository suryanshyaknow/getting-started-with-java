
// ########################### Default Methods In Interfaces ############################### 
/*
 * Before Java 8, interfaces in Java were limited to declaring only abstract methods, which 
 * meant that they could not provide any default implementation. However, starting with Java 8, 
 * interfaces can also provide default implementations for methods using the `default` keyword.
 * 
 * Default methods enable us to add new functionalities to existing interfaces while not forcing
 * them on their subclasses at the same time.
 * 
 * Interfaces can also include private methods for default methods to use.
 */

class CellPhone {

    void placeCall(int phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    void pickCall() {
        System.out.println("Connecting your call...");
    }
}

interface Camera {

    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("\nAyo!");
    }

    default void recordIn4K() {
        greet();
        System.out.println("Recording in 4K...\n");
    }

}

interface Wifi {

    String[] networks = { "RedDeath", "Akatsuki" };

    String[] getNetworks();

    void connectToNetwork(String network);
}

// Sub-class inheriting a class and implementing multiple interfaces
class SmartPhone extends CellPhone implements Camera, Wifi {

    public void takeSnap() {
        System.out.println("Taking a snap...");
    }

    public void recordVideo() {
        System.out.println("Recording a video...");
    }

    public String[] getNetworks() {
        System.out.println("Getting a list of your networks...");
        return networks;
    }

    public void connectToNetwork(String network) {

        System.out.println("Connecting to " + network);
    }

}

public class DefaultMethods {
    public static void main(String[] args) {

        SmartPhone mob = new SmartPhone();
        mob.takeSnap();
        mob.recordVideo();
        mob.recordIn4K();

        String[] networks = mob.getNetworks();
        for (String net : networks) {
            System.out.println(net);
        }

        // Polymorphism in Interfaces
        /*
         * Polymorphism is a fancy word for the idea that different objects can be used
         * in the same way, even if they are of different type.
         */
        System.out.println();
        Camera cam = new SmartPhone(); // To be used as a camera only
        cam.takeSnap();
        cam.recordVideo();
        cam.recordIn4K();

        // Told ya, should be used as camera only
        // cam.placeCall(); // Not allowed
        // cam.pickCall(); // Not allowed
        // String camNetworks = cam.getNetworks(); // Not allowed

        // Likewise the following object shall only be used as Wifi
        Wifi wifi = new SmartPhone();
        System.out.println(wifi.getNetworks()); // Will return a reference

    }
}

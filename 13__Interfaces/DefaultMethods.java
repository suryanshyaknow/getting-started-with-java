
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

class CellPhone {

    void placeCall(int phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    void pickCall() {
        System.out.println("Connecting your call...");
    }
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

    }
}

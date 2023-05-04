import java.time.LocalTime;

// ########################### DYNAMIC MEMORY DISPATCH ################################# 
/*
 * Dynamic method dispatch in Java is a mechanism that allows a subclass object to call the 
 * overridden method of its superclass. It is also known as "Runtime Polymorphism".
 * 
 * Now, this is called "runtime polymorphism" because the actual method that will be executed 
 * is decided at run-time, based on the type of object that the method is being called on. 
 * In other words, the decision of which method to call is delayed until run-time when the 
 * actual object type is known. This allows for more flexibility in the code and enables a 
 * more modular approach to programming.
 * 
 * When an overridden method is called through a superclass reference variable, Java determines 
 * which version of the method to execute based on the 'actual type' of the object that the 
 * reference variable points to at runtime. 
 */

class Mobile {

    public void showTime() {
        System.out.println("The current time is: " + LocalTime.now());
    }

    public void switchOn() {
        System.out.println("Turning on mobile...");
    }

}

class SmartMobile extends Mobile {

    public void playMusic() {
        String music = "All Eyez On Me";
        String artist = "2Pac";
        System.out.println("Playing \"" + music + "\" by " + artist + " on smartphone...");
    }

    public void playMusic(String music, String artist) {
        System.out.println("Playing \"" + music + "\" by " + artist + " on smartphone...");
    }

    @Override
    public void switchOn() {
        System.out.println("Turning on your smart phone...");
    }
}

public class DynamicMemoryDispatch {

    public static void main(String[] args) {

        // Mobile mob = new Mobile(); // Ofcourse this is allowed
        SmartMobile smob = new SmartMobile(); // Ofcourse this is also allowed
        // SmartMobile smartMob = new Mobile(); // Won't be allowed by all means
        Mobile mob = new SmartMobile(); // Now this is a news to us

        /*
         * We can think of a 'smart mobile' as 'mobile' per se but referring to a
         * 'mobile' as a 'smart mobile' would not make any sense.
         */

        mob.showTime(); // overridden method is gonna be invoked
        mob.switchOn(); // Ofcourse it methd of parent class can be invoked
        // mob.playMusic(); // Now here's the catch, this won't be allowed!

        System.out.println();
        smob.showTime();
        smob.switchOn();
        smob.playMusic();

    }

}

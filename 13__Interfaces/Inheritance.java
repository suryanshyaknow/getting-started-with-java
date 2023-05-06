
// ######################### Inheritance In Interfaces ############################# 
/*
 * In Java, interfaces can also inherit from other interfaces, which is known as 
 * "Interface Inheritance". Interface inheritance allows one interface to inherit the members 
 * (methods and constants) of another interface.
 * 
 * Interface inheritance can be useful in situations where we want to define a hierarchy of 
 * interfaces that build upon one another. It allows us to organize and structure our code in 
 * a way that promotes code reuse and modularity.
 */

interface Instrument {
    void play();
}

interface StringedInstrument extends Instrument {
    void tune();
}

interface PercussionInstrument extends Instrument {
    void beat();
}

class Guitar implements StringedInstrument {

    public void tune() {
        System.out.println("Guitar is being tuned...");
    }

    // The type Guitar must implement the inherited abstract method
    // Instrument.play()
    public void play() {
        System.out.println("Guitar is playing...");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.tune();

    }

}

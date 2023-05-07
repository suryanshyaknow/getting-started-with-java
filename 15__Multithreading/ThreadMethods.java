
class ThisThread extends Thread {

    public ThisThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;

        while (i < 199) {

            System.out.println("I'd run until I reach 1999...");
            try {
                Thread.sleep(455); // If the join() method is not called, the scheduler could potentially run
                                   // another thread simultaneously
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}

class ThatThread extends Thread {

    public ThatThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;

        while (i < 197) {
            System.out.println("!!!" + this.getName() + " takes over!!!");
            i++;
        }
    }
}

public class ThreadMethods {

    public static void main(String[] args) {

        ThisThread t1 = new ThisThread("Thread-1");
        ThatThread t2 = new ThatThread("Thread-2");

        t1.start();

        try {
            t1.join(); // Will make `t2` wait until `t1` gets donw with its execution
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}

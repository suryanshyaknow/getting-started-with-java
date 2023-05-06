
// ###################### Implementing Runnable Interface ###########################

class ThreadRunnable1 implements Runnable {

    // The type ThreadRunnable1 must implement the inherited abstract method Runnable.run()
    public void run() {
        int i = 0;
        while (i < 1999) {
            System.out.println("Thread, not a threat! Haha...");

            i++;
        }
    }
}

class ThreadRunnable2 implements Runnable {

    // The type ThreadRunnable2 must implement the inherited abstract method Runnable.run()
    public void run() {
        int i = 0;
        while (i < 1972) {
            System.out.println("\nThread, as well as a threat!");
            System.out.println("Gon' make your work somewhat eazy-peazy.");

            i++;
        }
    }
}

public class ImplementingRunnableInterface {

    public static void main(String[] args) {

        ThreadRunnable1 bullet1 = new ThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        ThreadRunnable2 bullet2 = new ThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}

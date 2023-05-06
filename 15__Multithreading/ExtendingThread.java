
// ############################### MULTITHREADING #####################################
/*
 * Multithreading is a technique in programming where a single program or process can 
 * perform multiple tasks or operations at the same time. It allows a program to do more 
 * than one thing at once by dividing its work into separate threads, which can be executed 
 * independently of each other.
 * 
 * When we execute a program that uses multithreading, the operating system can allocate 
 * different threads to different CPU cores, allowing them to execute in parallel. This means 
 * that if one thread is blocked or is taking a long time to execute, other threads can continue 
 * to execute on the remaining CPU cores, improving the overall performance and responsiveness of 
 * the program.
 * 
 * 
 * In Java, there are two ways to create a thread:
 * 
 * 1. Extending the Thread class
 * 2. Implementing the Runnable interface
 */

class Thread1 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 5000) {
            System.out.println("\nI'm cooking...");
            System.out.println("I'm kinda happy!");

            i++;
        }
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 50000) {
            System.out.println("\nI'm checking a week long list of emails too...");
            System.out.println("It sucks!");

            i++;
        }
    }
}

public class ExtendingThread {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t2 = new Thread2();
        t2.start();

    }

}

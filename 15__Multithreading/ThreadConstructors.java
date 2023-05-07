
// ############################ Thread Constructors ################################## 

class MyThread extends Thread {

    public MyThread(String name) {
        super(name); // calling out the `name` constructor of `Thread` class
    }

    public void run() {
        int i = 0;

        while (i < 19) {

            // Referencing that object of this class via `this` keyword
            System.out.println("\nHi! My Name Is " + this.getName() + ".");
            System.out.println("!!!NOT SLIM SHADY!!!");

            i++;
        }
    }
}

class HerThread implements Runnable {

    public void run() {
        int i = 0;
        while (i < 17) {
            System.out.println("\nGon' make your work somewhat eazy-peazy.");

            i++;
        }
    }

}

public class ThreadConstructors {

    public static void main(String[] args) {

        // Threads created via extending the `Thread` class
        MyThread myThread1 = new MyThread("Spidey");
        MyThread myThread2 = new MyThread("Shady");

        myThread1.start();
        myThread2.start();
        System.out.println("myThread1.getId() = " + myThread1.getId());
        System.out.println("myThread2.getId() = " + myThread2.getId());

        // Threads created via implementin `Runnable` interface
        HerThread bullet1 = new HerThread();
        Thread herThread1 = new Thread(bullet1, "Mereleona");

        HerThread bullet2 = new HerThread();
        Thread herThread2 = new Thread(bullet2, "Nico Robin");

        herThread1.start();
        herThread2.start();

        System.out.println("herThread1.getId() = " + herThread1.getId());
        System.out.println("herThread1.getName() = " + herThread1.getName());

        System.out.println("herThread2.getId() = " + herThread2.getId());
        System.out.println("herThread2.getName() = " + herThread2.getName());
    }
}
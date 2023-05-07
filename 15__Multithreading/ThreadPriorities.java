
// ############################# THREAD PRIORITIES #################################
/*
 * In Java, threads have a priority associated with them that determines their relative 
 * importance and the order in which they should be executed by the scheduler. 
 * Thread priorities are represented by integer values between 1 and 10, with higher values 
 * indicating higher priority.
 * 
 * java.lang.Thread.MIN_PRIORITY = 1
 * java.lang.Thread.NORM_PRIORITY = 5
 * java.lang.Thread.MAX_PRIORITY = 10
 * 
 * By default, every thread is given a priority of 5. However, we can change the priority of 
 * a thread using the `setPriority()` method of the Thread class. Here are some key points about 
 * thread priorities in Java:
 * 
 * * The Java Virtual Machine (JVM) does not guarantee that a thread with a higher priority will 
 * always be executed before a thread with a lower priority. The JVM only makes a best effort to 
 * execute threads in order of their priority.
 * 
 * * A thread with a higher priority will continue to execute until it either yields the processor 
 * voluntarily or is preempted by a higher-priority thread.
 * 
 * * Threads with equal priorities are scheduled for execution in a round-robin fashion. This means 
 * that each thread is given a fair share of CPU time, regardless of its priority. 
 */

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class ThreadPriorities {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread 1 (MAX_PRIORITY)");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");
        Thread t3 = new Thread(new MyRunnable(), "Thread 3 (min_priority)");

        // Setting Priorities
        t1.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

}

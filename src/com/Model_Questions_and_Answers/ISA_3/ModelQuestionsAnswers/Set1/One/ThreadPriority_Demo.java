package com.Model_Questions_and_Answers.ISA_3.ModelQuestionsAnswers.Set1.One;

/*
Describe the significance of thread priorities in Java.
How does the priority mechanism work, and under what circumstances might
you adjust thread priorities in a multithreaded application?
Demonstrate with an example!
 */

/*
Thread priorities in Java allow you to control the scheduling of threads by giving hints to the scheduler about the importance or urgency of each thread's task. Thread priorities are represented by integer values ranging from 1 (lowest priority) to 10 (highest priority), where the default priority is 5.

Significance of Thread Priorities:
Priority Mechanism:

Thread priorities influence how the operating system schedules threads for execution.
Threads with higher priorities are given preference over threads with lower priorities by the scheduler.
The priority mechanism helps in managing the execution order of threads and optimizing system resource utilization.
Fine-Tuning Performance:

Adjusting thread priorities can help in fine-tuning the performance of a multithreaded application.
Critical tasks or tasks requiring immediate attention can be assigned higher priorities to ensure they are executed promptly.
Preventing Starvation:

Setting appropriate priorities can help prevent thread starvation, where low-priority threads are continuously preempted by high-priority threads, causing them to wait indefinitely for execution.
Fairness and Responsiveness:

Priorities can be used to ensure fairness and responsiveness in the application. For example, UI threads in a GUI application might be given higher priorities to maintain smooth interaction with users.
How Priority Mechanism Works:
The Java Virtual Machine (JVM) delegates the responsibility of thread scheduling to the underlying operating system.
The scheduler in the operating system decides which thread to execute based on their priorities.
Threads with higher priority values are more likely to be scheduled for execution than threads with lower priority values.
However, thread priorities are only hints to the scheduler, and the actual behavior may vary between different JVM implementations and operating systems.
Circumstances for Adjusting Thread Priorities:
Critical Tasks:

Assign higher priorities to threads performing critical tasks that require immediate attention or have strict deadlines.
I/O-Bound Tasks:

Threads performing I/O-bound tasks, such as reading from or writing to files or network sockets, might benefit from lower priorities to prevent them from starving CPU-bound threads.
CPU-Bound Tasks:

CPU-bound tasks that require significant computational resources can be assigned higher priorities to ensure their timely execution.
Maintaining Responsiveness:

Threads responsible for user interaction or real-time processing should be given higher priorities to maintain application responsiveness.
Avoiding Priority Inversion:

Adjust priorities to avoid priority inversion scenarios where a low-priority thread holds a resource required by a high-priority thread, causing delays.
By adjusting thread priorities based on the nature of tasks and system requirements, you can effectively manage thread scheduling, optimize resource utilization, and enhance the overall performance and responsiveness of your multithreaded applications.
 */
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriority_Demo {
    public static void main(String[] args) {
        MyThread thread1RefObj;
        thread1RefObj = new MyThread("Thread 1");
        MyThread thread2RefObj;
        thread2RefObj = new MyThread("Thread 2");
        MyThread thread3RefObj;
        thread3RefObj = new MyThread("Thread 3");

        thread1RefObj.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2RefObj.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        thread3RefObj.setPriority(Thread.MAX_PRIORITY); // Priority 10

        thread1RefObj.start();
        thread2RefObj.start();
        thread3RefObj.start();
    }
}

/*
In this example:

We define a MyThread class that extends Thread. Each thread will print numbers from 1 to 5.
In the run() method of MyThread, we simulate some work by sleeping for a short duration between each iteration.
In the ThreadPriorityExample class:
We create three MyThread instances: thread1, thread2, and thread3.
We set different priorities for each thread using the setPriority() method.
We start all three threads.
Thread priorities are set as follows:

Thread 1 has the minimum priority (MIN_PRIORITY, which is 1).
Thread 2 has the default priority (NORM_PRIORITY, which is 5).
Thread 3 has the maximum priority (MAX_PRIORITY, which is 10).
When you run this program, you'll notice that Thread 3 will likely execute more frequently and complete its iterations faster compared to the other threads because it has the highest priority. Thread 1 may execute less frequently due to its lower priority, and Thread 2 will have intermediate behavior.
 */

// The output of the above program is shown as below
/*
Thread 2: 1
Thread 3: 1
Thread 1: 1
Thread 3: 2
Thread 2: 2
Thread 1: 2
Thread 3: 3
Thread 1: 3
Thread 2: 3
Thread 3: 4
Thread 1: 4
Thread 2: 4
Thread 3: 5
Thread 1: 5
Thread 2: 5
 */
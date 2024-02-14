# Thread States and Transitions in Java

## Thread States

In Java, a thread can exist in various states throughout its lifecycle. These states are typically defined by the `Thread.State` enumeration. Here are the states a thread can have:

### 1. NEW
A thread that has been created but has not yet started is in the NEW state. At this stage, the thread has been instantiated but has not been started using the `start()` method.

### 2. RUNNABLE
A thread in the RUNNABLE state is either currently executing or ready to execute, depending on the scheduling by the JVM. When a thread is in this state, it may be executing its task or waiting for its turn to execute on the CPU.

### 3. BLOCKED
A thread transitions to the BLOCKED state when it's waiting for a monitor lock to enter a synchronized block or method. This happens when another thread holds the lock that the blocked thread needs.

### 4. WAITING
A thread enters the WAITING state when it is waiting indefinitely for another thread to perform a particular action. Threads can enter this state by invoking methods like `Object.wait()` or by joining another thread using `Thread.join()` without a timeout.

### 5. TIMED_WAITING
Similar to the WAITING state, a thread enters the TIMED_WAITING state when it's waiting for another thread to perform a specific action, but with a timeout specified. Threads can enter this state by calling methods like `Thread.sleep()`, `Object.wait(timeout)`, or `Thread.join(timeout)`.

### 6. TERMINATED
A thread is in the TERMINATED state when it has completed execution, either by returning from its `run()` method or by throwing an uncaught exception. Once a thread is terminated, it cannot be started again.

## Thread State Transitions

Here's how the transitions occur between these states during the lifecycle of a thread:

1. A thread starts in the NEW state.
2. When `start()` method is called on the thread, it moves to the RUNNABLE state.
3. While in the RUNNABLE state, the thread may transition to the BLOCKED state if it attempts to access a synchronized block or method that is already locked by another thread.
4. A thread in the BLOCKED state will transition back to the RUNNABLE state when the lock becomes available.
5. Threads in the RUNNABLE state may also transition to the WAITING or TIMED_WAITING states when they call methods like `Object.wait()` or `Thread.sleep()`.
6. Threads in the WAITING or TIMED_WAITING states will transition back to the RUNNABLE state when the wait time expires or when another thread notifies them.
7. A thread enters the TERMINATED state when its `run()` method completes execution or when an uncaught exception is thrown.
8. Once a thread is terminated, it cannot transition to any other state.

These state transitions are managed by the JVM's scheduler and are influenced by various factors such as thread priorities, synchronization, and CPU scheduling algorithms.

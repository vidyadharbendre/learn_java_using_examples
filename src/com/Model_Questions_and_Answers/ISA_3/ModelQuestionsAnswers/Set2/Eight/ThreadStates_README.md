# Thread States in Java

## Overview

In Java, a thread can exist in several different states throughout its lifecycle. These states are defined by the `Thread.State` enum, and they represent different points in the thread's execution.

## Thread States

### NEW

The thread is in the new state if it has been created but has not yet started executing. In this state, the thread's `start()` method has been invoked, but the thread has not yet begun its execution.

### RUNNABLE

The thread is in the runnable state if it is eligible to run, but its execution has not yet started or is currently running. In this state, the thread may be executing its task or waiting for CPU time to execute.

### BLOCKED

The thread is in the blocked state if it is waiting for a monitor lock to enter a synchronized block or method. This occurs when the thread attempts to enter a synchronized block or method that is already locked by another thread.

### WAITING

The thread is in the waiting state if it is waiting indefinitely for another thread to perform a particular action. Threads can enter this state by invoking methods such as `Object.wait()`, `Thread.join()`, or `LockSupport.park()`.

### TIMED_WAITING

The thread is in the timed waiting state if it is waiting for another thread to perform a particular action, but with a specified timeout. Threads can enter this state by invoking methods such as `Thread.sleep()`, `Object.wait(timeout)`, or `Thread.join(timeout)`.

### TERMINATED

The thread is in the terminated state if its execution has completed, either by finishing its task or by throwing an uncaught exception. Once a thread is in this state, it cannot be started again.

## Thread State Transitions

Transitions between these states occur as the thread progresses through its lifecycle. Here are some common transitions:

- A thread transitions from the `NEW` state to the `RUNNABLE` state when its `start()` method is invoked.
- From the `RUNNABLE` state, a thread may transition to the `BLOCKED`, `WAITING`, or `TIMED_WAITING` state if it encounters synchronization, waits for another thread, or sleeps for a specified period.
- When a thread completes its task or throws an uncaught exception, it transitions to the `TERMINATED` state.

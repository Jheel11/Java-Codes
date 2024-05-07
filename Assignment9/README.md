**Java Multithreading Demo - Function and Method**

**CustomRunnable Class**
1. Constructor
CustomRunnable(String name): Initializes a CustomRunnable object with the given name.
2. Public Methods
run(): Implements the thread's operation, including a countdown and sleep operation.

**CustomThread Class**
1. Constructor
CustomThread(String name): Initializes a CustomThread object with the given name.
2. Public Methods
run(): Implements the thread's operation, similar to CustomRunnable.

**ThreadDemo Class**
1. Main Method
main(String[] args): Entry point of the program. Demonstrates the creation and running of threads.
2. Functionality
Creates two threads (CustomThread instances) with different names.
Starts the threads using the start() method.
Uses the join() method to wait for threads to complete execution.
Prints messages to indicate thread status and completion.

**Overall Functionality**

**Multithreading**
Demonstrates creating and running multiple threads concurrently.
Shows how to use both the Runnable interface and the Thread class to achieve multithreading in Java.

**Thread Synchronization**
Uses join() method to ensure the main thread waits for other threads to finish execution.

**Definitions**

**CustomRunnable:** A class implementing the Runnable interface to create a custom thread with specified operations.

**CustomThread:** A class extending the Thread class to create a custom thread with specified operations.

**ThreadDemo:** Main class demonstrating the creation and running of threads.

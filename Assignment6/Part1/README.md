
**Java Stack Implementation Project**
This project demonstrates the implementation of stack data structures in Java. It includes both fixed-size and growable stack implementations, along with examples of using interfaces.

**Interfaces**
**Interface_STK**
Defines the operations for a stack data structure, including push, pop, displayStack, isOverflow, and isUnderflow methods. This interface is implemented by both Fixed_stk and Growable_stk classes to ensure they provide implementations for these stack operations.

**Interface1**
A simple example interface with two methods, method1 and method2, used to demonstrate basic interface implementation in Java. It's not directly related to the stack implementations but serves as an illustrative example of using interfaces.

**Classes**
**Student**
(Not provided in the initial code but assumed to be part of the project based on context.)
Represents a student with properties such as PRN (Personal Registration Number), name, and marks. This class is a simple data model used for demonstration purposes.

**Fixed_stk**
Implements the Interface_STK interface to provide a fixed-size stack implementation. It uses an array to store elements and includes methods to perform stack operations such as push, pop, and display the stack contents. It checks for overflow and underflow conditions based on the fixed size of the stack.

**Growable_stk**
Also implements the Interface_STK interface but provides a growable stack implementation using ArrayList. This class demonstrates how a stack can dynamically resize to accommodate more elements, thereby avoiding overflow conditions. It includes similar stack operations as Fixed_stk but leverages the dynamic nature of ArrayList.

**Interface_implementation**
Implements the Interface1 interface as a simple demonstration of implementing interface methods in Java. It provides basic implementations for method1 and method2, printing messages to the console.

**InterfaceDemo**
A driver class to demonstrate the use of Interface_implementation. It creates an instance of Interface_implementation and calls its methods to show how interface methods are used in practice.

**StackDemo**
Serves as the main driver class for demonstrating stack operations. It includes commented-out code for using Fixed_stk and active code for demonstrating Growable_stk operations such as push, pop, and displaying the stack. It showcases how both fixed-size and growable stacks can be used in Java applications.

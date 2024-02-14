This Java program is a simple student management system with the ability to calculate and display student results based on their marks. It provides a menu-driven interface to interact with the system, allowing users to enter student details, display student information, display calculated results, and exit the program.

**Classes and Interfaces**
**Main Class**
The Main class serves as the entry point of the program. It presents a menu to the user and handles user input to perform various operations.

**Methods:**
main(String[] args): The main method that initializes the program and presents the user with a menu to interact with.
**Result Class**
The Result class extends the Student class and implements the Exam interface. It calculates and displays the result of a student based on their marks.

**Attributes:**
percentage: The calculated percentage of the student.
Methods:
Result(): Constructor to initialize with default values.
Percent_cal(): Calculates the percentage of the student based on their marks.
enterStudentDetails(Scanner scanner): Enters details of a student through user input.
displayStudentInfo(): Displays information about the student.
displayResult(): Displays the calculated result of the student.
toString(): Returns a string representation of the result object.
**Exam Interface**
The Exam interface defines a method Percent_cal() to calculate the percentage of a student.

**Methods:**
Percent_cal(): Method to be implemented by classes to calculate the percentage.
Student Class
The Student class represents individual student entities with attributes such as name, roll number, and marks.

**Attributes:**
name: The name of the student.
roll_no: The roll number of the student.
mark1, mark2: Marks obtained by the student.
**Methods:**
Student(String name, int roll_no, double mark1, double mark2): Constructor to initialize a student object with details.
Getter and setter methods for attributes.
toString(): Returns a string representation of the student object.

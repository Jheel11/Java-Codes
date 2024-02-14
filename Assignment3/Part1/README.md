**Student Management System**
This Java program is a simple menu-driven application for managing student records. It facilitates operations like adding students, displaying student details, searching for students by various criteria, updating student information, and deleting students from the database.

**Classes and Functions**
**Student Class**
The Student class represents individual student entities with attributes such as PRN, name, date of birth, and marks.

**Attributes:**
prn: The Permanent Registration Number of the student.
name: The name of the student.
dob: The date of birth of the student in the format dd/MM/yyyy.
marks: The marks obtained by the student.
**Constructors:**
Student(int prn): Constructs a student object with only PRN.
Student(int prn, String name): Constructs a student object with PRN and name.
Student(int prn, String name, String dob): Constructs a student object with PRN, name, and date of birth.
Student(int prn, String name, String dob, double marks): Constructs a student object with PRN, name, date of birth, and marks.
**Methods:**
getPrn(): Returns the PRN of the student.
setPrn(int prn): Sets the PRN of the student.
getName(): Returns the name of the student.
setName(String name): Sets the name of the student.
getDob(): Returns the date of birth of the student.
setDob(String dob): Sets the date of birth of the student.
getMarks(): Returns the marks of the student.
setMarks(double marks): Sets the marks of the student.
toString(): Returns a string representation of the student object.
StudentFunctions Class
The StudentFunctions class contains methods to perform various operations on student records.

**Methods:**
addStudent(): Adds a new student to the database.
printStudentDetails(): Prints details of all students in the database.
searchStu(): Searches for a student based on PRN, name, date of birth, or marks.
updateOrDelete(): Provides options to update, edit, or delete student information.
editStudent(): Allows editing of a student's details.
deleteStudent(): Deletes a student from the database.
StudentDemo Class
The StudentDemo class serves as the main entry point of the program. It presents a menu-driven interface to interact with the StudentFunctions class.

**Methods:**
main(String[] args): The main method that initializes the program and presents the user with a menu to perform various operations on student records.

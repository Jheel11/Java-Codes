**The Employee Management System **
This is a Java-based application designed to efficiently manage employee data and automate salary calculations for both Normal Employees and Bonus Employees. The system offers a user-friendly interface for inputting employee details and generates comprehensive salary reports.

**Problem Statement:**
The goal of this project is to develop a robust Employee Management System capable of handling various employee types and calculating accurate salaries based on predefined criteria. Normal Employees receive fixed salaries, while Bonus Employees are entitled to additional bonuses based on a percentage of their basic salary.

Classes and Functionalities:
**Employee:**
Manages employee details such as name, address, employee ID, department, bank details, etc.
Provides methods for salary calculation based on predefined formulas.

**NormalEmployee:**
Inherits from Employee.
Represents a Normal Employee with fixed basic salary.
Allows for input of additional employee details and calculates salary components such as HRA, conveyance allowance, medical allowance, EPF, ESI, etc.

**BonusEmployee:**
Inherits from Employee.
Represents a Bonus Employee with a bonus percentage added to their basic salary.
Calculates bonus amount based on the provided bonus percentage and adds it to the total earnings.
Main:

Contains the main method to execute the program.
Provides a user interface for inputting employee details and choosing the employee type (Normal or Bonus).
Utilizes the appropriate employee class to calculate salaries and generates detailed salary reports.
**Usage:**
Compile the Java files using any Java compiler (e.g., JDK).
Run the Main class using the Java interpreter.
Follow the prompts to input employee details and select the employee type.
The system calculates the salary based on the chosen employee type and displays a comprehensive salary report.

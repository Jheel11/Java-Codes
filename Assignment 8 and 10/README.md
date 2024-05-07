**Employee Management System**

**Overview**
This project is an Employee Management System that allows users to perform operations such as adding employees, viewing employee details, and updating employee information. It consists of a backend database component written in Java utilizing JDBC for database connectivity and a frontend graphical user interface (GUI) developed using JavaFX.

**Backend: EmployeeDatabase Class**

**Methods**
1. getConnection(): Establishes a connection to the MySQL database.
2. connect(): Connects to the database and creates an employee table if it doesn't exist.
3. createNewTable(): Creates a new table in the database to store employee details.
4. addEmployee(String name, int age, String email, String department): Adds a new employee to the database.
5. updateEmployee(int id, String name, int age, String email, String department): Updates an existing employee's details in the database.
6. viewEmployees(): Retrieves and displays all employees from the database.
7. Frontend: EmployeeManager Class (JavaFX Application)

**Components**
1. TextFields: For entering employee ID, name, age, email, and department.

**Buttons:**
-> "Add Employee": Adds a new employee to the database.
-> "View Employees": Displays all employees stored in the database.
-> "Update Employee": Updates an existing employee's information based on the provided employee ID.

**Functionality**
Initializes the backend by establishing a database connection and creating the employee table.
Provides a user-friendly interface for interacting with the employee management system.
Allows users to input employee details and perform various operations on the database.

**Database Setup**
The application requires a MySQL database named employeeDB.
Execute the SQL query create database employeeDB; followed by use employeeDB; to create and select the database.

**Usage**
1. Ensure MySQL server is running.
2. Compile and run the Java application.
3. Use the GUI to input employee details and perform desired operations.

# Java-Codes
**#PART1**
**#Introduction**
This repository contains a simple Java application for basic arithmetic calculations. The application provides a menu-driven interface for performing operations such as addition, subtraction, multiplication, division, square root, power, mean, and variance.

**Classes**
**1. OperationDemo.java**
This class serves as the main entry point for the calculator application. It utilizes the Calculator class to perform various mathematical operations based on user input. The class takes advantage of the Input class for obtaining user input.

**Methods:**
main(String[] args): The main method that orchestrates the user interface and interaction.
**2. Calculator.java**
The Calculator class contains methods for performing basic arithmetic calculations. It includes functions for addition, subtraction, multiplication, division, square root, power, mean, and variance.

**Methods:**
1)addition(double n1, double n2): Adds two numbers and returns the result.
2)subtraction(double n1, double n2): Subtracts the second number from the first and returns the result.
3)multiplication(double n1, double n2): Multiplies two numbers and returns the result.
4)division(double n1, double n2): Divides the first number by the second and returns the result. Handles division by zero by returning Double.NaN.
5)sqrt(double n1): Calculates the square root of a number and returns the result.
6)power(double n1, double n2): Raises the first number to the power of the second and returns the result.
7)mean(double[] numbers): Calculates the mean (average) of an array of numbers and returns the result.
8)variance(double[] numbers): Calculates the sample variance of an array of numbers and returns the result.


**PART2**
**INTRODUCTION**
This Java console application illustrates various techniques for obtaining user input and computing the factorial of a given number. It presents different Java classes utilized for input management and incorporates a utility class designed for factorial computation.

**Class Overview:**

**ScannerClass**: Utilizes the Scanner class to solicit an integer from the console and calculate its factorial.
**ConsoleLogInput**: Utilizes the Console class for user input retrieval, encompassing secure data entry such as passwords, and performs factorial computation.
**CommandLine**: Demonstrates the utilization of command-line arguments to execute factorial calculations.
**BufferReader**: Implements BufferedReader and InputStreamReader to acquire text input from the console for factorial computation.
**InputStream**: Intended to utilize InputStream for input management, although it requires conceptual refinement for proper functionality.
**Factorial**: Houses the algorithm for determining the factorial of a number, utilized across multiple input methodologies.
This application serves as an exploratory tool for Java's input handling capabilities, offering diverse strategies for obtaining and processing user input pertaining to a fundamental mathematical operation. It stands as an educational resource for comprehending fundamental input/output operations in Java programming.

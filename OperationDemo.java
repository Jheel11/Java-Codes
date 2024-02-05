import java.util.Scanner;

public class OperationDemo {
    public static void main(String[] args) {
        Input input = new Input();
        Calculator calc = new Calculator();

        double[] num = new double[2];
        num = input.inputNumbers();
        System.out.println("First Num " + num[0] + "   " + "Second Num " + num[1]);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            double result;

            switch (choice) {
                case 1:
                    result = calc.addition(num[0], num[1]);
                    System.out.println("Result for addition: " + result);
                    break;
                case 2:
                    result = calc.subtraction(num[0], num[1]);
                    System.out.println("Result for subtraction: " + result);
                    break;
                case 3:
                    result = calc.multiplication(num[0], num[1]);
                    System.out.println("Result for multiplication: " + result);
                    break;
                case 4:
                    result = calc.division(num[0], num[1]);
                    System.out.println("Result for division: " + result);
                    break;
                case 5:
                    result = calc.sqrt(num[0]);
                    System.out.println("Result for square root: " + result);
                    break;
                case 6:
                    result = calc.power(num[0], num[1]);
                    System.out.println("Result for power: " + result);
                    break;
                case 7:
                    double[] numbersForMean = { num[0], num[1] };
                    result = calc.mean(numbersForMean);
                    System.out.println("Result for mean: " + result);
                    break;
                case 8:
                    double[] numbersForVariance = { num[0], num[1] };
                    result = calc.variance(numbersForVariance);
                    System.out.println("Result for variance: " + result);
                    break;
                case 0:
                    System.out.println("Exiting calculator.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
    }
}

public class Calculator {

    public double addition(double n1, double n2) {
        return n1 + n2;
    }

    public double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    public double division(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Not a Number
        }
    }

    public double sqrt(double n1) {
        return Math.sqrt(n1);
    }

    public double power(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    public double mean(double[] numbers) {
        if (numbers.length == 0) {
            System.out.println("Cannot calculate mean with no numbers.");
            return Double.NaN;
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public double variance(double[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Insufficient data to calculate variance.");
            return Double.NaN;
        }

        double mean = mean(numbers);
        double sumSquaredDifferences = 0;

        for (double num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        return sumSquaredDifferences / (numbers.length - 1); // Use (n-1) for sample variance
    }
}

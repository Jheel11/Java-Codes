public class Part1_evenodd {
    public static void main(String[] args) {
        int[] numbers = input.takeInput();
        processNumbers(numbers);
    }

    public static void processNumbers(int[] numbers) {
        int[] even = new int[numbers.length];
        int[] odd = new int[numbers.length];

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even[evenCount++] = numbers[i];
            } else {
                odd[oddCount++] = numbers[i];
            }
        }

        System.out.print("Even Numbers: ");
        for (int j = 0; j < evenCount; j++) {
            System.out.print(even[j] + " ");
        }

        System.out.println(); // Move to the next line

        System.out.print("Odd Numbers: ");
        for (int j = 0; j < oddCount; j++) {
            System.out.print(odd[j] + " ");
        }
    }
}

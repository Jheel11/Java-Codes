import java.util.Scanner;

public class UserInput {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num = sc.nextInt();
        int[] numbers = new int[num];
        System.out.println("Enter the elements:");
        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        return numbers;
    }
}

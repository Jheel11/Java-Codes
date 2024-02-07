public class Main {
    public static void main(String[] args) {
        int[] numbers = UserInput.takeInput();
        int nearestIndex = NearestNeighbors.findNearest(numbers);
        System.out.println("Index of the first number with the smallest distance to its neighbor: " + nearestIndex);
    }
}

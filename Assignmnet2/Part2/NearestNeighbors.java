public class NearestNeighbors {
    public static int findNearest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two numbers.");
        }

        int minDistance = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentDistance = Math.abs(numbers[i] - numbers[i + 1]);
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                index = i;
            }
        }

        return index;
    }
}

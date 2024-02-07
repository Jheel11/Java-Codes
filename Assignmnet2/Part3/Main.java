// MainClass.java
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = InputClass.getArrayFromUser();
        ArrayList<Integer> arrayList = ConversionClass.arrayToArrayList(array);
        System.out.println("Array converted to ArrayList: " + arrayList);

        int[] newArray = ConversionClass.arrayListToArray(arrayList);
        System.out.println("ArrayList converted back to array: " + Arrays.toString(newArray));
}
}

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        String[] array1 = {"_word1", "_word2", "_word3", "_word4"};
        String[] array2 = array1;
        System.out.println("Array 1 is: " + Arrays.deepToString(array1));
        System.out.println("Array 2 is: " + Arrays.deepToString(array2));

        int[] inputArray = {1, 2, 4, 6, 7};
        System.out.println("The original array is: " + Arrays.toString(inputArray));
        int[] inputArray2 = removeElement(inputArray, 3);
        System.out.println("The new array with the removed element is: " + Arrays.toString(inputArray2));

    }

    public static int[] removeElement(int[] inputArray, int n) {

        int[] fillerArray = new int[inputArray.length - 1];
        inputArray[n] = 0;

        for (int i = 0; i > inputArray.length; n++) {
            while (inputArray[i] != 0) {
                fillerArray[i] = inputArray[i];
                i++;
            }

        }
        return fillerArray;
    }

}

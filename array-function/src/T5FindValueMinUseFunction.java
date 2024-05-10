import java.util.Scanner;

public class T5FindValueMinUseFunction {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println(minValue(arr));
    }

    public static int minValue (int [] arr) {
        int min  = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class T1ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = sc.nextInt();
        while (size < 20) {
            size = sc.nextInt();
        }

        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("Elements in array: " + Arrays.toString(array));

        for (int k = 0, j = size - 1; k < j ; k++, j --) {
            int temp = array[k];
            array[k] = array[j];
            array[j] = temp;
        }
        System.out.print("\nReverse array: "+Arrays.toString(array));
    }
}





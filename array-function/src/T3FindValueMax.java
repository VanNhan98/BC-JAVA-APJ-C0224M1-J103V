import java.util.Arrays;
import java.util.Scanner;

public class T3FindValueMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();
        while (size > 20) {
            size = sc.nextInt();
        }

        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Element is array "+i+" :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in array: " +Arrays.toString(arr));

        int max = arr[0];
        for (int i = 0; i < size ; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Value max array: "+max);

    }
}
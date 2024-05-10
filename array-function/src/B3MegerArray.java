import java.util.Arrays;

public class B3MegerArray {
    public static void main(String[] args) {
        int []  array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        int [] array2 = new int[3];
        array2[0] = 4;
        array2[1] = 5;
        array2[2] = 6;

        System.out.println(Arrays.toString(mergeArray(array, array2)));
    }

    public static int [] mergeArray(int[] array, int [] array2) {
        int [] array3 = new int[array.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[i + array.length] = array2[i];
        }
        return array3;
    }
}

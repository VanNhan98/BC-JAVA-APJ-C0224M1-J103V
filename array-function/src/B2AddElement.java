import java.util.Arrays;

public class B2AddElement {
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println(Arrays.toString(addElement(array, 6,3)));
    }

    public static int[] addElement(int [] array,int element, int index) {
        int n = array.length;
        int [] newArray = new int[n+1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            }
            else if (i == index) {
                newArray[i] = element;
            }
            else {
                newArray[i] = array[i-1];
            }
        }
        return newArray;
    }
}

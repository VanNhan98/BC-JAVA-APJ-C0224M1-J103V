import java.util.Arrays;

public class B1RemoveElement {
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println(Arrays.toString(removeElement(array,1,3)));
        System.out.println(Arrays.toString(removeByIndex(array,2)));

    }

    public static int[] removeElement(int[] array, int a, int b) {

         int n = array.length;
         int countItemRemoved = b - a + 1;
         int [] newArray = new int[n - countItemRemoved];
        for(int i = 0; i < n; i++) {
           if (i < a){
               newArray[i] = array[i];
           }
           else if (i > b) {
               newArray[i - countItemRemoved] = array[i];
           }
        }
        return newArray;
    }

    public static int[] removeByIndex (int[] array, int index) {
        int n = array.length;
        int [] newArray = new int[n - 1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if  (i != index) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // c2
        int[] array = new int[5]; //  so luong toi da cac phan tu
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        // xoa cac phan tu tu vi tri a->b: 10p
        System.out.println(Arrays.toString(removeItem(1, 3, array)));
        System.out.println(Arrays.toString(removeItemByIndex(array, 3)));
        System.out.println(Arrays.toString(addItem(6, 3, array)));
        System.out.println(findIndexByValue(5,array));
    }

    static int[] removeItem(int a, int b, int[] arrayRemove) {
        int n = arrayRemove.length;
        int countItemRemove = b - a + 1;
        int[] newArray2 = new int[n - countItemRemove];
        for (int i = 0; i < n; i++) {
            if (i < a) {
                newArray2[i] = arrayRemove[i]; // [1,0]
            } else {
                if (i == n - countItemRemove) {
                    break;
                }
                newArray2[i] = arrayRemove[i + countItemRemove];
            }
        }
        return newArray2;

    }

    // xoa phan tu theo index
    static int[] removeItemByIndex(int[] array, int index) {
        int n = array.length;
        int[] newArray = new int[n - 1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (index != i) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    // them phan tu
    static int[] addItem(int item, int index, int[] array) {
        int n = array.length;
        int[] newArray = new int[n + 1];
        int j = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[j] = array[i];
                j++;
            } else if (i == index) {
                newArray[j] = item;
                j++;
            } else {
                newArray[j] = array[i - 1];
                j++;
            }

        }

        return newArray;
    }

    // Tim index cua phan tu
    static int  findIndexByValue(int value, int [] array) {
        int n = array.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == value) {
                index = i;
            }
        }
        return index;
    }
}

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt();
//            }
//        }
//         nhap mang ngau nhien
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }

        // in ra mang
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        // tinh tong
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        System.out.println("total matrix: "+total);
        System.out.println("--------------------------------");

        // tong tung cot
        for (int column = 0; column < matrix[0].length; column++) {
            int total1 = 0;
            for (int row = 0; row < matrix.length; row++) {
                total1 += matrix[row][column];
            }
            System.out.println("Sum of column "+column+" is "+total1);
        }

        System.out.println("-----------------------------------");


        // tong tung dong
        for(int row = 0; row < matrix.length; row++) {
            int total2 = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                total2 += matrix[row][column];
            }
            System.out.println("Sum of row "+row+" is "+total2);
        }
        System.out.println("-----------------------------------");

        // tim max value
        int max = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0 ;
        for (int row = 0; row < matrix.length ; row++) {
            for(int column = 0; column < matrix[row].length; column++){
                if (max < matrix[row][column]) {
                    max = matrix[row][column];
                    maxRow = row;
                    maxColumn = column;
                }

            }
        }
        System.out.println("Value max in maxtrix is "+max);
        System.out.println("Coordinates max: "+maxRow +","+maxColumn);
        System.out.println("------------------------------------------------");

        // tim min
        int min = matrix[0][0];

        for (int row = 0; row < matrix.length ; row++) {
            for(int column = 0; column < matrix[row].length; column++){
                if (min > matrix[row][column]) {
                    min = matrix[row][column];

                }

            }
        }
        System.out.println("Value min in matrix is "+min);
        System.out.println("--------------------------------");

        // tong duong cheo chinh
        int total3 = 0 ;
        for(int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row == column) {
                    total3 += matrix[row][column];
                }
            }
        }
        System.out.println("Sum duong cheo: "+total3);


    }
}
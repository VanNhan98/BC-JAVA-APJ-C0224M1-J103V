import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c");
        double c = sc.nextDouble();
        QuadraticEquation test = new QuadraticEquation(a, b, c);

        if (test.getDelta() > 0) {
            System.out.println(" Root1: " + test.getRoot1());
            System.out.println(" Root2: " + test.getRoot2());
        } else if (test.getDelta() == 0) {
            System.out.println(" Root: " + test.getRoot());

        }
        else {
            System.out.println(" Root: " + test.getRoot());
        }
    }
}
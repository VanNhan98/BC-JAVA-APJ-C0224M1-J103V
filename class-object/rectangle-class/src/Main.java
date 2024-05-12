import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        double width = sc.nextDouble();
        System.out.println("Enter height");
        double height = sc.nextDouble();

        Rectangle rect = new Rectangle(width, height);
        System.out.println("Area: "+rect.getArea());
        System.out.println("Perimeter: "+rect.getPerimeter());
    }
}
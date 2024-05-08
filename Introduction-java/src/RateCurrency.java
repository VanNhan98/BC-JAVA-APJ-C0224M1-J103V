import java.util.Scanner;

public class RateCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double VND = 23000;
        System.out.println("Nhập số USD cần đổi: ");
        double USD = sc.nextDouble();
        double rate = USD * VND;
        System.out.println("Rate sau khi quy đổi: "+rate);
    }
}

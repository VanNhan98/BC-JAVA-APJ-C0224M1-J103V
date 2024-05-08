import java.util.Scanner;

public class GiaiPTBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double  a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        if(a == 0 ) {
            if (b == 0) {
                System.out.println("PT vô số nghiệm.");
            }
            else
                System.out.println("PT vô nghiệm");
        }
        else {
            System.out.println("PT có nghiệm x = "+(-b)/a);
        }

    }
}

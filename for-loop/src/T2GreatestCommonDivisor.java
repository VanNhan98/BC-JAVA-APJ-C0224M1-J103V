import java.util.Scanner;

public class T2GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        int ucln = 1;
        if(a !=0 && b != 0) {
            if (b > a) {
                for (int i = 1; i < a ; i++) {
                    if (a % i == 0 && b % i == 0) {
                        ucln = i;
                    }
                }
            }
            System.out.println("UCLN "+a+" và "+b+ " là "+ucln);
        }
    }
}

import java.util.Scanner;

public class T1CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        if (n < 2)
            System.out.println(n+" khong phai la snt");
        else {
            boolean check = false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println(n+" là số nguyên tố");
            }
            else
                System.out.println(n+" không phải là số nguyên tố");
        }
    }
}

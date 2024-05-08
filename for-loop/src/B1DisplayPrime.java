import java.util.Scanner;

public class B1DisplayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong pt: ");
        int n = sc.nextInt();
        int number = 2;
        int count  = 0;
        while (count < n) {
            boolean check  = true;
            for (int i = 2; i < number ; i++) {
                if (number % i == 0 ) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(number+" ");
                count++;
            }
            number ++;
        }
    }
}

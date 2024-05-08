import java.util.Scanner;

public class T3InterestCaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền gửi: ");
        double money = sc.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        int month =  sc.nextInt();
        System.out.println("Nhập lãi suất ănm: ");
        double interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100/12) * month;
        }
        System.out.println("Tổng lãi suất: "+totalInterest);
    }
}

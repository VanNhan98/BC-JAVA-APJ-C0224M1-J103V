import java.util.Scanner;

public class B8CountCharInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a character: ");
        String c = sc.nextLine();
        int count  = 0;
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c.charAt(0)) {
                check = true;
                count++;
            }
        }
        if(check) {
            System.out.println("Quantity: "+count);
        }
        else {
            System.out.println("Failed");
        }
    }
}

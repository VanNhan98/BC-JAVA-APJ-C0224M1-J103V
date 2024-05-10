import java.util.Scanner;

public class T2FindValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name student: ");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if(name.equals(students[i])) {
                System.out.println("Position of the students in the list : "+name+ " is "+i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found" + name + " in the list.");
        }
    }
}

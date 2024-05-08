public class B2DisplayTypes{
    public static void main(String[] args) {
        // hcn
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        // tam giac vuong
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if(i >= j) {
                    System.out.print("*"+"\t");
                }
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------");
        // tam giac vuong nguoc
        for (int i = 1; i < 6 ; i++) {
            for (int j = 1; j < 6; j++) {
                if(i + j <= 6 ) {
                    System.out.print("*"+"\t");
                }
            }
            System.out.println(" ");
        }
    }
}

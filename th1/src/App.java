public class App {
    public static void main(String[] args) {
//        User user = new User(1, "Nhan", "nhan@gmail", "123");
//
//
//        String name = user.getName();
//        System.out.println(name);
//
//        user.setName("hung");
//        String inforUser = user.inforUser();
//        System.out.println(inforUser);

        Student student = new Student(1,"nhan", "nhan@gmail",7.0);
        Student student1 = new Student(2,"hung", "hung@gmail",8.5);
        Student student2 = new Student(3,"quan", "quang@gmail",7.5);
        Student student3 = new Student(4,"hao", "hao@gmail",9.0);
        Student student4 = new Student(5,"hieu", "hieu@gmail",8.3);



        Student[] arr = new Student[5];
        arr[0] = student;
        arr[1] = student1;
        arr[2] = student2;
        arr[3] = student3;
        arr[4] = student4;
        for(Student item : arr) {
            if(item != null) {
                System.out.println(item.getInfo());
            }
            System.out.println("------------------");
        }


        for(Student item : arr) {
            if(item.getGPA()  > 8) {
                System.out.println("so luong hoc vien co gpa lon hon 8: "+item.getGPA());
            }
        }

    }
}

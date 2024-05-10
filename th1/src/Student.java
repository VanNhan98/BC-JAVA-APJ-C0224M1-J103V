public class Student {
    public int id;
    public String name;
    public String email;
    public double GPA;

    public Student(int id, String name, String email, double GPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getInfo() {
        return "ID: "+this.id + "\nname: "+this.name+"\nemail: "+this.email+"\nGPA: "+this.GPA;
    }




}

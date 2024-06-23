public class Student {
    int rollno;
    String name;
    String address;
    // initializes student object
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    // Overriding toString() to print student details**
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

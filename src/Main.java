import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Casey Beins", "6001 N Hills"));
        students.add(new Student(2, "Nicole Cabreja", "456 Oak Avenue"));
        students.add(new Student(3, "Keanu Cooley", "789 Pine Lane"));
        students.add(new Student(4, "Virgile Igor Famkem Kaptchouang", "101 Maple Road"));
        students.add(new Student(5, "Nijal Keels-Jiggetts", "202 Cedar Blvd"));
        students.add(new Student(6, "Joshua Pearson", "303 Birch Way"));
        students.add(new Student(7, "Samuel Tilley", "404 Spruce Circle"));
        students.add(new Student(8, "Matthew Uhlar", "505 Ash Court"));
        students.add(new Student(9, "Marion Richard", "606 Willow Drive"));
        students.add(new Student(10, "Lincoln James", "707 Hickory Place"));

        System.out.println("Original List:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSorted by Name:");
        SelectionSort.selectionSort(students, new NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSorted by Roll Number:");
        SelectionSort.selectionSort(students, new RollNoComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override     // Compare two students by their names
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

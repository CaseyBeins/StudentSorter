import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {
    @Override   // Compare two students by their roll numbers
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollno, s2.rollno);
    }
}


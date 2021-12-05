package Assignment6.Q1;

import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class DateOfBirthComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}

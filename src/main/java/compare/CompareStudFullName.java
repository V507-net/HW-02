package compare;

import org.apache.commons.lang3.StringUtils;
import subjects.Student;

import java.util.Comparator;

public class CompareStudFullName implements StudComparator {

    @Override
    public int compare(Student o1, Student o2)
    {
        return StringUtils.compare(o1.getFullName(),o2.getFullName());
    }
}

package compare;

import org.apache.commons.lang3.StringUtils;
import subjects.Student;

public class CompareStudUniversityID implements StudComparator{

    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getUniversityId(),o2.getUniversityId());
    }
}

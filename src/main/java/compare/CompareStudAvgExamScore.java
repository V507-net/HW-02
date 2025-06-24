package compare;

import subjects.Student;

public class CompareStudAvgExamScore implements StudComparator{
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.getAvgExamScore(), o2.getAvgExamScore());
    }
}

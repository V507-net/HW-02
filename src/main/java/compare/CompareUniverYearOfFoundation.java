package compare;

import subjects.University;

public class CompareUniverYearOfFoundation implements UniverCoparator{
    @Override
    public int compare(University o1, University o2) {
        return Integer.compare(o1.getYearOfFoundation(), o2.getYearOfFoundation());
    }
}

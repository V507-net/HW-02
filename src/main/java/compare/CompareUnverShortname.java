package compare;

import org.apache.commons.lang3.StringUtils;
import subjects.University;

public class CompareUnverShortname implements UniverCoparator{
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getShortName(),o2.getShortName());
    }
}

package compare;

import enums.StudyProfile;
import org.apache.commons.lang3.StringUtils;
import subjects.University;

public class CompareUniverMainProfile implements UniverCoparator{
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getMainProfile().getProfileName(),o2.getMainProfile().getProfileName());
    }
}

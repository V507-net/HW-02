package utils;

import compare.*;
import enums.studCompareType;
import enums.univerCompareType;

public  class SuperComparator {

    public static StudComparator getComparator(studCompareType comparatorType){

        return switch (comparatorType) {
            case universityId -> new CompareStudUniversityID();
            case fullName -> new CompareStudFullName();
            case avgExamScore -> new CompareStudAvgExamScore();
            case CourseNumber -> new CompareStudCurrentCourseNumber();
        };
    }
    public static UniverCoparator getComparator(univerCompareType comparatorType){

        return switch (comparatorType) {
            case id -> new CompareUniverId();
            case yearOfFoundation -> new CompareUniverYearOfFoundation();
            case shortName -> new CompareUnverShortname();
            case fullName -> new CompareUniverFullname();
            case mainProfile -> new CompareUniverMainProfile();
        };
    }
}

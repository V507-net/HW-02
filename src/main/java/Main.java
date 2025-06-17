public class Main {

    public static void main(String[] args) {

        University univer = new University();
        Student stud = new Student();

        univer.setId("001")
              .setMainProfile(StudyProfile.HISTORY)
              .setFullName("Great University")
              .setShortName("GU")
              .setYearOfFoundation(1971);

        stud.setFullName("Ivanov Ivan Ivanovich")
            .setAvgExamScore(4.5F)
            .setUniversityId("001")
            .setCurrentCourseNumber(2);

        System.out.println(univer);
        System.out.println(stud);

    }
}

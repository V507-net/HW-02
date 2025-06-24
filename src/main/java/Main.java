

import compare.StudComparator;

import compare.UniverCoparator;
import enums.studCompareType;
import enums.univerCompareType;
import subjects.Student;
import subjects.University;
import utils.SuperComparator;
import utils.importExcel;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        
        List<Student> studs = importExcel.readStudents("src/main/resources/universityInfo.xlsx");
        List<University> univers = importExcel.readUniversities("src/main/resources/universityInfo.xlsx");

        StudComparator studCompare = SuperComparator.getComparator(studCompareType.fullName);
        UniverCoparator univerCompare = SuperComparator.getComparator(univerCompareType.fullName);

        System.out.println("Студенты:");
        studs.stream().sorted(studCompare).forEach(System.out::println);
        System.out.println("Университеты:");
        univers.stream().sorted(univerCompare).forEach(System.out::println);


/*
        System.out.println("Список студентов:");
        for (Student student : studs)
        {
            System.out.println(student);
        }

        System.out.println("Список университетов:");
        for (University university : univers)
        {
            System.out.println(university);
        }
*/


    }
}

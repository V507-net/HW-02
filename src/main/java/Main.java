import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        
        List<Student> studs = importExcel.readStudents("src/main/resources/universityInfo.xlsx");
        List<University> univers = importExcel.readUniversities("src/main/resources/universityInfo.xlsx");

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


    }
}

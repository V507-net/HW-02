package utils;


import enums.StudyProfile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import subjects.Student;
import subjects.University;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class importExcel {

    private importExcel() {
    }

    public static List<Student> readStudents (String filename) throws IOException {

        List<Student> studs = new ArrayList<>();
        XSSFWorkbook workBook = null;
        try {
            FileInputStream inputStream = new FileInputStream(filename);
            workBook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        XSSFSheet sheet = workBook.getSheet("Студенты");
        Iterator<Row> rows = sheet.iterator();
        rows.next(); //Пропуск заголовка

        while (rows.hasNext()) {
            Student studT = new Student();
            studs.add(studT);
            Row row = rows.next();
            Iterator<Cell> cells = row.iterator();
            Cell cell = cells.next();

            studT.setUniversityId(row.getCell(0).getStringCellValue());
            studT.setFullName(row.getCell(1).getStringCellValue());
            studT.setCurrentCourseNumber((int) row.getCell(2).getNumericCellValue());
            studT.setAvgExamScore((float) row.getCell(3).getNumericCellValue());
        }

        return studs;
    }

    public static List<University> readUniversities(String filename) throws IOException {

        List<University> univers = new ArrayList<>();
        XSSFWorkbook workBook = null;
        try {
            FileInputStream inputStream = new FileInputStream(filename);
            workBook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        XSSFSheet sheet = workBook.getSheet("Университеты");
        Iterator<Row> rows = sheet.iterator();
        rows.next(); //Пропуск заголовка

        while (rows.hasNext()) {
            University univerT = new University();
            univers.add(univerT);
            Row row = rows.next();
            Iterator<Cell> cells = row.iterator();
            Cell cell = cells.next();

            univerT.setId(row.getCell(0).getStringCellValue());
            univerT.setFullName(row.getCell(1).getStringCellValue());
            univerT.setShortName(row.getCell(2).getStringCellValue());
            univerT.setYearOfFoundation((int)row.getCell(3).getNumericCellValue());
            univerT.setMainProfile(StudyProfile.valueOf(StudyProfile.class,row.getCell(4).getStringCellValue()));
        }

        return univers;

    }
}

package ro.ulbs.proiectaresoftware.students;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CitireStudentiXlsx implements IStudentiExportRead
{
    private String fileName;
    public  CitireStudentiXlsx(String f) {
        fileName = f;
    }
    @Override
    public List<Student> doExport() {

        List<Student> lista = new ArrayList<>();

        try {
            FileInputStream fisier = new FileInputStream(new File(fileName));
            XSSFWorkbook workbook = new XSSFWorkbook(fisier);

            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> iterator = sheet.iterator();

            if(iterator.hasNext()) {
                iterator.next();
            }
            while(iterator.hasNext()) {

                Row row = iterator.next();

                Student s = new Student(
                        (int) row.getCell(0).getNumericCellValue(),
                        row.getCell(1).getStringCellValue(),
                        row.getCell(2).getStringCellValue(),
                        row.getCell(3).getStringCellValue(),
                        row.getCell(4).getNumericCellValue()
                );

                lista.add(s);
            }

            workbook.close();
            fisier.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}

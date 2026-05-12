package ro.ulbs.proiectaresoftware.students;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class StudentiInFisierXlsx implements IStudentiExport
{
    private String file;
    public StudentiInFisierXlsx(String f)
    {
        file=f;
    }
    @Override
    public void doExport(List<Student> studenti) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet sheet = workbook.createSheet("Studenti");

            int rowNum = 0;

            Row header = sheet.createRow(rowNum++);

            header.createCell(0).setCellValue("Nr matricol");
            header.createCell(1).setCellValue("Prenume");
            header.createCell(2).setCellValue("Nume");
            header.createCell(3).setCellValue("Formatie");
            header.createCell(4).setCellValue("Nota");

            for(Student s : studenti) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(s.getNumarmatricol());
                row.createCell(1).setCellValue(s.getPrenume());
                row.createCell(2).setCellValue(s.getNume());
                row.createCell(3).setCellValue(s.getFormatieDeStudiu());
                row.createCell(4).setCellValue(s.getNota());
            }

            FileOutputStream out = new FileOutputStream(new File(file));
            workbook.write(out);
            out.close();
            workbook.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

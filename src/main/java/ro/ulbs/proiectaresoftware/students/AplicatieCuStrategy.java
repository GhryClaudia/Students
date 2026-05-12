package ro.ulbs.proiectaresoftware.students;

import java.util.Arrays;
import java.util.List;

public class AplicatieCuStrategy {
    public static void main(String[] args) {
        List<Student> studenti = Arrays.asList(
                new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70),
                new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10),
                new Student(1026, "Anamaria", "Prodan", "TI131/1", 8.90),
                new Student(1029, "Bianca", "Popescu", "TI131/1", 10),
                new Student(1029, "Maria", "Pana", "TI131/,", 4.10),
                new Student(1029, "Gabriela", "Mohanu", "TI131/2", 7.33),
                new Student(1029, "Marius", "Nasta", "TI131/2", 3.20),
                new Student(1029, "Marius", "Nasta", "TI131/1", 5.12),
                new Student(1029, "Andrei", "Dobrescu", "TI131/2", 2.22)
        );
        Exporter exporter = new Exporter();
        IStudentiExport strategyConsole = new StudentiInConsola();
        exporter.startExport(strategyConsole, studenti);

        String fileText = "studentiStrategyText.txt";
        IStudentiExport strategyText = new StudentiInFisierText(fileText);
        exporter.startExport(strategyText, studenti);

        String fileExcel = "studentiStrategyExcel.xlsx";
        IStudentiExport strategyExcel = new StudentiInFisierXlsx(fileExcel);
        exporter.startExport(strategyExcel, studenti);

        IStudentiExportRead text = new CitireStudentiFisierText("studentiStrategyText.txt");
        List<Student> lista = text.doExport();
        for (Student student : lista) {
            System.out.println(student);
        }
        System.out.println();

        IStudentiExportRead excel = new CitireStudentiXlsx("studentiStrategyExcel.xlsx");
        List<Student> lista2 = excel.doExport();
        for (Student student : lista2) {
            System.out.println(student);
        }
    }
}

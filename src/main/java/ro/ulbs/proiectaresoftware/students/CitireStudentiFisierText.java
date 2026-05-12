package ro.ulbs.proiectaresoftware.students;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitireStudentiFisierText implements IStudentiExportRead
{
    private String fileName;
    public CitireStudentiFisierText(String f){
       fileName=f;
    }
    @Override
    public List<Student> doExport()
    {
        ArrayList<Student> lista = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String linie = sc.nextLine();
                if(linie.trim().isEmpty()) {
                    continue;
                }
                String[] campuri = linie.split(",");

                if(campuri.length < 5) {
                    System.out.println("Linie invalida: " + linie);
                    continue;
                }
                double nota = 0;
                if(!campuri[4].trim().isEmpty()) {
                    nota = Double.parseDouble(campuri[4]);
                }
                Student s = new Student(
                        Integer.parseInt(campuri[0].trim()),
                        campuri[1].trim(),
                        campuri[2].trim(),
                        campuri[3].trim(),
                        nota
                );
                lista.add(s);
            }
            sc.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}

package ro.ulbs.proiectaresoftware.students;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class StudentiInFisierText implements IStudentiExport
{
    private String file;
    public StudentiInFisierText(String f)
    {
        file=f;
    }
    @Override
    public void doExport(List<Student> studenti) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for(Student s : studenti) {
                writer.write(
                        s.getNumarmatricol() + "," +
                                s.getPrenume() + "," +
                                s.getNume() + "," +
                                s.getFormatieDeStudiu() + "," +
                                s.getNota()
                );
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

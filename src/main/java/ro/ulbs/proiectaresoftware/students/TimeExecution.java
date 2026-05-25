package ro.ulbs.proiectaresoftware.students;

import java.util.List;

public class TimeExecution implements ITimeExecution
{
    protected IStudentiExport exporter;

    public TimeExecution(IStudentiExport exporter) {
        this.exporter = exporter;
    }

    @Override
    public long executionTime(List<Student> studenti) {

        long startTime = System.currentTimeMillis();

        exporter.doExport(studenti);

        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        System.out.println("Timp executie: " + executionTime + " ms");

        return executionTime;
    }
}

package ro.ulbs.proiectaresoftware.students;

import java.util.List;

public class TimeExecutionDecorator extends TimeExecution
{
    public TimeExecutionDecorator(IStudentiExport exporter) {
        super(exporter);
    }

    public long executionTime(List<Student> studenti) {

        long startTime = System.currentTimeMillis();

        exporter.doExport(studenti);

        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        System.out.println("Timp executie: "
                + executionTime + " ms");

        return executionTime;
    }
}

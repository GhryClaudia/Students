package ro.ulbs.proiectaresoftware.students;

import java.util.Objects;

public class Student
{
    private int numarmatricol;
    private String prenume;
    private String nume;
    private String formatieDeStudiu;
    public Student(int numarmatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarmatricol = numarmatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }
    public int getNumarmatricol() {
        return numarmatricol;
    }
    public String getPrenume() {
        return prenume;
    }
    public String getNume() {
        return nume;
    }
    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }
    @Override
    public String toString() {

//        return "Student{" +
//                "numarmatricol=" + numarmatricol +
//                ", prenume='" + prenume + '\'' +
//                ", nume='" + nume + '\'' +
//                ", formatieDeStudiu='" + formatieDeStudiu + '\'' +
//                '}';
        return String.format("%14d %20s %8s", numarmatricol, prenume+" "+nume, formatieDeStudiu);
    }
    public boolean ExistaStudent(Student s)
    {
        if(this.prenume==s.prenume && this.nume==s.nume && this.formatieDeStudiu==s.formatieDeStudiu)
            return true;
        else
            return false;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return numarmatricol == student.numarmatricol &&
                Objects.equals(prenume, student.prenume) &&
                Objects.equals(nume, student.nume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu);
    }
    @Override
    public int hashCode() {
        return Objects.hash(numarmatricol, prenume, nume, formatieDeStudiu);
    }
    public String Sir(){
        return String.valueOf(numarmatricol)+" "+prenume+" "+nume+" "+formatieDeStudiu;
    }
}

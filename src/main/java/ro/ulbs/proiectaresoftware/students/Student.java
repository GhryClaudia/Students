package ro.ulbs.proiectaresoftware.students;

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
}

package ro.ulbs.proiectaresoftware.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student
{
    private final int numarmatricol;
    private final String prenume;
    private final String nume;
    private String formatieDeStudiu;
    private final double nota;
//    public Student(int numarmatricol, String prenume, String nume, String formatieDeStudiu) {
//        this.numarmatricol = numarmatricol;
//        this.prenume = prenume;
//        this.nume = nume;
//        this.formatieDeStudiu = formatieDeStudiu;
//    }
    public Student(int numarmatricol, String prenume, String nume, String formatieDeStudiu, double nota) {
        this.numarmatricol = numarmatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = nota;
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
    public double getNota() {return nota;}
    @Override
    public String toString() {

        return "Student{" +
                "numarmatricol=" + numarmatricol +
               ", prenume='" + prenume + '\'' +
               ", nume='" + nume + '\'' +
               ", formatieDeStudiu='" + formatieDeStudiu + ", nota=" + nota + '\'' +
               '}';
        //return String.format("%14d %20s %8 ", numarmatricol, prenume+" "+nume, formatieDeStudiu);
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
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu) &&
                Objects.equals(nota, student.nota);
    }
    @Override
    public int hashCode() {
        return Objects.hash(numarmatricol, prenume, nume, formatieDeStudiu, nota);
    }
    public String Sir(){
        return String.valueOf(numarmatricol)+" "+prenume+" "+nume+" "+formatieDeStudiu;
    }
    public static Student schimbaFormatiaDeStudiu(Student s, String formatieNoua)
    {
        if(s.formatieDeStudiu.compareTo(formatieNoua)!=0)
            s.formatieDeStudiu=formatieNoua;
        return s;
    }
    public static void imparte(List<Student> studenti, List<Student> list1, List<Student> list2,String formatie1,String formatie2) {
        for (int i = 0; i < studenti.size()/2; i++) {
            Student s1 = studenti.get(i);
            s1.schimbaFormatiaDeStudiu(s1, formatie1);
            list1.add(s1);
        }
        for (int i = studenti.size()/2; i < studenti.size(); i++) {
            Student s2 = studenti.get(i);
            s2.schimbaFormatiaDeStudiu(s2, formatie2);
            list2.add(s2);
        }

    }
}

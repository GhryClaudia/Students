package ro.ulbs.proiectaresoftware.students;

import java.util.Objects;

public class StudentiBursieri extends Student
{
    private double cuantumBursa;

    public StudentiBursieri(int numarmatricol, String prenume, String nume, String formatieDeStudiu,double nota, double cuantumBursa) {
        super(numarmatricol, prenume, nume, formatieDeStudiu,nota);
        this.cuantumBursa = cuantumBursa;
    }
    public double getCuantumBursa() {
        return cuantumBursa;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return this.getNumarmatricol() == student.getNumarmatricol() &&
                Objects.equals(this.getPrenume(), student.getPrenume()) &&
                Objects.equals(this.getNume(), student.getNume()) &&
                Objects.equals(this.getFormatieDeStudiu(), student.getFormatieDeStudiu()) &&
                Objects.equals(this.getNota(), student.getNota());
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getNumarmatricol(), this.getPrenume(), this.getNume(), this.getFormatieDeStudiu(), this.getNota(), cuantumBursa);
    }
    public String toString() {

        return "Student{" +
                "numarmatricol=" + this.getNumarmatricol() +
                ", prenume='" + this.getPrenume() + '\'' +
                ", nume='" + this.getNume() + '\'' +
                ", formatieDeStudiu='" + this.getFormatieDeStudiu() +
                ", nota=" + this.getNota() +
                ", cuantum bursa=" + cuantumBursa +'\'' +
                '}';
    }
    public String Sir()
    {
        return String.valueOf(this.getNumarmatricol())+" "+this.getPrenume()+" "+this.getNume()+" "+this.getFormatieDeStudiu()+" "+String.valueOf(this.getNota())+" "+String.valueOf(cuantumBursa);
    }
}

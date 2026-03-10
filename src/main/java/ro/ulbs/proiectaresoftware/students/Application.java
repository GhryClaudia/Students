package ro.ulbs.proiectaresoftware.students;
import java.util.*;

public class Application {
    public static void main() {
        Student s1= new Student(112, "Ioan", "Popa", "TI21/1");
        Student s2= new Student(112, "Maria", "Oprea", "TI21/1");
        Student s3= new Student(120, "Alis", "Popa", "TI21/2");
        Student s4= new Student(122, "Mihai", "Vecerdea", "TI22/1");
        Student s5= new Student(122, "Eugen", "Uritescu", "TI22/2");
        System.out.printf("%14s %20s %16s%n", "numar matricol", "prenume nume", "formatieDeStudiu");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        List<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        for(Student student:list)
            System.out.println(student);
        Student student1= new Student(120, "Alis", "Popa", "TI21/2");
        Student student2=new Student(112, "Maria", "Popa", "TI21/1");
        int exista1=0;
        int exista2=0;
        for(Student student:list)
        {
            if(student.ExistaStudent(student1))
                exista1=1;
            if(student.ExistaStudent(student2))
                exista2=1;
        }
        if(exista1==1)
            System.out.println("Exista student 1");
        else
            System.out.println("Nu exista acest student");
        if(exista2==1)
            System.out.println("Exista student 2");
        else
            System.out.println("Nu exista acest student");
        Set<Student> setS=new HashSet<Student>();
        setS.add(s1);
        setS.add(s2);
        setS.add(s3);
        setS.add(s4);
        setS.add(s5);
        boolean contine=setS.contains(student1);
        if(contine==true)
            System.out.println("Exista student 1");
        else
            System.out.println("Nu exista acest student");
        contine=setS.contains(student2);
        if(contine==true)
            System.out.println("Exista student 2");
        else
            System.out.println("Nu exista acest student");
    }
}

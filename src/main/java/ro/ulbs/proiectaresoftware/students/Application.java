package ro.ulbs.proiectaresoftware.students;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Application {
    public static void main() {
       /* Student s1= new Student(112, "Ioan", "Popa", "TI21/1");
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
            System.out.println("Nu exista acest student");*/
        File f=new File("studenti_in.txt");
        Scanner sc=null;
        List<Student> listS=new ArrayList<Student>();
        String studenti;
        try{
            sc=new Scanner(f);
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        while(sc.hasNextLine())
        {
            studenti=sc.nextLine();
            String[] campuri=studenti.split(",");
            int nr=Integer.parseInt(campuri[0]);
            Student s=new Student(nr,campuri[1],campuri[2],campuri[3]);
            listS.add(s);
        }
        listS.sort(Comparator.comparing(Student::getNume));
        List<String> listout=new ArrayList<>();
        for(Student s:listS)
            listout.add(s.Sir());
        try {
            Path path = Paths.get("studenti_out.txt");
            Files.write(path, listout);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        listout.clear();
        listS.sort(Comparator.comparing(Student::getFormatieDeStudiu));
        listS.sort(Comparator.comparing(Student::getNume));
        for(Student s:listS)
            listout.add(s.Sir());
        try {
            Path path = Paths.get("studenti_out_sorted.txt");
            Files.write(path, listout);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

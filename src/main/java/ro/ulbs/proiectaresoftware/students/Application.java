package ro.ulbs.proiectaresoftware.students;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Application {
    public static void main(String[] args) throws IOException {
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
        /*File f = new File("studenti_in.txt");
        Scanner sc = null;
        List<Student> listS = new ArrayList<Student>();
        String studenti;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        if (sc != null)
            while (sc.hasNextLine()) {
                studenti = sc.nextLine();
                String[] campuri = studenti.split(",");
                int nr = Integer.parseInt(campuri[0]);
                Student s = new Student(nr, campuri[1], campuri[2], campuri[3]);
                listS.add(s);
            }
        listS.sort(Comparator.comparing(Student::getNume));
        List<String> listout = new ArrayList<>();
        for (Student s : listS)
            listout.add(s.Sir());
        try {
            Path path = Paths.get("studenti_out.txt");
            Files.write(path, listout);
        } catch (IOException e) {
            e.printStackTrace();
        }
        listout.clear();
        listS.sort(Comparator.comparing(Student::getFormatieDeStudiu));
        listS.sort(Comparator.comparing(Student::getNume));
        for (Student s : listS)
            listout.add(s.Sir());
        scriefisier("studenti_out_sorted.txt", listout);
        Map<Integer, Student> mapStudenti = new HashMap<>();
        for (Student s : listS)
            mapStudenti.put(s.getNumarmatricol(), s);
        File f2 = new File("note_anon.txt");
        Scanner sc2 = null;
        try {
            sc2 = new Scanner(f2);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        if (sc2 != null)
            while (sc2.hasNextLine()) {
                String linie= sc2.nextLine();
                String[] p = linie.split(",");
                Integer nr =Integer.parseInt(p[0]);
                float nota = Float.parseFloat(p[1]);
                Student s = mapStudenti.get(nr);
                if (s != null) {
                    s.setNota(nota);
                }
            }
        for (Student s : mapStudenti.values()) {
            System.out.println(s);
        }
        System.out.println();
        double notaM = gasesteNota("Bianca", "Popescu", mapStudenti);
        double notaN = gasesteNota("Ioan", "Mihalcea", mapStudenti);
        System.out.println(notaM+" "+notaN);
        List<StudentiBursieri> bursieri = new ArrayList<StudentiBursieri>();
        bursieri.add( new StudentiBursieri(1025,"Andrei","Popa","ISM141/2", (float)8.70, 725.50));
        bursieri.add( new StudentiBursieri(1024,"Ioan","Mihalcea","ISM141/1", 9.80, 801.10));
        bursieri.add( new StudentiBursieri(1026,"Anamaria","Prodan","TI131/1", 8.90, 745.50));
        bursieri.add( new StudentiBursieri(1029,"Bianca","Popescu","TI131/1,", 9.10, 780.80));
        List<String> bursieriout = new ArrayList<>();
        for (StudentiBursieri s : bursieri)
            bursieriout.add(s.Sir());
        scriefisier("bursieri_out.txt",bursieriout);*/
        /*Student s1= new Student(112, "Ioan", "Popa", "TI21/2",9.8);
        Student s2= new Student(112, "Maria", "Oprea", "TI21/1",7.4);
        Student s3= new Student(120, "Alis", "Popa", "TI21/1",3.9);
        Student s4= new Student(122, "Mihai", "Vecerdea", "TI22/2",8.2);
        Student s5= new Student(122, "Eugen", "Uritescu", "TI22/1",9.5);
        Student s6= new Student(172, "Elena", "Pop", "TI21/1",6.8);
        List<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        List<Student> list1=new ArrayList<Student>();
        List<Student> list2=new ArrayList<Student>();
        Student.imparte(list,list1,list2,"TI212","TI211");
        for(Student s: list)
            System.out.println(s);
        System.out.println();
        for(Student s: list1)
            System.out.println(s);
        System.out.println();
        for(Student s: list2)
            System.out.println(s);
        ScrieExcel(list);
        List<Student> listaStudenti = CitesteExcel();
        for(Student s: listaStudenti)
            System.out.println(s);
    }
    public static List CitesteExcel() throws IOException {
        List<Student> listaStudenti = new ArrayList<>();
        FileInputStream file = new FileInputStream(new File("laborator8_students.xlsx"));

//Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

//Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

//Iterate through each rows one by one
        Iterator<Row> rowIterator = sheet.iterator();
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }
        while (rowIterator.hasNext()) {

            Row row = rowIterator.next();
            int numarMatricol = (int) row.getCell(0).getNumericCellValue();
            String prenume = row.getCell(1).getStringCellValue();
            String nume = row.getCell(2).getStringCellValue();
            String formatie = row.getCell(3).getStringCellValue();
            double nota = row.getCell(4).getNumericCellValue();

            Student student = new Student(numarMatricol, prenume, nume, formatie, nota);

            listaStudenti.add(student);
            }
        workbook.close();
        file.close();
        return listaStudenti;*/
        List<Student> studentiCuNote = Arrays.asList(
                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Student(1029,"Bianca","Popescu","TI131/1,", 10),
                new Student(1029,"Maria","Pana","TI131/2,", 4.10),
                new Student(1029,"Gabriela","Mohanu","TI131/2,", 7.33),
                new Student(1029,"Marius","Nasta","TI131/2,", 3.20),
                new Student(1029,"Marius","Nasta","TI131/1,", 5.12),
                new Student(1029,"Andrei","Dobrescu","TI131/2,", 2.22)
        );
        List<Student> studentiCuNota10= studentiCuNote.stream()
                .filter(s->s.getNota()==10)
                .toList();
        List<Student> studentiSub5=studentiCuNote.stream()
                .filter(s->s.getNota()<5)
                .toList();
        List<Student> nota4=studentiCuNote.stream()
                .map(s -> new Student(
                        s.getNumarmatricol(),
                        s.getNume(),
                        s.getPrenume(),
                        s.getFormatieDeStudiu(),
                        s.getNota() < 4 ? 4 : s.getNota()
                ))
                .toList();
        double suma=studentiCuNote.stream()
                .map(Student::getNota)
                .reduce(0.0, Double::sum);
        double medie=suma / studentiCuNote.size();
        System.out.println("Studentii cu nota 10 "+studentiCuNota10);
        System.out.println("Studentii cu nota sub 5 "+studentiSub5);
        System.out.println("Studentii nota 4 "+nota4);
        System.out.println("Suma notelor "+suma);
        System.out.println("Media notelor "+medie);
    }

    public static void ScrieExcel(List <Student> list)
    {
        XSSFWorkbook workbook = new XSSFWorkbook();
//Create a blank sheet

        XSSFSheet sheet = workbook.createSheet("Studenti");

//Prepare data to be written as an Object[]

        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"NUMAR MATRICOL", "PRENUME", "NUME", "FORMATIE DE STUDIU", "NOTA"});
        int i=2;
        for (Student s: list)
            data.put(String.valueOf(i++),new Object[] {s.getNumarmatricol(),s.getPrenume(),s.getNume(),s.getFormatieDeStudiu(),s.getNota()});


//Iterate over data and write to sheet

        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {

            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
                else if (obj instanceof Double)
                    cell.setCellValue((Double) obj);
            }
        }
//Write the workbook in file system
        try {
            FileOutputStream out = new FileOutputStream(new File("laborator8_students.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("laborator8_students.xlsx written successfully on disk.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double gasesteNota(String p, String n,  Map<Integer, Student> map)
    {
        for(Student s : map.values())
        {
            if(s.getPrenume().equals(p) && s.getNume().equals(n))
                return s.getNota();
        }
        return 0;
    }
    public static void scriefisier(String nume, List<String> lista)
    {
        try {
            Path path = Paths.get(nume);
            Files.write(path, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

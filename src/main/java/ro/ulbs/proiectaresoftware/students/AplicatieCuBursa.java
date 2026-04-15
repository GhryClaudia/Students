package ro.ulbs.proiectaresoftware.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AplicatieCuBursa {
    static void main(String[] args) {
        AplicatieCuBursa instanta = new AplicatieCuBursa();
        List<StudentiBursieri> lista = instanta.genereaza();
        for (StudentiBursieri student : lista) {
            System.out.println(student);
        }
        System.out.println("--------------------------------------------------");
        List<StudentiBursieri> sortata = instanta.sorteaza(lista);
        for (StudentiBursieri student : sortata) {
            System.out.println(student);
        }
    }

    public List<StudentiBursieri> genereaza() {
        List<StudentiBursieri> lista = new ArrayList<>();
        lista.add(new StudentiBursieri(1025, "Andrei", "Popa", "ISM141/2", 8.70, 725.50));
        lista.add(new StudentiBursieri(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80, 801.10));
        lista.add(new StudentiBursieri(1029, "Bianca", "Popescu", "TI131/1,", 9.10, 780.80));
        lista.add(new StudentiBursieri(1026, "Anamaria", "Prodan", "TI131/1", 8.90, 745.50));
        lista.add(new StudentiBursieri(1029, "Bianca", "Popescu", "TI131/1,", 9.10, 100.00));
        return lista;
    }

    public List<StudentiBursieri> sorteaza(List<StudentiBursieri> lst) {
        Collections.sort(lst, new Comparator<StudentiBursieri>() {
            @Override
            public int compare(StudentiBursieri s1, StudentiBursieri s2) {
                int rez;
                rez = s1.getFormatieDeStudiu().compareTo(s2.getFormatieDeStudiu());
                if (rez != 0)
                    return rez;
                rez = s1.getNume().compareTo(s2.getNume());
                if (rez != 0)
                    return rez;
                rez = s1.getPrenume().compareTo(s2.getPrenume());
                if (rez != 0)
                    return rez;
                rez = Double.compare(s2.getNota(), s1.getNota());
                if (rez != 0)
                    return rez;
                return Double.compare(s2.getCuantumBursa(), s1.getCuantumBursa());
            }
        });
        return lst;
    }
}

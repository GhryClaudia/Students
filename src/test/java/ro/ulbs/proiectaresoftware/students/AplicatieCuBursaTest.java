package ro.ulbs.proiectaresoftware.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class AplicatieCuBursaTest {
    AplicatieCuBursa appCuBursa = new AplicatieCuBursa();

    @Test
    void sortTest1() {
        List<StudentiBursieri> lista = new ArrayList<>();
        lista.add(new StudentiBursieri(1025, "Andrei", "Popa", "ISM141/2", 8.70, 725.50));
        lista.add(new StudentiBursieri(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80, 801.10));
        lista.add(new StudentiBursieri(1029, "Bianca", "Popescu", "TI131/1,", 9.10, 780.80));
        lista.add(new StudentiBursieri(1026, "Anamaria", "Prodan", "TI131/1", 8.90, 745.50));
        lista.add(new StudentiBursieri(1029, "Bianca", "Popescu", "TI131/1,", 9.10, 100.00));
        List<StudentiBursieri> listaSortata = appCuBursa.sorteaza(lista);
        for (int i = 0; i < listaSortata.size() - 1; i++) {
            StudentiBursieri s1 = listaSortata.get(i);
            StudentiBursieri s2 = listaSortata.get(i + 1);
            if (!s1.getFormatieDeStudiu().equals(s2.getFormatieDeStudiu()))
                assertTrue(s1.getFormatieDeStudiu().compareTo(s2.getFormatieDeStudiu()) <= 0);
            else
                if (!s1.getNume().equals(s2.getNume()))
                    assertTrue(s1.getNume().compareTo(s2.getNume()) <= 0);
                else
                    if (!s1.getPrenume().equals(s2.getPrenume()))
                        assertTrue(s1.getPrenume().compareTo(s2.getPrenume()) <= 0);
                    else
                        if (s1.getNota() != s2.getNota())
                            assertTrue(s1.getNota() >= s2.getNota());
                        else
                            assertTrue(s1.getCuantumBursa() >= s2.getCuantumBursa());
        }
    }
}
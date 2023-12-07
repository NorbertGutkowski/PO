import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Produkt2{
    String nazwa;
    double cena;
    LocalDate dataWaznosci;
    public Produkt2(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }
    @Override
    public String toString() {
        return "" + dataWaznosci;
    }
    public static void main(String[] args) {
        ArrayList<Produkt2> produkt2List = new ArrayList<>();
        produkt2List.add(new Produkt2("Osoba1", 183, LocalDate.of(2015, 2, 22)));
        produkt2List.add(new Produkt2("Osoba2", 182, LocalDate.of(2014, 7, 23)));
        produkt2List.add(new Produkt2("Osoba3", 165, LocalDate.of(2017, 1, 18)));
        produkt2List.add(new Produkt2("Osoba4", 170, LocalDate.of(2020, 3, 8)));
        produkt2List.add(new Produkt2("Osoba5", 202, LocalDate.of(2090, 3, 8)));
        produkt2List.sort(new Produkt2Comparator());
        System.out.println(produkt2List);

    }
}
class Produkt2Comparator implements Comparator<Produkt2>{
    @Override
    public int compare(Produkt2 o1, Produkt2 o2) {
        return o1.dataWaznosci.compareTo(o2.dataWaznosci);
    }
}

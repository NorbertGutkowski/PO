import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Produkt implements Comparable<Produkt>{
    String nazwa;
    double cena;
    LocalDate dataProdukcji;
    public Produkt(String nazwa, double cena, LocalDate dataProdukcji) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataProdukcji = dataProdukcji;
    }

    @Override
    public String toString() {
        return "" + dataProdukcji;
    }

    public static void main(String[] args) {
        ArrayList<Produkt> produktList = new ArrayList<>();
        produktList.add(new Produkt("Produkt1", 2400.00, LocalDate.of(2015, 2, 22)));
        produktList.add(new Produkt("Produkt2", 2800.00, LocalDate.of(2014, 7, 23)));
        produktList.add(new Produkt("Produkt3", 2300.00, LocalDate.of(2017, 1, 18)));
        produktList.add(new Produkt("Produkt4", 2400.00, LocalDate.of(2020, 3, 8)));
        produktList.add(new Produkt("Produkt5", 2100.00, LocalDate.of(2090, 3, 8)));
        System.out.println(produktList);
        Collections.sort(produktList);
        System.out.println(produktList);

    }
    @Override
    public int compareTo(Produkt o) {
        return this.dataProdukcji.compareTo(o.dataProdukcji);
    }
}


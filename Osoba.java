import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Osoba implements Comparable<Osoba> {
    String imie;
    int wzrost;
    LocalDate dataUrodzenia;

    public Osoba(String imie, int wzrost, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.dataUrodzenia = dataUrodzenia;
    }
    @Override
    public String toString() {
        return "" + wzrost;
    }

    public static void main(String[] args) {
        ArrayList<Osoba> osobaList = new ArrayList<>();
        osobaList.add(new Osoba("Osoba1", 183, LocalDate.of(2015, 2, 22)));
        osobaList.add(new Osoba("Osoba2", 182, LocalDate.of(2014, 7, 23)));
        osobaList.add(new Osoba("Osoba3", 165, LocalDate.of(2017, 1, 18)));
        osobaList.add(new Osoba("Osoba4", 170, LocalDate.of(2020, 3, 8)));
        osobaList.add(new Osoba("Osoba5", 202, LocalDate.of(2090, 3, 8)));
        System.out.println(osobaList);
        Collections.sort(osobaList);
        System.out.println(osobaList);

    }
    @Override
    public int compareTo(Osoba o) {
        return Integer.compare(o.wzrost, this.wzrost);
    }
}

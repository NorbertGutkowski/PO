import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Pracownik implements Comparable<Pracownik>{
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return ""+ imie + " " + pensja + " " + dataZatrudnienia;
    }

    public static void main(String[] args) {
        ArrayList<Pracownik> pracownikList = new ArrayList<>();
        pracownikList.add(new Pracownik("Imie1", 2400.00, LocalDate.of(2015, 2, 22)));
        pracownikList.add(new Pracownik("Imie2", 2800.00, LocalDate.of(2014, 7, 23)));
        pracownikList.add(new Pracownik("Imie3", 2300.00, LocalDate.of(2017, 1, 18)));
        pracownikList.add(new Pracownik("Imie1", 2400.00, LocalDate.of(2020, 3, 8)));
        pracownikList.add(new Pracownik("Imie4", 2100.00, LocalDate.of(2090, 3, 8)));
        System.out.println(pracownikList);
        Collections.sort(pracownikList);
        System.out.println(pracownikList);

    }
    @Override
    public int compareTo(Pracownik o) {
        return Double.compare(this.pensja, o.pensja);
    }
}
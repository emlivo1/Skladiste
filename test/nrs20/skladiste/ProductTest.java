package nrs20.skladiste;
import nrs20.skladiste.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    void konstruktor() {
        Product p = new Product("naziv","sifra","kategorija","kolicina");
        assertEquals("naziv", p.getNaziv());
        assertEquals("sifra", p.getSifra());
        assertEquals("kategorija", p.getKategorija());
        assertEquals("kolicina", p.getKolicina());

    }
    @Test
    void toStringTest() {
        Product p = new Product("naziv","sifra","kategorija","kolicina");
        String s = "" + p;
        assertEquals("naziv sifra", s);
    }
    @Test
    void setteri() {
        Product p = new Product("naziv","sifra","kategorija","kolicina");
        p.setNaziv("a");
        p.setSifra("b");
        p.setKategorija("c");
        p.setKolicina("d");

        assertEquals("a",  p.getNaziv());
        assertEquals("b",  p.getSifra());
        assertEquals("c",  p.getKategorija());
        assertEquals("d",  p.getKolicina());

    }
}

package nrs20.skladiste;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class Product {
    private SimpleStringProperty naziv, sifra, kategorija,kolicina;

    public Product(String naziv, String sifra, String kategorija, String kolicina) {
        this.naziv = new SimpleStringProperty (naziv);
        this.sifra = new SimpleStringProperty(sifra);
        this.kategorija = new SimpleStringProperty (kategorija);
        this.kolicina = new SimpleStringProperty(kolicina);
    }

    @Override
    public String toString() {
        return getNaziv()+" "+getSifra();
    }

    public String getNaziv() {
        return naziv.get();
    }

    public SimpleStringProperty nazivProperty() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv.set(naziv);
    }

    public String getSifra() {
        return sifra.get();
    }

    public SimpleStringProperty sifraProperty() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra.set(sifra);
    }

    public String getKategorija() {
        return kategorija.get();
    }

    public SimpleStringProperty kategorijaProperty() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija.set(kategorija);
    }

    public String getKolicina() {
        return kolicina.get();
    }

    public SimpleStringProperty kolicinaProperty() {
        return kolicina;
    }

    public void setKolicina(String kolicina) {
        this.kolicina.set(kolicina);
    }
}
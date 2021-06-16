package nrs20.skladiste;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Skladiste {
    private SimpleStringProperty naziv = new SimpleStringProperty("");
    private SimpleStringProperty adresa = new SimpleStringProperty("");

    public Skladiste(String naziv, String adresa) {
        this.naziv = new SimpleStringProperty(naziv);
        this.adresa = new SimpleStringProperty(adresa);
    }

    public Skladiste() {
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

    public String getAdresa() {
        return adresa.get();
    }

    public SimpleStringProperty adresaProperty() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa.set(adresa);
    }

    @Override
    public String toString() {
        return naziv.get();
    }
}

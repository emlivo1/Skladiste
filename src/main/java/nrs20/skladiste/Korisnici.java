package nrs20.skladiste;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Korisnici {
    public int id;
    public String korisnickoIme;
    public String ime;
    public String prezime;
    public String email;
    public String adresa;
    public String lozinka;
    public String status;

    public ObservableList<String> sviKorisnici= FXCollections.observableArrayList();

}

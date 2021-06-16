package nrs20.skladiste;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Korisnici {
    private int id;
    private String korisnickoIme;
    private String ime;
    private String prezime;
    private String email;
    private String adresa;
    private String lozinka;
    private String status;

    public ObservableList<String> sviKorisnici= FXCollections.observableArrayList();
    public ObservableList<Uposlenici> listaUposlenika=FXCollections.observableArrayList();
}

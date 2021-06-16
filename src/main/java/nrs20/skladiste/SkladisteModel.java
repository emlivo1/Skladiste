package nrs20.skladiste;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SkladisteModel {
    private ObservableList<Skladiste> skladista = FXCollections.observableArrayList();
    private ObjectProperty<Skladiste> trenutnoSkladiste = new SimpleObjectProperty<>();

    public ObservableList<Skladiste> getSkladista() {
        return skladista;
    }

    public void setSkladista(ObservableList<Skladiste> skladista) {
        this.skladista = skladista;
    }

    public Skladiste getTrenutnoSkladiste() {
        return trenutnoSkladiste.get();
    }

    public ObjectProperty<Skladiste> trenutnoSkladisteProperty() {
        return trenutnoSkladiste;
    }

    public void setTrenutnoSkladiste(Skladiste trenutnoSkladiste) {
        this.trenutnoSkladiste.set(trenutnoSkladiste);
    }
    public void napuni(){
        skladista.add(new Skladiste("NRS","Zmaja od Bosne"));
        skladista.add(new Skladiste("NRSSkladiste","Vrbanja 3"));
        skladista.add(new Skladiste("NRSSkladisteProjekat","Zmaja od Bosne 23"));


    }
    public void addSkladiste(){
        skladista.add(new Skladiste());
    }
}

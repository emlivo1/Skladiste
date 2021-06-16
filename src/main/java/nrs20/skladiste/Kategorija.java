package nrs20.skladiste;

public class Kategorija {
    private int kategorijaId;
    private String naziv;
    private String opis;

    public Kategorija(int kategorijaId, String naziv, String opis) {
        this.kategorijaId = kategorijaId;
        this.naziv = naziv;
        this.opis = opis;
    }

    public int getKategorijaId() {
        return kategorijaId;
    }

    public void setKategorijaId(int kategorijaId) {
        this.kategorijaId = kategorijaId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}

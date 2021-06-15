package nrs20.skladiste;

public class Uposlenici {

    public String uposlenikId;
    public String imeIPrezime;

    public Uposlenici(String uposlenikId, String imeIPrezime) {
        this.uposlenikId = uposlenikId;
        this.imeIPrezime = imeIPrezime;
    }

    public String getUposlenikId() {
        return uposlenikId;
    }

    public void setUposlenikId(String uposlenikId) {
        this.uposlenikId = uposlenikId;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
}

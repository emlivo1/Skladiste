package nrs20.skladiste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class SkladisteDAO {
    private static SkladisteDAO instance;
    private Connection conn;

    private PreparedStatement dajSkladisteUpit, dajProizvodUpit, obrisiProizvodUpit, urediProizvodUpit, obrisiSveProizvodeUpit, dodajProizvodUpit;

    public static SkladisteDAO getInstance() {
        if(instance==null)instance=new SkladisteDAO();
        return instance;
    }
    private SkladisteDAO(){
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:skladiste.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            dajProizvodUpit = conn.prepareStatement("SELECT proizvodi.id, proizvodi.naziv, proizvodi.sifra, proizvodi.kategorija, proizvodi.kolicina FROM proizvodi, kategorija WHERE proizvodi.id=kategorija.id");
        } catch (SQLException e) {
            regenerisiBazu();
            try {
                dajProizvodUpit = conn.prepareStatement("SELECT proizvodi.id, proizvodi.naziv, proizvodi.sifra, proizvodi.kategorija, proizvodi.kolicina FROM proizvodi, kategorija WHERE proizvodi.id=kategorija.id");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }

        try {
            dajSkladisteUpit = conn.prepareStatement("SELECT * FROM skladiste WHERE id=?");
            obrisiProizvodUpit=conn.prepareStatement("DELETE FROM proizvodi WHERE id=?");
            urediProizvodUpit=conn.prepareStatement("UPDATE proizvodi SET naziv=?, sifra=?, kategorija=?, kolicina=? WHERE id=?");
            dodajProizvodUpit=conn.prepareStatement("INSERT INTO proizvodi VALUES(?,?,?,?,?");
            obrisiSveProizvodeUpit=conn.prepareStatement("DELETE * FROM proizvodi");
           } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static void removeInstance() {
        if (instance == null) return;
        instance.close();
        instance = null;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void regenerisiBazu() {
        Scanner ulaz = null;
        try {
            ulaz = new Scanner(new FileInputStream("skladiste.db.sql"));
            String sqlUpit = "";
            while (ulaz.hasNext()) {
                sqlUpit += ulaz.nextLine();
                if ( sqlUpit.charAt( sqlUpit.length()-1 ) == ';') {
                    try {
                        Statement stmt = conn.createStatement();
                        stmt.execute(sqlUpit);
                        sqlUpit = "";
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            ulaz.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

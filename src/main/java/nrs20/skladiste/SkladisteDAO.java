/*package nrs20.skladiste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class SkladisteDAO {
    private static SkladisteDAO instance;
    private Connection conn;

    private PreparedStatement dajSkladisteUpit, dajProizvodUpit, obrisiProizvodUpit, urediProizvodUpit, obrisiSveProizvodeUpit, dodajProizvodUpit;

    public static SkladisteDAO getInstance() throws SQLException {
        if(instance==null)instance=new SkladisteDAO();
        return instance;
    }
    private SkladisteDAO() throws SQLException {
        String url = "jdbc:sqlite:skladiste.db";
        conn=DriverManager.getConnection(url);
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

}*/

package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import nrs20.skladiste.Product;
import nrs20.skladiste.ProductsModel;
import nrs20.skladiste.SkladisteDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ProductsController {
    public Button btnDodaj;
    public Button btnUredi;
    public Button btnObrisi;
    private ProductsModel model;
    public TableView listOfProducts;
    public TableColumn nazivCol;
    public TableColumn sifraCol;
    public TableColumn kategorijaCol;
    public TableColumn kolicinaCol;
    private SkladisteDAO dao;
    public ProductsController(ProductsModel model) {
        this.model = model;
    }

    public ProductsController() {
        dao=SkladisteDAO.getInstance();
    }


    @FXML
    public void initialize() {
        nazivCol.setCellFactory(new PropertyValueFactory<Product, String>("naziv"));
        sifraCol.setCellFactory(new PropertyValueFactory<Product, String>("sifra"));
        kategorijaCol.setCellFactory(new PropertyValueFactory<Product, String>("kategorija"));
        kolicinaCol.setCellFactory(new PropertyValueFactory<Product, String>("kolicina"));
        listOfProducts.setItems(model.getProducts());
    }

    public void dodajProizvod(ActionEvent actionEvent) {
    }

    public void urediProizvod(ActionEvent actionEvent) {
    }

    public void obrisiProizvod(ActionEvent actionEvent) {
    }
}
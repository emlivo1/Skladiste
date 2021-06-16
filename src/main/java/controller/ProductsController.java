package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import nrs20.skladiste.Product;
import nrs20.skladiste.ProductsModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ProductsController {
    private ProductsModel model;
    public TableView listOfProducts;
    public TableColumn nazivCol;
    public TableColumn sifraCol;
    public TableColumn kategorijaCol;
    public TableColumn kolicinaCol;
    public ProductsController(ProductsModel model) {
        this.model = model;
    }


    @FXML
    public void initialize() {
        nazivCol.setCellFactory(new PropertyValueFactory<Product, String>("naziv"));
        sifraCol.setCellFactory(new PropertyValueFactory<Product, String>("sifra"));
        kategorijaCol.setCellFactory(new PropertyValueFactory<Product, String>("kategorija"));
        kolicinaCol.setCellFactory(new PropertyValueFactory<Product, String>("kolicina"));
        listOfProducts.setItems(model.getProducts());
    }
}
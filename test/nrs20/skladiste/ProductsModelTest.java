package nrs20.skladiste;

import nrs20.skladiste.Product;
import nrs20.skladiste.ProductsModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductsModelTest {
    @Test
    void konstruktor() {
        ProductsModel m = new ProductsModel();
        assertNull(m.getCurrentProduct());
        assertTrue(m.getProducts().isEmpty());
    }

    @Test
    void napuni() {
        ProductsModel m = new ProductsModel();
        m.napuni();
        assertEquals(1, m.getProducts().size());
        assertNull(m.getCurrentProduct());
    }

    @Test
    void napuni2() {
        ProductsModel m = new ProductsModel();
        m.napuni();
        String s = "";
        for(Product k : m.getProducts())
            s += k;
        String expected = "Nivea 1234";
        assertEquals(expected, s);
    }
    @Test
    void trenutniProizvod() {
        ProductsModel m = new ProductsModel();
        m.napuni();
        m.setCurrentProduct(m.getProducts().get(0));
        String s = "" + m.getCurrentProduct();
        assertEquals("Nivea 1234", s);
    }




}

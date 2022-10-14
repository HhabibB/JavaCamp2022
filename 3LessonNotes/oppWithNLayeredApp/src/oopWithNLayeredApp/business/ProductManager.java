package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //business rules
        if (product.getUnitPrice() < 10) {
            throw new Exception("Urun Fiyati 10-dan kucuk olamaz");
        }
        productDao.add(product);

        for (Logger logger: loggers) { //[db,mail]
            logger.log(product.getName());
        }

    }

}
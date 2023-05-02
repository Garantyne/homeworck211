package Services;

import Entitys.Product;

import java.util.List;

public interface Services {
    public void addProduct(Product product);

    public List<Product> getProduct();
}

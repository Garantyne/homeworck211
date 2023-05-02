package Services;

import Entitys.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements Services {
    private final Product product;
    List<Product> prod = new ArrayList<>();

    public ServiceImpl(Product product) {
        this.product = product;
    }

    @Override
    public void addProduct(Product product) {
        prod.add(product);
    }

    @Override
    public List <Product> getProduct() {
        return prod;
    }
}

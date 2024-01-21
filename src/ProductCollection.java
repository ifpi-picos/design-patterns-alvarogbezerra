import java.util.Iterator;
import java.util.List;

public class ProductCollection implements Iterable<Product> {

    private List<Product> products;

    public ProductCollection(List<Product> products) {
        this.products = products;
    }

    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(products);
    }

    public void add(Product product) {
        this.products.add(product);
    }
}
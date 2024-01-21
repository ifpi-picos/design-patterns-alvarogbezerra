import java.util.Iterator;
import java.util.List;

public class ProductIterator implements Iterator<Product> {

    private List<Product> products;
    private int index;

    public ProductIterator(List<Product> products) {
        this.products = products;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < products.size();
    }

    @Override
    public Product next() {
        if (hasNext()) {
            return products.get(index++);
        }
        return null;
    }
}
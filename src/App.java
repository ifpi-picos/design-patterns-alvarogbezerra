import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection(new ArrayList<>());

        products.add(new Product("iPhone 13 Pro Max", 1299.99));
        products.add(new Product("Samsung Galaxy S22 Ultra", 1199.99));
        products.add(new Product("Google Pixel 6 Pro", 899.99));
        
        // Pesquisa por nome
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals("iPhone 13 Pro Max")) {
                System.out.println("O produto encontrado é o iPhone 13 Pro Max, com preço de R$ 1299,99.");
                break;
            }
        }
    }
}

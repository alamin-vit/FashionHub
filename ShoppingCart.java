import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products;

    public ShoppingCart() {

        products = new ArrayList<>();
    }

    public void AddItem(Product product) {

        products.add(product);
    }

    public double verifyPayment() {

        double total = 0;

        for(Product product : products) {

            total += product.getPrice();
        }

        return total;
    }

    public String displayCart() {

        String result = "";

        for(Product product : products) {

            result += product.getProductName()
                    + " - $"
                    + product.getPrice()
                    + "\n";
        }

        result += "\nTotal: $" + verifyPayment();

        return result;
    }
}
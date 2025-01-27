import java.util.ArrayList;
import java.util.List;

public class Sepet {
        private List<Urun> products;


        public Sepet() {
            this.products = new ArrayList<>();
        }


        public void addProduct(Urun product) {
            products.add(product);
        }


        public List<Urun> getProducts() {
            return products;
        }


        public double getTotalPrice() {
            double total = 0;
            for (Urun product : products) {
                total += product.getPrice();
            }
            return total;
        }


        @Override
        public String toString() {
            return "Cart{" +
                    "products=" + products +
                    ", totalPrice=" + getTotalPrice() +
                    '}';
        }
}

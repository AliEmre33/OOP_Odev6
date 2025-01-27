//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ürünler oluşturuluyor
        Urun product1 = new Urun(1, "Laptop", 28000.0);
        Urun product2 = new Urun(2, "Mouse", 650.0);
        Urun product3 = new Urun(3, "Klavye", 4999.0);

        Kullanici user = new Kullanici(1, "ali123", "emre123");

        if (user.authenticate("emre123")) {
            System.out.println("Doğrulama başarılı");

            Sepet sepetim = new Sepet();

            sepetim.addProduct(product1);
            sepetim.addProduct(product2);
            sepetim.addProduct(product3);

            System.out.println("Sepet içeriği: " + sepetim.getProducts());
            System.out.println("Toplam Fiyat: " + sepetim.getTotalPrice());
        } else {
            System.out.println("Doğrulama hatalı");
        }
    }
}
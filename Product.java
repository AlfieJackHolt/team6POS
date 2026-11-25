package pos;

public class Product {

    private String barcode;
    private String name;
    private String category;
    private double price;

    public Product(String barcode, String name, String category, double price) {
        this.barcode = barcode;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
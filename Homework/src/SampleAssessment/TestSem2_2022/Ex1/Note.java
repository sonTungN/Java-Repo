package SampleAssessment.TestSem2_2022.Ex1;

public class Note {
    private int id;
    private Product product;
    private int quantity;
    private double price;

    public Note() {
        this.id = 0;
        this.product = null;
        this.quantity = 0;
        this.price = 0;
    }

    public Note(int id, Product product, int quantity, double price) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.price = product.getSellingPrice();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}

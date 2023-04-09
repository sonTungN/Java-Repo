package SampleAssessment.TestSem2_2022.Ex1;

public class Product {
    private int id;
    private String name;
    private String model;
    private String brand;
    private String company;
    private String description;
    private Category category;
    private double sellingPrice;

    public Product() {
        this.id = 0;
        this.name = null;
        this.model = null;
        this.brand = null;
        this.company = null;
        this.description = null;
        this.category = null;
        this.sellingPrice = 0;
    }

    public Product(int id, String name, String model, String brand, String company, String description, Category category, double sellingPrice) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.company = company;
        this.description = description;
        this.category = category;
        this.sellingPrice = sellingPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        if(description.length() == 0){
            return "No description";
        }
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", company='" + company + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}

import java.sql.Timestamp;

public class Product extends Commons{

    private String description;
    private double price;

    public Product(Long id, Timestamp createdAt, Timestamp updateAt, String description, double price) {
        super(id, createdAt, updateAt);
        this.description = description;
        this.price = price;
    }

    @Override
    public void showData(){
        System.out.println("Id: "+ super.getId());
        System.out.println("Descripcion: "+description);
        System.out.println("Precio: "+price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

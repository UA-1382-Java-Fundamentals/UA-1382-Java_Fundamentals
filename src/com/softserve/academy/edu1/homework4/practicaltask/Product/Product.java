package homework4.practicaltask.Product;

//4.* Create class called Product that has the following fields:
//String name, double price and int quantity.
//In main() method create four instances of type Product:
//Output the name and quantity of the most expensive item;
//Output the name of the items, which has the biggest quantity.


public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + '}';
    }
}

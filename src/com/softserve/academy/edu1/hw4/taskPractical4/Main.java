package softserve.academy.edu1.hw4.taskPractical4;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this("NewName", 1, 1);
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public static Product getExpensive(Product object1, Product object2, Product object3, Product object4) {
        Product expensive1 = new Product();
        Product expensive2 = new Product();
        if (object1.price >= object2.price) {
            expensive1.setName(object1.name);
            expensive1.setPrice(object1.price);
            expensive1.setQuantity(object1.quantity);
        }
        else {
            expensive1.setName(object2.name);
            expensive1.setPrice(object2.price);
            expensive1.setQuantity(object2.quantity);
        }
        if (object3.price >= object4.price) {
            expensive2.setName(object3.name);
            expensive2.setPrice(object3.price);
            expensive2.setQuantity(object3.quantity);
        }
        else {
            expensive2.setName(object4.name);
            expensive2.setPrice(object4.price);
            expensive2.setQuantity(object4.quantity);
        }
        if (expensive1.price >= expensive2.price) {
            return new Product(expensive1.name, expensive1.price, expensive1.quantity);
        }
        else {
            return new Product(expensive2.name, expensive2.price, expensive2.quantity);
        }
    }

    public static Product getNumerous(Product object1, Product object2, Product object3, Product object4) {
        Product numerous1 = new Product();
        Product numerous2 = new Product();
        if (object1.quantity >= object2.quantity) {
            numerous1.setName(object1.name);
            numerous1.setPrice(object1.price);
            numerous1.setQuantity(object1.quantity);
        }
        else {
            numerous1.setName(object2.name);
            numerous1.setPrice(object2.price);
            numerous1.setQuantity(object2.quantity);
        }
        if (object3.quantity >= object4.quantity) {
            numerous2.setName(object3.name);
            numerous2.setPrice(object3.price);
            numerous2.setQuantity(object3.quantity);
        }
        else {
            numerous2.setName(object4.name);
            numerous2.setPrice(object4.price);
            numerous2.setQuantity(object4.quantity);
        }
        if (numerous1.quantity >= numerous2.quantity) {
            return new Product(numerous1.name, numerous1.price, numerous1.quantity);
        }
        else {
            return new Product(numerous2.name, numerous2.price, numerous2.quantity);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Lord of the Rings", 2500, 10);
        Product product2 = new Product("Harry Potter", 1700, 15);
        Product product3 = new Product("Mazerunner", 300, 25);
        Product product4 = new Product("Twilight", 550, 45);

        Product expensive = Product.getExpensive(product1, product2, product3, product4);
        String mostExpensive = String.format("The most expensive product is %s in quantity of %d", expensive.getName(), expensive.getQuantity());
        System.out.println(mostExpensive);

        Product numerous = Product.getNumerous(product1, product2, product3, product4);
        String mostNumerous = String.format("The most numerous product is %s.", numerous.getName());
        System.out.println(mostNumerous);
    }
}

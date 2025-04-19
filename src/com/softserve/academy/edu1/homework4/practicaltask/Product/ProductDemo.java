package homework4.practicaltask.Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Human", 1000, 1);
        Product p2 = new Product("Table", 2000, 4);
        Product p3 = new Product("TV", 3000, 4);
        Product p4 = new Product("XBOX", 4000, 4);
        Product mostExpensiveProduct = p1;
        if (p2.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = p2;
        }
        if (p3.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = p3;
        }
        if (p4.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = p4;
        }
        System.out.println("The most expensive item is " + mostExpensiveProduct.getName() + ". Quantity of:  " + mostExpensiveProduct.getQuantity());
        Product biggestQuantityProduct = p1;
        if (p2.getQuantity() > biggestQuantityProduct.getQuantity()) {
            biggestQuantityProduct = p2;
        }
        if (p3.getQuantity() > biggestQuantityProduct.getQuantity()) {
            biggestQuantityProduct = p3;
        }
        if (p4.getQuantity() > biggestQuantityProduct.getQuantity()) {
            biggestQuantityProduct = p4;
        }
        System.out.println("Products with the highest quantity " + "(" + biggestQuantityProduct.getQuantity() + ")" + " are: ");
        if (p1.getQuantity() == biggestQuantityProduct.getQuantity()) {
            System.out.println(p1.getName());
        }
        if (p2.getQuantity() == biggestQuantityProduct.getQuantity()) {
            System.out.println(p2.getName());
        }
        if (p3.getQuantity() == biggestQuantityProduct.getQuantity()) {
            System.out.println(p3.getName());
        }
        if (p4.getQuantity() == biggestQuantityProduct.getQuantity()) {
            System.out.println(p4.getName());
        }
    }
}

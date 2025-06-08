package softserve.academy.edu14.HW1;

//1. Create class Product with fields manufacture category, date of manufacture and price. Add all
//needed methods
//• Create list Product with 20 objects
//• Obtain a sorted by the price list of products belong to category Phone with
//price > 3000, and the date of manufacture was more then 1 year ago.


import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int limit = 20;
        List<Product> productList = IntStream
                .rangeClosed(1, limit)
                .mapToObj(o -> Product.newRandomProduct())
                .toList();

        System.out.println("List of products:");
        productList.forEach(System.out::println);

        int priceMinMargin = 3000;
        String filterCategory = "phone";
        int deltaYears = 1;
        LocalDate dateCompare = LocalDate.now().minusYears(deltaYears);

        List<Product> filteredList = productList.stream()
                .filter(product -> product.getPrice() > priceMinMargin)
                .filter(product -> filterCategory.equalsIgnoreCase(product.getCategory().toString()))
                .filter(product -> product.getDate().isBefore(dateCompare))
                .toList();

        System.out.println("===".repeat(20));
        System.out.printf("Searching for %s produced %s or earlier that cost %d USD or more\n", filterCategory, dateCompare, priceMinMargin);
        if (!filteredList.isEmpty()) {
            filteredList.forEach(System.out::println);
        } else {
            System.out.println("No products found");
        }
    }
}

package softserve.academy.edu14.HW1;

//1. Create class Product with fields manufacture category, date of manufacture and price. Add all
//needed methods
//• Create list Product with 20 objects
//• Obtain a sorted by the price list of products belong to category Phone with
//price > 3000, and the date of manufacture was more then 1 year ago.
//• Realize method

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Product {
    protected Category category;
    protected LocalDate date;
    protected int price;

    protected static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    protected static final Random RAND = new Random();

    public Product(String category, String date, int price) {
        this.category = categoryToEnum(category);
        this.date = stringToDate(date);
        this.price = price;
    }

    public static Category categoryToEnum(String category) {
        for (Category categoryInstance : Category.values()) {
            if (categoryInstance.name().equalsIgnoreCase(category)) {
                return categoryInstance;
            }
        }
        throw new IllegalArgumentException("Category not found! Choose from: " + Arrays.toString(Category.values()));
    }

    public static LocalDate stringToDate(String date) {
        if (isDateValid(date)) {
            return LocalDate.parse(date, FORMATTER);
        } else {
            System.err.println("Invalid date! Inserting current date.");
            return LocalDate.now();
        }
    }

    private static boolean isDateValid(String dateString) {
        LocalDate date;
        try {
            date = LocalDate.parse(dateString, FORMATTER);
        } catch (DateTimeParseException e) {
            return false;
        }
        return dateString.equals(date.format(FORMATTER));
    }

    public static Product newRandomProduct() {
        Category[] categories = Category.values();
        int maxCat = categories.length;
        String category = categories[RAND.nextInt(maxCat)].name();

        long minDay = LocalDate.of(2020, 1, 1).toEpochDay();
        long maxDay = LocalDate.now().toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        LocalDate date = LocalDate.ofEpochDay(randomDay);

        int minPrice = 2000;
        int maxPrice = 4000;
        int price = RAND.nextInt(minPrice, maxPrice);

        return new Product(category, date.toString(), price);
    }

    public Category getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) %d USD", category.toString().toLowerCase(), date, price);
    }
}

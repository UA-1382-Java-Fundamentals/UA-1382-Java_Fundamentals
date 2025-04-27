package Task04;

public class Product {

    private String name;
    private double price;
    private int quanity;

    public Product(String name, double price, int quanity) {
        this.name = name;
        this.price = price;
        this.quanity = quanity;
    }

    public Product(){}

    public double getPrice() {
        return price;
    }

    public int getQuanity() {
        return quanity;
    }

    @Override
    public String toString() {
        return "" + name ;
    }

    public Product mostExpensive(Product prod1, Product prod2, Product prod3, Product prod4) {
       double exp1 = prod1.getPrice();
       double exp2 = prod2.getPrice();
       double exp3 = prod3.getPrice();
       double exp4 = prod4.getPrice();
       if(exp1>exp2 && exp1>exp3 && exp1>exp4){
           return prod1;
       }
       if(exp2>exp1 && exp2>exp3 && exp2>exp4){
            return prod2;
       }
       if(exp3>exp1 && exp3>exp2 && exp3>exp4){
            return prod3;
       }
        if(exp4>exp1 && exp4>exp2 && exp4>exp3){
            return prod4;
        }
        else {return null;}
    }

    public Product moreQuanity(Product prod1, Product prod2, Product prod3, Product prod4){

        int qua1 = prod1.getQuanity();
        int qua2 = prod2.getQuanity();
        int qua3 = prod3.getQuanity();
        int qua4 = prod4.getQuanity();

        if(qua1>qua2 && qua1>qua3 && qua1>qua4){
            return prod1;
        }
        if(qua2>qua1 && qua2>qua3 && qua2>qua4){
            return prod2;
        }
        if(qua3>qua1 && qua3>qua2 && qua3>qua4){
            return prod3;
        }
        if(qua4>qua1 && qua4>qua2 && qua4>qua3){
            return prod4;
        }
        else {return null;}

    }

    public Product moreQuanity(Product prod1, Product prod2){

        int qua1 = prod1.getQuanity();
        int qua2 = prod2.getQuanity();

        if(qua1>qua2){
            return prod1;
        }
        if(qua2>qua1){
            return prod2;
        }
        else {return null;}

    }

    public Product moreQuanity2(Product prod1, Product prod2,Product prod3, Product prod4){

        Product resultQua1 = moreQuanity(prod1,prod2);
        Product resultQua2 = moreQuanity(prod3,prod4);
        Product resultQua3 = moreQuanity(resultQua1,resultQua2);
    return resultQua3;

    }


        public static void main(String[] args){

        Product result = new Product();

        Product produkt1 = new Product( "milk", 4.55, 50 );
        Product produkt2 = new Product( "kefir", 5.30, 70 );
        Product produkt3 = new Product( "beer", 3.20, 80 );
        Product produkt4 = new Product( "water", 2.15, 45);

        Product resultExp = result.mostExpensive(produkt1,produkt2,produkt3,produkt4);
        Product resultQua = result.moreQuanity2(produkt1,produkt2,produkt3,produkt4);

        System.out.println("The most expensive item is : " + resultExp + " . It is " + resultExp.getPrice());
            System.out.println("The more quanity of produkt is : " + resultQua + " . Its quality is : " + resultQua.getQuanity());

    }
}

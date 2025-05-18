package softserve.academy.edu12.HW2;

//2. Іnput a sentence that contains words separated by more than one space on the console. The
//goal is to replace all consecutive spaces with a single space. For instance, if you entered the
//sentence "I   am    learning    Java   Fundamental", the expected result should be "I am learning
//Java Fundamental".

public class Main {
    public static void main(String[] args) {
        System.out.println("Initial string:");
        String str = "At   vero   eos   et      accusamus";
        System.out.println(str);
        System.out.println("===".repeat(15));

        System.out.println("String after condensing spaces to single space:");
        String newStr = str.replaceAll("\\s+"," ");
        System.out.println(newStr);
    }
}

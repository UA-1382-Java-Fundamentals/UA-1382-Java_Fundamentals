package softserve.academy.edu12.taskPractical1;

//Input two String variables. Verify if the first variable is a substring of the second variable. For
//instance, if you entered "SoftServe" and "SoftServe Academy", the expected result should be
//true

public class Main {
    public static void main(String[] args) {
        String str1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String str2 = "adipiscing elit";

        int index = str1.indexOf(str2);
        if (index >= 0) {
            System.out.println(str1.startsWith(str2, index));
        } else {
            System.out.println("Substring not found");
        }
    }
}

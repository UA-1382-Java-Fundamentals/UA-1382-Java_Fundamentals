package softserve.academy.edu12.taskPractical3;

//3. The task requires validation of usernames using regular expressions.
// The username should be
//between 3 to 15 characters and
// can contain only Latin alphabet,
// numbers, and
// underscores. To
//accomplish this, input five different usernames in the main method and output a message to the
//console indicating whether each of the entered names is valid or not.

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>(List.of(
                "!N00b5Layer!",
                "Joe33",
                "___HARDSH0t___",
                "ІванКолесник",
                "SuperCoolAngelicDemonOfRevenge",
                "s5",
                "__RED__",
                "fireStart-ER"
        ));
        Pattern pattern = Pattern.compile("^\\w{3,15}$");

        for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.printf("%30s is approved\n", username);
            } else {
                System.out.printf("%30s is rejected\n", username);
            }
        }
    }
}

package Task13.Homework01;

import java.util.stream.Collectors;

public class Encrypt_Deskrypt {

    public Encrypt_Deskrypt() {
    }

    public static String encryptString(String string) {
        StringBuilder result = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                char check = Character.isLowerCase(c) ? 'a' : 'A';
                char shift = (char) ((c - check + 3) % 26 + check);
                result.append(shift);
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decryptString(String s) {
        return s.chars()
                .mapToObj(c -> {
                    if (Character.isLetter(c)) {
                        char base = Character.isLowerCase(c) ? 'a' : 'A';
                        return String.valueOf((char) ((c - base - 3 + 26) % 26 + base));
                    } else {
                        return String.valueOf((char) c);
                    }
                })
                .collect(Collectors.joining());
    }
}





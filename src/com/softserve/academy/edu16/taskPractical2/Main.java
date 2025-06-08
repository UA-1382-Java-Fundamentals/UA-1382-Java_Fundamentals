package softserve.academy.edu16.taskPractical2;

//2. Prepare a file with text:
//1) find and output to the console all words starting with a vowel.
//2) find and output to the console all words for which the last letter of one word
//matches the first letter of the next word.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/com/softserve/academy/edu16/taskPractical2/lipsum.txt";

        System.out.println("---".repeat(30));
        System.out.println("Read data from file: " + fileName);
        System.out.println("---".repeat(30));

        Path path = Path.of(fileName);
        String[] lines = Files.readAllLines(path).toArray(String[]::new);
        Pattern splitPattern = Pattern.compile("[^a-zA-z`-]+");
        String vowels = "aeiyouAEIYOU";

        List<String> wordsWithVowels = Arrays.stream(lines)
                .filter(line -> !line.isBlank())
                .flatMap(splitPattern::splitAsStream)
                .filter(word -> vowels.indexOf(word.charAt(0)) > -1)
                .toList();

        Iterator<String> wordIter = Arrays.stream(lines)
                .filter(line -> !line.isBlank())
                .flatMap(splitPattern::splitAsStream)
                .iterator();

        String wordPrevious = wordIter.next();
        List<String> wordPairs = new ArrayList<>();
        while (wordIter.hasNext()) {
            String wordCurrent = wordIter.next();
            if (wordCurrent.charAt(0) == wordPrevious.charAt(wordPrevious.length() - 1)) {
                wordPairs.add(wordPrevious + " <-> " + wordCurrent);
            }
            wordPrevious = wordCurrent;
        }

        System.out.printf("There are %d words that start with vowel\n", wordsWithVowels.size());
        wordsWithVowels.forEach(System.out::println);
        System.out.println("---".repeat(30));

        System.out.printf("There are %d pairs of words that have same ending and starting letter:\n", wordPairs.size());
        wordPairs.forEach(System.out::println);
        System.out.println("---".repeat(30));
    }
}

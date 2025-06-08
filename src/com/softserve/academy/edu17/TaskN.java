package softserve.academy.edu17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class TaskN {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                1. Input number and generate Fibonacci sequence
                2. Decompose a number into a product of prime numbers
                3. Input exchange rate and available UAH to get the new currency balance
                4. Count the number of vowels
                5. Check if this string is palindrome
                6. Calculate number of words in text
                7. Calculate n! (factorial)
                8. Convert number to words
                9. Try n times and discover how many times you can get over a margin
                10. Find the number of steps for which you get 1, using the following process:
                    input n > 1. If it is even, we divide it by 2, if it is odd, then multiply by 3 and add 1
                11. Check bank card number using Luhn algorithm
                12. Calculate the sum of all the multiples of 3 or 5 below input number
                13. Find LCM for numbers between 1 and n (preferably n = 20)
                14. We have coins of: 1, 2, 5, 10, 20, 50, 100 and 200.
                    Find quantity of ways to compose 200, using these coins;
                """);

        int userSelection = readInteger("Enter task #: ");
        String taskTitle = "";
        String result = "";
        switch (userSelection) {
            case 1: {
                int genSize = readInteger("Enter the Fibonacci row size: ");
                taskTitle = "Generate Fibonacci sequence";
                result = generateFibonacci(genSize).toString();
                break;
            }
            case 2: {
                int number = readInteger("Enter the number to decompose: ");
                taskTitle = "Decompose to primes";
                result = decomposeToPrimes(number);
                break;
            }
            case 3: {
                int sumUAH = readInteger("Enter the number of UAH to sell: ");
                double rateUSD = readDouble("Enter the rate of UAH to USD: ");
                taskTitle = "Currency exchange";
                result = changeUAHtoUSD(sumUAH, rateUSD);
                break;
            }
            case 4: {
                String text = readString("Enter the text for counting vowels: ");
                taskTitle = "Counting vowels";
                result = countVowels(text).toString();
                break;
            }
            case 5: {
                String text = readString("Enter the text to see if it is a palindrome: ");
                taskTitle = "Is a palindrome";
                result = isPalindrome(text)?"is palindrome":"is NOT a palindrome";
                break;
            }
            case 6: {
                String text = readString("Enter the text to count words in it: ");
                taskTitle = "Count words in text";
                result = countWords(text).toString();
                break;
            }
            case 7: {
                int factorial = readInteger("Enter the number to calculate factorial: ");
                taskTitle = "Get factorial";
                result = Integer.toString(calculateFactorial(factorial));
                break;
            }
            case 8: {
                int number = readInteger("Enter the number to convert to words: ");
                taskTitle = "Numbers to words";
                result = numberToWords(number);
                break;
            }
            case 9: {
                int attempts = readInteger("Enter number of attempts: ");
                double margin = readDouble("Enter margin: ");
                taskTitle = "Count random values above the margin";
                result = countRandomValuesAboveMargin(attempts, margin).toString();
                break;
            }
            case 10: {
                taskTitle = "Steps till n becomes 1";
                int steps = readInteger("Enter number to process: ");
                result = Integer.toString(findStepsTillReduced(steps)) ;
                break;
            }
            case 11: {
                taskTitle = "Card number validator";
                String cardNumber = readString("Enter the text to count words in it: ");
                result = isCardNumberValid(cardNumber)?"is a valid card number":"is INVALID card number";
                break;
            }
            case 12: {
                taskTitle = "Sum of multiples of 3 and 5 below n";
                int ceil = readInteger("Enter number ceiling argument: ");
                result = Integer.toString(getSumOfMultiples3and5BelowArg(ceil));
                break;
            }
            case 13: {
                taskTitle = "LCM";
                int ceil = readInteger("Enter the top number of least common multiple's factors: ");
                result = Integer.toString(getLCMForNumbersUpToN(ceil));
                break;
            }
            case 14: {
                taskTitle = "Get ways to combine coins";
                List<Integer> coins = new ArrayList<>(List.of(1, 2, 5, 10, 20, 50, 100, 200));
                int targetSum = readInteger("Enter the sum to get: ");
                result = Integer.toString(calculateWaysToAchieveSum(targetSum, coins));
                break;
            }
        }

        String outFilePath = "src/com/softserve/academy/edu17/TaskResult.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFilePath))) {
            bw.write(taskTitle + "\n");
            bw.write(result);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static int calculateWaysToAchieveSum(int targetSum, List<Integer> coins) {
        int[] ways = new int[targetSum + 1];
        // Here we exclude zero case
        ways[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= targetSum; i++) {
                ways[i] += ways[i - coin];
            }
        }
        return ways[targetSum];
    }

    private static int getLCMForNumbersUpToN(int n) {
        // generate a list of numbers
        List<Integer> numbers = IntStream.rangeClosed(2, n)
                .boxed()
                .toList();

        // generate a map of prime factors for each number
        Map<Integer, Map<Integer, Integer>> primeFactorsByNumber = new HashMap<>();
        for (Integer i : numbers) {
            primeFactorsByNumber.put(i, getPrimeFactors(i));
        }

        // get unique prime factors
        // get maximum powers for each unique factor
        Set<Integer> primeFactorsGeneralSet = new HashSet<>();
        Map<Integer, Integer> primeFactorsMaxPower = new HashMap<>();
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : primeFactorsByNumber.entrySet()) {
            for (Map.Entry<Integer, Integer> primeFactor : entry.getValue().entrySet()) {
                int currentKey = primeFactor.getKey();
                int currentValue = primeFactor.getValue();

                if (primeFactorsMaxPower.containsKey(currentKey)) {
                    primeFactorsMaxPower.replace(
                            currentKey,
                            Integer.max(
                                    primeFactorsMaxPower.get(currentKey),
                                    currentValue));
                } else {
                    primeFactorsMaxPower.put(currentKey, currentValue);
                }
                primeFactorsGeneralSet.add(primeFactor.getKey());
            }
        }
        // return product of each unique prime factor in max power
        int lcm = 1;
        for (Integer primeFactor : primeFactorsGeneralSet) {
            lcm *= (int) Math.pow(primeFactor,
                    primeFactorsMaxPower.get(primeFactor)
            );
        }
        return lcm;
    }

    private static Map<Integer, Integer> getPrimeFactors(int number) {
        Map<Integer, Integer> primeFactorsMap = new HashMap<>();
        for (int factor = 2; factor <= number; factor++) {
            while (number % factor == 0) {
                Integer power = primeFactorsMap.get(factor);
                if (power == null) {
                    power = 0;
                }
                primeFactorsMap.put(factor, power + 1);
                number /= factor;
            }
        }
        return primeFactorsMap;
    }

    private static Integer getSumOfMultiples3and5BelowArg(int n) {
        return IntStream
                .rangeClosed(1, n - 1)
                .boxed()
                .filter(i -> (i % 3) == 0 || (i % 5) == 0)
                .reduce(0, Integer::sum);
    }

    private static boolean isCardNumberValid(String cardNumber) {
        Pattern digits = Pattern.compile("^[0-9]+$");
        if (!digits.matcher(cardNumber).matches()) {
            throw new NumberFormatException("Card number is invalid");
        }
        List<String> numbersString = new ArrayList<>(Arrays.asList(cardNumber.split("")));
        String checkDigitAvailable = numbersString.getLast();
        numbersString.removeLast();
        List<Integer> numbersIntReversed = numbersString.reversed().stream()
                .map(Integer::parseInt).toList();
        List<Integer> numbersIntDoubled = new ArrayList<>();
        for (int i = 0; i < numbersIntReversed.size(); i++) {
            if (i % 2 != 1) {
                if ((numbersIntReversed.get(i) * 2) > 9) {
                    numbersIntDoubled.add((numbersIntReversed.get(i) * 2) - 9);
                } else {
                    numbersIntDoubled.add(numbersIntReversed.get(i) * 2);
                }
            } else {
                numbersIntDoubled.add(numbersIntReversed.get(i));
            }
        }
        Integer sumDigits = numbersIntDoubled.stream()
                .reduce(0, Integer::sum);
        int checkDigitCalculated = (10 - (sumDigits % 10)) % 10;
        return (checkDigitCalculated == Integer.parseInt(checkDigitAvailable));
    }

    private static int findStepsTillReduced(int n) {
        int stepCounter = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            stepCounter++;
        }
        return stepCounter;
    }

    private static Long countRandomValuesAboveMargin(int n, double margin) {
        return DoubleStream
                .generate(Math::random)
                .limit(n)
                .filter(i -> i > margin)
                .count();
    }

    private static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static Long countWords(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        return words.stream()
                .filter(word -> !word.isBlank())
                .count();
    }

    private static boolean isPalindrome(String text) {
        int halfLength = text.length() / 2;
        String left = text.substring(0, halfLength);
        StringBuilder right = new StringBuilder();
        for (int i = text.length() - 1; i > halfLength; i--) {
            right.append(text.charAt(i));
        }
        return left.equalsIgnoreCase(right.toString());
    }

    private static Long countVowels(String text) {
        String vowels = "aeiouyAEIOUY";
        List<String> chars = Arrays.asList(text.split(""));
        return chars.stream()
                .filter(vowels::contains)
                .count();
    }

    private static String changeUAHtoUSD(int sumUAH, double rateUSD) {

        double equivalentUSD = sumUAH / rateUSD;
        double cutoutUSD = equivalentUSD % 10;
        int sumUSD = (int) (equivalentUSD - cutoutUSD);
        double spentUAH = sumUSD * rateUSD;
        double changeUAH = cutoutUSD * rateUSD;

        return "UAH available:\t " + sumUAH + " UAH\n" +
                "UAH-USD rate:\t " + rateUSD + "\n" +
                "USD bought:\t\t " + sumUSD + " USD\n" +
                "UAH spent:\t\t " + spentUAH + " UAH\n" +
                "UAH change:\t\t " + changeUAH + " UAH\n";
    }

    private static String decomposeToPrimes(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n must be greater than 1");
        }
        List<Integer> factors = new ArrayList<>();
        int decomposable = n;
        while (decomposable != 1) {
            for (int i = 2; i <= decomposable; i++) {
                if (isPrime(i) && (decomposable % i) == 0) {
                    decomposable = decomposable / i;
                    factors.add(i);
                    break;
                }
            }
        }
        Map<Integer, Long> factorsMap = factors.stream()
                .collect(Collectors.groupingBy(f -> f, Collectors.counting()));
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, Long> entry : factorsMap.entrySet()) {
            String power = entry.getValue() == 1 ? "" : ("^" + entry.getValue());
            result.append(" * ").append(entry.getKey()).append(power);
        }
        return n + " = " + result.substring(3);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < (n / 2); i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> generateFibonacci(int limit) {
        List<Integer> sequence = new ArrayList<>(List.of(0, 1));
        int n;
        for (int i = 0; i < limit; i++) {
            n = sequence.getLast() + sequence.get(sequence.size() - 2);
            sequence.add(n);
        }
        sequence.removeFirst();
        return sequence;
    }

    private static String readUserInput(String message) {
        System.out.print(message);
        String out = SCANNER.nextLine();
        if (out.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty!");
        }
        return out;
    }

    private static Double readDouble(String prompt) {
        while (true) {
            try {
                String stringNumber = readUserInput(prompt);
                return parseDouble(stringNumber);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Integer readInteger(String prompt) {
        while (true) {
            try {
                String stringNumber = readUserInput(prompt);
                return parseInt(stringNumber);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String readString(String prompt) {
        while (true) {
            try {
                return readUserInput(prompt);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Double parseDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input! Enter a double!");
        }
    }

    private static Integer parseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input! Enter an integer!");
        }
    }

    final static String[] BELOW_20 = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
    };

    final static String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty",
            "seventy", "eighty", "ninety"
    };

    final static String[] THOUSANDS = {
            "", "thousand", "million"
    };

    private static String numberToWords(int num) {
        if (num < 1 || num > 1_000_000) {
            throw new IllegalArgumentException("Invalid number! Try number between 1 and 1_000_000!");
        }
        int i = 0;
        StringBuilder words = new StringBuilder();

        while (num > 0) {
            if (num % 1000 != 0) {
                words.insert(0, numberToWordsHelper(num % 1000) + THOUSANDS[i] + " ");
            }
            num /= 1000;
            i++;
        }

        return words.toString().trim();
    }

    private static String numberToWordsHelper(int num) {
        if (num == 0)
            return "";
        else if (num < 20)
            return BELOW_20[num] + " ";
        else if (num < 100)
            return TENS[num / 10] + " " + numberToWordsHelper(num % 10);
        else
            return BELOW_20[num / 100] + " hundred " + numberToWordsHelper(num % 100);
    }

}
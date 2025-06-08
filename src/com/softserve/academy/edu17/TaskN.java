package softserve.academy.edu17;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class TaskN {
    public static void main(String[] args) {
        int userSelection = 1;

        switch (userSelection) {
            case 1: {
                System.out.println(generateFibonacci(10));
                break;
            }
            case 2: {
                System.out.println(decomposeToPrimes(11112));
                break;
            }
            case 3: {
                printUAHtoUSD(30_000, 41.4717);
                break;
            }
            case 4: {
                System.out.println(countVowels("If we list all"));
                break;
            }
            case 5: {
                System.out.println(isPalindrome("repaper"));
                break;
            }
            case 6: {
                System.out.println(countWords("Input text and   calculate number of words in this  text"));
                break;
            }
            case 7: {
                System.out.println(calculateFactorial(5));
                break;
            }
            case 8: {
                //8.	Input number in range from 1 to 1 000 000 and output this number in English
                break;
            }
            case 9: {
                System.out.println(countRandomValuesAboveMargin(10_000, 0.999));
                break;
            }
            case 10: {
                System.out.println(findStepsTillReduced(9));
                break;
            }
            case 11: {
                System.out.println(isCardNumberValid("17893729974"));
                break;
            }
            case 12: {
                System.out.println(getSumOfMultiples3and5BelowArg(1000));
                break;
            }
            case 13: {
                System.out.println(getLCMForNumbersUpToN(20));
                break;
            }
            case 14: {
                List<Integer> coins = new ArrayList<>(List.of(1,2,5,10,20,50,100,200));
                int targetSum = 200;
                System.out.println(calculateWaysToAchieveSum(targetSum, coins));
                break;
            }
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

    private static void printUAHtoUSD(int sumUAH, double rateUSD) {

        double equivalentUSD = sumUAH / rateUSD;
        double cutoutUSD = equivalentUSD % 10;
        int sumUSD = (int) (equivalentUSD - cutoutUSD);
        double spentUAH = sumUSD * rateUSD;
        double changeUAH = cutoutUSD * rateUSD;

        System.out.printf("UAH available:\t %d UAH\n" +
                        "UAH-USD rate:\t %.4f\n" +
                        "USD bought:\t\t %d USD\n" +
                        "UAH spent:\t\t %.2f UAH\n" +
                        "UAH change:\t\t %.2f UAH\n",
                sumUAH,
                rateUSD,
                sumUSD,
                spentUAH,
                changeUAH);
    }

    private static String decomposeToPrimes(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n must be greater than 1");
        }
        List<Integer> factors = new ArrayList<>();
        int decomp = n;
        while (decomp != 1) {
            for (int i = 2; i <= decomp; i++) {
                if (isPrime(i) && (decomp % i) == 0) {
                    decomp = decomp / i;
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
        int n = 0;
        for (int i = 0; i < limit; i++) {
            n = sequence.getLast() + sequence.get(sequence.size() - 2);
            sequence.add(n);
        }
        sequence.removeFirst();
        return sequence;
    }
}

//1.+	Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)
//2.+	Input number and decompose this number into a product of prime numbers with their degrees (e.g. number: 84, result 2^2, 3, 7)
//3.+	Input cost of dollar and sum of money in gryvna. Calculate how many dollars user can buy and change.
//4.+	Input string and calculate number of loud letters (e.g. word: “My test text”, result: 3)
//5.+	Input string and check if this string is palindrome (e.g. “ABCCBA”)
//6.+	Input text and calculate number of words in this text
//7.+	Input number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)

//9.+	Write method to return random value 0 or 1. Input number n, call this method n times and calculate how many times
// were number one
//10.+	Find the number of steps for which you get 1, using the following process: we take any
//the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then
//multiply by 3 and add 1
//11.+	Enter the credit card number from the manufacturer (Visa, MasterCard, American Express, Discover) and check for
// the correct number (see how credit cards use the checksum)
//12.+	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
//13.	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
//14.	In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
// 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
// It is possible to make £2 in the following way: 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p.
// How many different ways can £2 be made using any number of coins?
package palindrome.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromeCounter {
    private static final String SPACE_SPLITTER = " ";

    public static Integer findMaxPalindromeLength(String line) {
        String[] words = line.split(SPACE_SPLITTER);

        //Solution 1: to store in the Map in case we need Words itself to be sure correct values are stored
        Map<Integer, String> palindromesMap = Arrays.stream(words)
                .filter(PalindromeCounter::isPalindrome)
                .collect(Collectors.toMap(String::length, Function.identity()));

        //Solution 2: keep it in List
        List<Integer> palindromeLengths = Arrays.stream(words)
                .filter(PalindromeCounter::isPalindrome)
                .map(String::length)
                .collect(Collectors.toList());

//        Solution 1:
//        return palindromesMap.keySet().stream().max(Integer::compareTo).orElse(0);

//        Solution 2:
        return palindromeLengths.stream().max(Integer::compareTo).orElse(0);
    }

    private static boolean isPalindrome(String word) {
        if (word.length() == 1) {
            return true;
        }

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

package se.soprasteria.codility;

/**
 * Created by Fredrik on 17-03-03.
 */
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class DigitlessPassword {
    public int solution(String s) {
        String[] substrings = s.split("\\d");
        String regexp = "\\p{Alpha}*[A-Z]+\\p{Alpha}*";

        if (substrings.length == 0 && s.matches(regexp)) {
            substrings = new String[]{s};
        }

        int maxLen = -1;

        for (String sub : substrings) {

            if (sub.matches(regexp)) {
                maxLen = Math.max(maxLen, sub.length());
            }
        }

        return maxLen;
    }
}
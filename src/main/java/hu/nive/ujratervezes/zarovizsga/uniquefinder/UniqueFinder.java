package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> uniqueChars(String string) {
        validateString(string);
        char[] charArray = string.toCharArray();
        List<Character> result = new ArrayList<>();
        for (char actual : charArray) {
            if (!result.contains(actual)) {
                result.add(actual);
            }
        }
        return result;
    }

    private void validateString(String string) {
        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        }
    }
}

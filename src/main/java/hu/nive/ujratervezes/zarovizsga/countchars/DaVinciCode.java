package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DaVinciCode {

    private static final List<Character> VALID_CHARACTERS = List.of('1', '0', 'x');

    public int encode(String input, char character) {
        validateCharacter(character);
        try (BufferedReader reader = Files.newBufferedReader(Path.of(input))) {
            return countCharacters(character, reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file: " + input + "!", ioe);
        }
    }

    private int countCharacters(char character, BufferedReader reader) throws IOException {
        String line;
        int counter = 0;
        while ((line = reader.readLine()) != null) {
            counter += countCharacterInsideLine(character, line);
        }
        return counter;
    }

    private int countCharacterInsideLine(char character, String line) {
        int counter = 0;
        char[] row = line.toCharArray();
        for (char actual : row) {
            if (actual == character) {
                counter++;
            }
        }
        return counter;
    }

    private void validateCharacter(char character) {
        if (!VALID_CHARACTERS.contains(character)) {
            throw new IllegalArgumentException("Not a valid character: '" + character + "'!");
        }
    }
}

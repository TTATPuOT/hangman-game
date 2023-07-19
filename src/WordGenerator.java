import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordGenerator {
    private final List<String> words = new ArrayList<>();

    public WordGenerator() throws FileNotFoundException {
        loadAllWords();
    }

    private void loadAllWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("./words.txt"));
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            if (word.length() > 4) {
                words.add(word);
            }
        }
        scanner.close();
    }

    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size())).toUpperCase();
    }
}

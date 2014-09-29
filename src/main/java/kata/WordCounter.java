package kata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Objects.requireNonNull;

public class WordCounter {

    private final String sentence;

    public WordCounter(String sentence) {
        this.sentence = requireNonNull(sentence);
    }

    public Map<String, Integer> count() {
        List<String> words = Arrays.asList(sentence.split(" "));

        return Collections.emptyMap();
    }
}

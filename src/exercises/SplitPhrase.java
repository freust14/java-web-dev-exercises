package exercises;

import java.util.Arrays;

public class SplitPhrase {
    private String seussPhrase = "I would not, could not, in a box. I would not, " +
            "could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
    private String[] wordsArray = new String[50];

    public static void main(String[] args) {
        SplitPhrase splitPhrase = new SplitPhrase();
        splitPhrase.splitWords(splitPhrase.seussPhrase);

    }
    public void splitWords(String phrase) {
       this.wordsArray = phrase.split(" ");
       System.out.println(Arrays.toString(this.wordsArray));

    }
}

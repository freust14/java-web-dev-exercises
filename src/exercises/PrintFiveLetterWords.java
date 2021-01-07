package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class PrintFiveLetterWords {

    public static void main(String[] args) {
        String seussPhrase = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrayOfWords = seussPhrase.split(" ");
        List<String> wordsList = new ArrayList<String>();
        wordsList = asList(arrayOfWords);
        //        wordsList.add("yes");
//        wordsList.add("Frank");
//
        PrintFiveLetterWords output = new PrintFiveLetterWords();
        output.printWords(wordsList);

    }

    public void printWords(List<String> listOfWords) {
        for (int i = 0; i < listOfWords.size(); i++) {
            if (listOfWords.get(i).length() == 5) {
                System.out.println(listOfWords.get(i));
            }
        }
    }
}

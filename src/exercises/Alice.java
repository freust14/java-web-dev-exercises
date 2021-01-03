package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main (String[] args) {
        String updatedAliceText = "";
        String aliceText = "Alice was beginning to get very tired of sitting by" +
                " her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but " +
                "it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to search for: ");
        String searchText = input.nextLine().toLowerCase();
        input.close();
        System.out.println("Your search term was found: " + aliceText.toLowerCase().contains(searchText));
        if (aliceText.toLowerCase().contains(searchText)) {
           System.out.println("The search term first appeared at index: " + aliceText.toLowerCase().indexOf(searchText));
           System.out.println("The length of the string is: " + searchText.length());
           updatedAliceText = aliceText.substring(0,aliceText.toLowerCase().indexOf(searchText)) +
                   aliceText.substring(aliceText.toLowerCase().indexOf(searchText)+searchText.length());
//           String[] aliceTextArray = aliceText.split(searchText);
//           for (int i=0; i< aliceTextArray.length; i++) {
//               updatedAliceText = updatedAliceText + aliceTextArray[i];
//           }
           System.out.println((updatedAliceText));
        }

    }
}

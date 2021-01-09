package exercises;

import java.util.*;

public class CountingCharacters {

    public static void main (String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string so I can count the characters: ");
//        String sampleString = input.nextLine();
//        input.close();

        String sampleString = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has to be zero to start " +
                "with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation" +
                " to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> charactersCounted = new HashMap<Character, Integer>();

        char[] charactersInString = sampleString.toLowerCase().toCharArray();
        for (char i : charactersInString) {
            if (charactersCounted.containsKey(i)) {
                charactersCounted.put(i, charactersCounted.get(i) + 1);
            } else {
                charactersCounted.put(i, 1);
            }

        }
        for (Map.Entry<Character, Integer> character : charactersCounted.entrySet()) {
            if (Character.isLetter(character.getKey())){
                System.out.println(character.getKey() + ":" + character.getValue());
            }
        }
    }
}

package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbersInArray {

    public static void main(String[] args) {
        ArrayList<Integer> bunchOfNumbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

//        bunchOfNumbers.add(1);
//        bunchOfNumbers.add(2);
//        bunchOfNumbers.add(3);
//        bunchOfNumbers.add(4);
//        bunchOfNumbers.add(5);
//        bunchOfNumbers.add(6);
        System.out.println(EvenNumbersInArray.sumEvenNumbers(bunchOfNumbers));

    }

    public static int sumEvenNumbers(ArrayList<Integer> numbersList) {
        int evenSum = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0) {
                evenSum = evenSum + numbersList.get(i);
            }
        }
        return evenSum;
    }
}

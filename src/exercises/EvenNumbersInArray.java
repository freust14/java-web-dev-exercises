package exercises;

import java.util.ArrayList;

public class EvenNumbersInArray {

    public static void main(String[] args) {
        ArrayList<Integer> bunchOfNumbers = new ArrayList<Integer>();

        bunchOfNumbers.add(1);
        bunchOfNumbers.add(2);
        bunchOfNumbers.add(3);
        bunchOfNumbers.add(4);
        bunchOfNumbers.add(5);
        bunchOfNumbers.add(6);
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

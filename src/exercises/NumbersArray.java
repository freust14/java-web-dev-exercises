package exercises;

public class NumbersArray {

    private int[] numbersArray = {1, 1, 2, 3, 5, 8};

    public static void main(String[] args) {
        NumbersArray newArray = new NumbersArray();
        newArray.printArray();
    }

    public void printArray() {
        for (int num : numbersArray) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

    }
}

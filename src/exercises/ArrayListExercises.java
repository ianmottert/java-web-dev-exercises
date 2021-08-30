package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises {
    public static int sumEven (ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void fiveLetterWords (ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        for (String word : arr) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(1);
        numArray.add(2);
        numArray.add(5);
        numArray.add(6);
        numArray.add(8);
        numArray.add(3);
        numArray.add(7);
        numArray.add(2);
        numArray.add(10);
        numArray.add(11);

        System.out.println(sumEven(numArray));

        ArrayList<String> wordArray = new ArrayList<>();
        wordArray.add("yes");
        wordArray.add("buzzy");
        wordArray.add("launchcode");
        wordArray.add("arraylist");
        wordArray.add("fives");
        wordArray.add("nevermore");
        wordArray.add("After");

        fiveLetterWords(wordArray);
    }
}

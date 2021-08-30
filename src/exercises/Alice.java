package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String str = "Alice was beginning to get very tired of sitting by her" +
                " sister on the bank, and of having nothing to do: once or twice she" +
                " had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";
        System.out.println(str);
        str = str.toUpperCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Input term you wish to search for: ");
        String term = input.nextLine().toUpperCase();
        boolean validation = str.contains(term);
        System.out.println(validation);
        Integer index = str.indexOf(term);
        Integer length = term.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String newStr = str.replace(term, "");
        System.out.println(newStr);
    }
}

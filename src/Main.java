import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word = askForWord();
        boolean isPalindrom = isAPalindrom(word);
        showIsPalindrom(isPalindrom);
    }

    private static void showIsPalindrom(boolean isPalindrom) {
        if (isPalindrom) {
            System.out.println("The word is palindrom");
        } else {
            System.out.println("The word isn't palindrom");
        }
    }

    private static boolean isAPalindrom(String word) {

        String revertedWord = createRevertedWord(word);
        return word.equalsIgnoreCase(revertedWord);
    }


    private static String createRevertedWord(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }

    private static String askForWord() {
        System.out.println("Write a word");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}

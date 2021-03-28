import java.util.Scanner;

public class WordSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write word: ");
        String word1 = scanner.nextLine();
        char[] a = word1.toCharArray();
        for (int i =0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Write another word: ");
        String word2 = scanner.nextLine();
        for (int i = 0; i < word2.length(); i++) {
            System.out.println(word2.charAt(i));
        }
        
        //For me better is second form

    }
}
package bronze.Lv3;

import java.util.Scanner;

public class P10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();

        if (word.equals(reversedWord.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

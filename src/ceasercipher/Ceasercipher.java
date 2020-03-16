
package ceasercipher;

import java.util.Scanner;


public class Ceasercipher {

    public static int key;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String plainText = s.nextLine();
        // System.err.print("Encrypted Text: ");
        int length = plainText.length();
        for (int j = 0; j <= 25; j++) {
            key = j;

            System.out.println("\n" + key);
            for (int i = 0; i < length; i++) {

                char ch = plainText.charAt(i);//integer value of each character bec each int value represents a value from the ascii table
                char c = (char) (ch + key % 26);
                System.out.print(c);
            }
        }
        // System.err.print("\n"+"Decrypted Text: ");

        for (int n = 0; n <= 25; n++) {
            key = n;
            System.out.println("\n" + key);
            for (int i = 0; i < length; i++) {

                char ch = plainText.charAt(i);//integer value of each character bec each int value represents a value from the ascii table

                char c = (char) (ch + key % 26 - key);
                System.out.print(c);
            }

        }
    }
}

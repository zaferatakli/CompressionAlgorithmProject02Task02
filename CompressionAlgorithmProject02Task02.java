package task2;

import java.util.Scanner;

public class CompressionAlgorithmProject02Task02 {
    public static void main(String[] args) {
        /* Compression Algorithm Project */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = input.nextLine().trim().replace(" ", "") + " ";

        String zipSentence = "";
        int count = 1;
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == sentence.charAt(i - 1)) {
                count++;
            } else {
                zipSentence = zipSentence + count + sentence.charAt(i - 1);
                count = 1;
            }
        }

        System.out.println("Entry sentence: " + sentence);
        System.out.println("Zip sentence: " + zipSentence);

        input.close();
    }
}


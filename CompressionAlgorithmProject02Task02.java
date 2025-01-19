package task2;

import java.util.Scanner;

public class CompressionAlgorithmProject02Task02 {
    public static void main(String[] args) {
        /* Compression Algorithm Project */
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen sıkıstırılacak metnı bosluk kullanmadan giriniz:");
        String metin = input.nextLine().trim().replace(" ", "") + " ";

        String zipMetin = "";
        int sayac = 1;
        for (int i = 1; i < metin.length(); i++) {
            if (metin.charAt(i) == metin.charAt(i - 1)) {
                sayac++;
            } else {
                zipMetin = zipMetin + sayac + metin.charAt(i - 1);
                sayac = 1;
            }
        }

        System.out.println("Girilen metin: " + metin);
        System.out.println("Sıkıstırılmıs metın: " + zipMetin);

        input.close();
    }
}


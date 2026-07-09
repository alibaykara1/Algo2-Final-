package ButCalisma;
//20p  Klavyeden girilen rakam ve sayılar içinde asal olanları bulup asal.dat dosyasına yazan metodu oluştur . Asal sayı adedi 50 olunca
// program duracaktır

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class q2 {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        FileWriter yazici = new FileWriter("asal.dat");

        int sayac = 0;

        while (sayac != 50) {
            System.out.println("Sayi gir ");
            int sayi = inp.nextInt();

            if (sayi < 2) {
                continue;
            }

            boolean asalMi = true;
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                yazici.write(sayi + "\n");
                sayac++;
            }
        }

        yazici.close();
        inp.close();
    }
}
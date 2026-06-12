package file;

import java.io.*;

//Ali.txt dosyası içerisinde sayılar bulunmaktadır .Bu sayılar içerisinde tek olanları TEK.DAT cift olanları CİFT.DAT
//ve sıfır olanları da SIFIR.DAT dosyasına bulunduğu satır ile yazan programı yapınız .
public class A {
    public static void main(String[] args) {

        try {
            //Okunacak dosya
            BufferedReader okuyucu = new BufferedReader(new FileReader("Ali.txt"));

            //Yazılacak Dosyalar
            BufferedWriter tekYazici = new BufferedWriter(new FileWriter("TEK.DAT"));
            BufferedWriter ciftYazici = new BufferedWriter(new FileWriter("CIFT.DAT"));
            BufferedWriter sifirYazici = new BufferedWriter(new FileWriter("SIFIR.DAT"));

            String satir;
            int satirNo = 1; //Hangi satırda olduğumuzu tutacak sayaç

            //Dosyada Okunacak satır bitene kadar (null olana kadar ) döngü çalışır
            while ((satir = okuyucu.readLine()) != null) {
                //Okunan metni (String) matematiksel işlem yapabilmek için sayıya (int) çeviriyoruz
                int sayi = Integer.parseInt(satir.trim());

                //Dosyaya yazılacak format:"1. satır 5" gibi
                String yazilacakMetin = satirNo + ". satır " + sayi + "\n";

                //Sayının durumuna göre ilgili dosyaya yazma işlemi
                if (sayi == 0) {
                    sifirYazici.write(yazilacakMetin);
                } else if (sayi % 2 == 0) {
                    ciftYazici.write(yazilacakMetin);
                } else {
                    tekYazici.write(yazilacakMetin);
                }

                satirNo++;
            }
            // İŞİMİZ BİTİNCE DOSYALARI KAPATMAK ZORUNLUDUR! Kapatmazsan dosyaya yazmaz.
            okuyucu.close();
            tekYazici.close();
            ciftYazici.close();
            sifirYazici.close();
            System.out.println("Dosya ayrıştırma işlemi başarıyla tamamlandı!");

            //Olası hataları (Exception) yakaladığımız kısım
        }catch(Exception e){
            System.out.println("İşlem sırasında bir hata oluştu: " + e.getMessage());
        }


    }


}

package ButCalisma;
//otoparka giren araclardan 2 saat ve 2 saatten az kalan araclarin 20 tl 2 saatten fazla kalan araclarda her saat icin 25 tl Fazla aliniyor
//A ) arac classi olusturup giris cikis saati plakasi ve ucretinin oldugu class
//B) ucretin nasil hesaplandiginin metodu
//C) gün sonunda toplam ne kadar para kazanildigi metod

class Arac{
    String plaka;
    int girisSaati;
    int cikisSaati;
    double ucret;

    Arac(String plaka , int girisSaati){
        this.plaka = plaka ;
        this.girisSaati = girisSaati;
    }

    //B) ucret hesaplama
    public double ucretHesapla(int cikisSaati){
        this.cikisSaati = cikisSaati;
        int kalinanSaat = cikisSaati - girisSaati;

        if(kalinanSaat <= 2 ){
            ucret = 20;
        }else{
            ucret = 20 + (kalinanSaat - 2)*25;
        }
        return ucret;
    }
}

public class Otopark {
    //C) Gün sonu toplam kazaç
    public static double gunSonuToplam(Arac[] araclar) {
        double toplam = 0;
        for (Arac a : araclar) {
            toplam += a.ucret;
        }
        return toplam;
    }
}

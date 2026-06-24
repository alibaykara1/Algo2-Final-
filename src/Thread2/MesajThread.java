package Thread2;
//Çoklu Thread ve Farklı Sleep Süreleri
//Soru: tik yazılacak 1 sn bekleyecek , tak yazacak 2 sn bekleyecek .
// 3 defa yazılacak ikiside

//sınavda yazacağın ana Thread şablonu
public class MesajThread extends Thread{
    private String mesaj ;
    private int uyumaSuresi;

    //Constructor - Dışarıdan mesajı ve süreyi alıyoruz
    public MesajThread (String mesaj , int uyumaSuresi){
        this.mesaj = mesaj;
        this.uyumaSuresi = uyumaSuresi;
    }

    //Thread in yapacağı asıl iş
    public void run(){
        //Her thread kendi mesajını 3 kere yazdırsın
        for(int i=1 ; i<=3; i++){
            System.out.println(mesaj + " -> Adım " + i);

            //Hocanın beklediği o kritik kısım
            try{
                Thread.sleep(uyumaSuresi);//Constructor dan gelen süre kadar uyu
            }catch(InterruptedException e){
                //Sınavda buraya uzun uzun hata yazdırmana gerek yok boş bırakabilirsin
            }
        }
    }
}

//Ana program
class Main {
    public static void main (String [] arguments){
        // 1. thread : Hızlı işçi , Tık yazıp 1 sn (1000 ms ) uyuyacak
        MesajThread t1 = new MesajThread("Tık" , 1000);

        // 2. thread : Yavaş işçi , Tak yazıp 2 sn (2000 ms ) uyuyacak
        MesajThread t2 = new MesajThread("Tak" , 2000);

        //Threadleri başlatıyoruz aynı anda koşmaya başlıyorlar
        t1.start();
        t2.start();
    }
}

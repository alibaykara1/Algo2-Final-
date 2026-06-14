package Thread3;//25.06.2024 6. soru
//Ekrana 100ms boyunca adınızı 200ms boyunca soyadınızı yazan
//ve bu işlemi 4dk boyunca devam ettiren programı yapınız

//Thread şablonumuz (Hem ad hemde soyad için ortak kullanacağız)
public class YaziciThread extends Thread{
    private String yazi ;
    private int beklemeSuresi;

    //Dışarıdan yazılacak kelimeyi ve süreyi alıyoruz
    public YaziciThread(String yazi ,int beklemeSuresi ){
        this.yazi = yazi;
        this.beklemeSuresi = beklemeSuresi;
    }

    public void run(){
        //Başlangıç anını milisaniye olarak alıyoruz
        long suAnkiZaman = System.currentTimeMillis();

        //Bitiş zamanını belirliyoruz (4dk 240000 milisaniye)
        long bitisZamani = suAnkiZaman + 240000;

        //Zaman dolana kadar döngü çalışsın
        while (System.currentTimeMillis() < bitisZamani){
            System.out.println(yazi);

            try{
                Thread.sleep(beklemeSuresi);
            }catch(InterruptedException e){
                //Sınavda boş bırakabilirsin .
            }
        }
    }
}

class main {
    public static void main(String[] args) {
        // 1. Thread: Adı yazıp 100ms uyuyacak
        YaziciThread adThread = new YaziciThread("Ali", 100);

        // 2. Thread: Soyadı yazıp 200ms uyuyacak
        YaziciThread soyadThread = new YaziciThread("Baykara", 200);

        // İkisini de aynı anda başlatıyoruz
        adThread.start();
        soyadThread.start();
    }
}



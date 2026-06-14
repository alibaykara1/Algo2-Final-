package Thread;
//Ekrana 1'den 5'e kadar sayıları yazdıran bir Thread sınıfı yazın.
// Sayılar ekrana 1 saniye (1000 ms) gecikmeyle yazılsın

//1. Thread sınıfını oluşturuyoruz ve Thread den miras alıyoruz
public class SayiciThread extends Thread{

    //2. Thread in yapacağı işleri run() metodu içine yazıyoruz
    public void run(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("sayi: "+ i);

            //3. 1 saniye bekleme işlemi
            try{
                Thread.sleep(1000); //1000 milisaniye uyut
            } catch (InterruptedException e ){
                System.out.println("Thread kesintiye uğradı.");
            }
        }
    }
}


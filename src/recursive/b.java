package recursive;
//Bir sayısal dizideki en büyük sayıyı bulan rekürsif metod
public class b {

    public static int EnBuyukBul(int[] dizi , int index){
        //1. durma koşulu (base case )
        /*
        Eğer bir dizinin son elemanına geldiysek , artık karşılaştıracak
        bir şey kalmamıştır. Direkt o elemanın kendisini döndürürüz.
        */
        if(index == dizi.length - 1){
            return dizi[index];
        }

        //2. Özyineleme adımı (Recursive step)
        /*Geri kalan dizinin en büyük elemanını bulması için metodu çağırıyoruz
        * Metot gidip dizinin sonuna kadar inip en büyük değeri bize geri getirecek.
        */
        int geriKalaninEnBuyugu = EnBuyukBul(dizi , index +1);

        //3. Karşılaştırma
        //Şuan baktığımız eleman mı daha büyük yoksa geri kalanın en büyüğü mü
        if(dizi[index] > geriKalaninEnBuyugu) {
            return dizi[index];
        } else {
            return geriKalaninEnBuyugu;
        }
        /* Not: 3. adımı tek satırda Math.max fonksiyonu kullanarak daha şık da yazabilirsin:
        return Math.max(dizi[index], EnBuyukBul(dizi, index + 1));
        */
    }

    public static void main (String [] Args){
        int [] testDizisi = {3,15,7,22,9};
        int enBuyuk = EnBuyukBul(testDizisi , 0);
        System.out.println("Dizideki en büyük sayı : " + enBuyuk);
    }

}

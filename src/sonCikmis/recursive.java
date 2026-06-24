package sonCikmis;
// 5.soru - Rekürsif metod tanımı ve örnek
/*
 * Rekürsif metod, bir problemin çözümü için kendisini tekrar çağıran metoddur.
 *  Her rekürsif metodun mutlaka bir durma koşulu (base case) olması gerekir;
 *  aksi hâlde sonsuz döngüye girerek StackOverflowError hatası oluşur.
 */

public class recursive {
    public static void main(String[] args) {
        int sayi = 4 ;
        System.out.print(sayi +"! = " + factorial(sayi));
    }

    public static int factorial(int sayi ){
        //Durma kontrolü
        if(sayi<0){
            return -1;
        }

        if(sayi == 0 ){
            return 1;
        }

        return sayi * factorial(sayi - 1);
    }
}

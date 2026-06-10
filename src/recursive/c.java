package recursive;
//Bir stringin elemanlarını ters çevirip ekrana yazan rekursif metod
//Yöntem 1
public class c {

    public static void sondanBasaYazdir(String metin , int index ){

        if(index < 0){
            return;
        }

        System.out.print(metin.charAt(index));

        sondanBasaYazdir(metin , index-1);
    }

    public static void main (String [] Arguments) {
        String testMetni = "Algoritma";

        int sonIndeks = testMetni.length() -1;

        System.out.print("Yöntem 1 çıktısı: ");
        sondanBasaYazdir(testMetni , sonIndeks);

    }

}
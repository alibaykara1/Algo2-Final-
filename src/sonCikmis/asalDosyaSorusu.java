package sonCikmis;
//4.soru klavyeden girilen sayilar asal ise asal.dat dosyasina yazan
// 9999 girilince duran kod

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class asalDosyaSorusu {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        FileWriter yazici = new FileWriter("asal.dat");//Dosya döngüden önce açıldı

        int sayi;

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            sayi = inp.nextInt();

            if (sayi == 9999) { //Durma şartı
                break;
            }

            if(asalMi(sayi)){ //Asalsa dosyaya yaz
                yazici.write(sayi + "\n");
            }
        }

        yazici.close(); //Döngü bitince dosya kapatıldı
        inp.close();

    }

    public static boolean asalMi(int sayi) {
        if (sayi<2){
            return false;
        }
        for(int i=2 ; i<Math.sqrt(sayi) ; i++){
            if(sayi%i == 0 ){
                return false ;
            }
        }
        return true;
    }
}
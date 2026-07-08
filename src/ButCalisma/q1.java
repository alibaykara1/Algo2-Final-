package ButCalisma;
//4.soru klavyeden girilen sayilar asal ise asal.dat dosyasina yazan
// 9999 girilince duran kod

import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class q1 {
    public static void main (String[]args) throws IOException {
        Scanner inp = new Scanner (System.in);
        FileWriter yazici = new FileWriter("asal.dat"); //Dosya döngüden önce açıldı

        while (true){
            System.out.println("Bir sayı gir");
            int sayi = inp.nextInt();

            if(sayi == 9999){
                break;
            }

            if(asalMi(sayi)){
                yazici.write(sayi + "\n");
            }

            yazici.close();
            inp.close();


        }



    }

    public static boolean asalMi(int sayi){
        if(sayi < 2 ){
            return false;
        }

        for(int i=2 ; i<=Math.sqrt(sayi) ; i++){
            if(sayi%i == 0){
                return false;
            }
        }

        return true ;
    }
}
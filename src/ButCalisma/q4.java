package ButCalisma;
//Kendisine parametre olarak gelen sayının rakamları toplamını rekursif olarak bulan j.p.

public class q4 {
    public static void main (String [] Args){
        System.out.println(rakamtopla(345));
    }

    public static int rakamtopla (int sayi){
        if(sayi % 10 == 0 ){
            return sayi;
        }
        return sayi%10 + rakamtopla(sayi/10);
    }
}
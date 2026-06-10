package recursive;//Kendisine parametre olarak gelen bir dizideki 'A' ların sayısını bulup geri döndüren rekursif metod.

public class a {

    public int aHarfleriniSay(char[] dizi , int index){
        //1. durma koşulu : dizi bittiyse 0 döndür ve dur .
        if(index == dizi.length){
            return 0;
        }

        //2. Özyineleme adımı : Karakter 'A' ise
        if(dizi[index] == 'A'){
            return 1 + aHarfleriniSay(dizi , index + 1 );
        }
        //Karakter 'A' değilse
        else {
            return aHarfleriniSay(dizi , index + 1 );
        }



    }
}
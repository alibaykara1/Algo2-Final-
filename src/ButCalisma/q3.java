package ButCalisma;
//metod ve dosyalar lab
//public static int count(String str , char a) şeklindeki metod
//ile rekursif olrak gelen karakterin stringte kaç kez geçtiğini bulan java prgramı

public class q3 {
    public static void main(String[] args) {
        System.out.println(count("computer organization", 'o'));
    }

    public static int count(String str, char a) {
        if(str.length()<1) return 0;
        else if (str.charAt(str.length() - 1) == a)
            return 1+count(str.substring(0,str.length() - 1),a);
        else return count(str.substring(0,str.length()-1),a);
    }
}

package day10StringManipilations01;

import java.sql.SQLOutput;

public class StringManipilition01 {
    public static void main(String[] args) {

        String a = "Java kolaydir";

        //StarWith("Kola",5) kodu ilk 5 karakter' den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.


        boolean b = a.startsWith("kola", 5);
        System.out.println(b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" cevirir.
        //replace("a", "*"); kod Strindeki tüm "a" lari "*" e cevirir
       String c = a.replaceFirst("a", "*");
        System.out.println(c);//J*V* kolaydir.


        //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
       //"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
      //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
       String d = a.concat("Anladin mi?");
        System.out.println(d);//Java kolaydir. anladin mi?

        String e = "  Tom Hanks   ";
        System.out.println(e);// "   Tom Haks   "

        //trim() methodu bir String'in bas ve sonundaki "space" karakterlerine dokunulmaz.
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"


        String h = "Java";
        String i = "Java";

        //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        //Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.
        int k = h.compareTo(i);
        System.out.println(k);


        //a.repeat(5); kodu "a" String'ini yanyana 5 kere yapistirir.
        String n =  a.repeat(5);
        System.out.println(n);


    }
}

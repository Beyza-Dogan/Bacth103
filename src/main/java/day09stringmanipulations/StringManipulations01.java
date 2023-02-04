package day09stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara düşünme Ankara";

        //indexOf() method'u verilen character veya character'lerin "ilk görünümünün" index'ini verir.
        int idxA = str.indexOf("kara");
        System.out.println(idxA);//1

        //lastIndexOf() method'u verilen character veya character'lerin "son görünümün" index'ini verir.
        int lastIdxOf = str.lastIndexOf("kara");
        System.out.println(lastIdxOf);//9

        String s = "Mississippi";
        int idxI = s.indexOf("i");//indexOf() hem String hem de char ile kullanılabilir.
        System.out.println(idxI);//1
        int idxIss1 = s.indexOf("iss");//İlk görünümün ilk karakterinin index'ini verir.
        System.out.println(idxIss1);
        int idxIss2 = s.lastIndexOf("iss");//Son görünümün ilk karakterinin index'ini verir.
        System.out.println(idxIss2);

        //Example 1: Bir String'deki bir character'in tekrarlı veya tekrarsız olup olmadığını gösteren kodu yazınız.
        //           "Helloooo" ==> H-->Tekrarsız     e-->Tekrarsız      l-->Tekrarlı     o-->Tekrarlı

        String t = "Helloooo";

        char c = 'o';
        if (t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsız");
        }else {
            System.out.println("Tekrarlı");
        }
    }
}






package day01variables;

public class Variables01 {

     //Variable nasil oluşturulur?

    //1)Access Modifier   2)Data Types   3)Variable ismi  4) =  5)Deger   6);

    //Java'da ";" Ingilizce'deki "." gibidir
    //Ingilizce'de "cümle" deriz, Java'da "statement" deriz

    //"=" sembolu "Assigment(Atama) Operator" olarak adlandırılır
    //"Assigment(Atama) Operator" sagdaki degeri alir soldaki variable'in icine koyar

    public int age = 13;
    public int height = 183;

    //Java'da Data Teype'lari

    /* primitive Data Types

    1)int: Integer'in kisaltmasi. Integer tamsayı demektirr. 32 bit kullanir.

          Matamatik'de tamsayilarin basi ve sonu yoktur fakat Java'da tamsayilarin basi ve sonu vardır
          En kucuk int = -2,147,483,648
          En buyuk int = 2,147,483,647


    2)byte: Tamsayilar icin kullanilir. 8 bit kullanir.

            En kucuk byte = -128
            En buyuk byte = 127


    3)short: Tamsayilar icin. 16bit kullanir.

             En kucuk short = -32768
             En buyuk short = 32767


   4)long: Tamsayilar icindir.64 bit kullanır.

           En kucuk long = -9,223,372,036,854,755,808
           En buyuk long = 9,223,372,036,854,755,807


   5)float: Ondalikli sayılar icindir.32 bit kullanır.

            "float" virgülden sonra 7 basamak icerebilir.
            "float" degerlerinde sona "f" veya "F" koymaniz gerekir.


   6)double: Ondalikli sayilar icindir. 64 bit kullanir.

             "double" virgulden sonra 16 basamak icerebilir.


             7)boolean: true veya false değerleri icin kullanılır. 1 bit kullanir.

             8)char: Tek karakterler icin kullanilir.
                      A, c, 2, ?, _, =
                      Note: "char" lara deger verirken, degeri tırnak arasına koyunuz. Yoksa hata verir.

                      NOte: Java buyuk ve kucuk harflere duyarlidir
                            Java icin TRUE  ve true tamamen farklıdır

                      Note:Numeric Date Types: byte < shorte < int < long < float < double
                           Numeric Olmayan Data Types: boolean - char



                                   Nan - Pirimitive Data Types

            String: İsim adres, kimlik, numarası gibi bir veya birden fazla karakter içeren değerlerde kullanılır
                    String değerleri mutlaka çift tırnak arasına konulmalıdır
                    String non - pirimitive dir. Yani bir string oluşturulduğunda Java size bir sürü method verir.

                  Primitiv ve non primitivin farki nedir?  ( iş görüşmesi sorusu)
                  1)Non-primitive data type'larinda degerin yaninda method'lar vardir.
                    Primitive data type'larinda ise sadece deger vardir, method yoktur.
                  2)Primitive date type'lari Java tarafindan olusturulmustur, toplam 8 tanedir, biz primitive data olusturamayiz.
                    Non-Primitive data type'lari Java tarafindan olusturulmustur,biz de olusturabiliriz.Non-Primitive sayilacak
                    kadar coktur, cunku her developer Non-Primitive data type olusturabilir.
                  3)Primitive data type isimleri kucuk harflr baslar.
                    Non-Primitive data type isimleri buyuk harfle baslar
                  4)Primitive data type'lar memory'de farkli buyuklukte yerler kullanir.
                    Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar.


           */
    public byte pirice  = 12;

    public short populationOfVillage = 23000;

    public float piriceOfShirt = 13.99F;

    public double weightOfCell = 0.000012045;

    //Siz "long" demenize rağmen Java verilen sayıyı "int" kabur eder
    //Bu yüzden, long bir variable'a "int" aralığının dışında bir sayı verirseniz mutlaka sonuna "L" veya "l" koyunuz.
    public long populationOfWorld = 7000000000L;

    //Burada "L" koymadığınız halde problem yok çünkü "1234" int aralığına uyar
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = " Tom Hanks";

    //Note: "main method" arabanın motoru gibidir.
    //    : "main method" çalışmadan hiçbirşey çalışmaz
    public static void main(String[] args) {

        //name.

    }







}

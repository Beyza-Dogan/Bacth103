package day02methodcreation;

public class MethodCreation {

      //Main method icinde kullanacagınız hersey "static" olmalidir.
    public static void main(String[] args) {
        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2,1.5, 6));

        System.out.println(ilkIkisiniToplaUcuncuyuCarp(2, 8, 3.2));

        //sout yazip "Enter" a basiniz Sytem.out.println() otamatik olarak yazılır.
        //Ekrana bir sey yazdırmak icin iki tane kod var i)Sytem.out.println() ==>Satır basi yapar   ii)Sytem.out.print() ==>Satır bası yapmaz



    }

    //Example 1: Toplama islemi yapan bir method olusturunuz
    public static double toplamaYap(double a, double b){
        return a+b;
    }
    //Examp 2: Uc sayiyi birbiri ile carpan bir method olusturunuz
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }
    //Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup, sonucu ekrana yazdirin
        public static double ilkIkisiniToplaUcuncuyuCarp(double a, double b, double c){
        return (a+b)*c;
    }


}

package ay07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Verilen yilin "Leap year"(Artik yil) olup olumadigini kontrol eden kodu yazini.
        i)Yil 100 e bolunurse 400 e bolunmelidir==> 1600+  1800-
        ii)Yil 100 e bolunmesse 4 e bolunmelidir ==> 1996+  2001-

        */
        int year = 1600;

      String leap = year%100==0 ? (year%400==0 ? "Leap years" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");

      System.out.println(leap);

      /*
      Asagidaki kurallara gore password'un geccerli olup olmadigini kontrol eden kodu yaziniz
      i) sekiz karaktden fazla karakter varsa ilk harf 'i'olmalidir
      ii)sekiz karakterden az karakter varsa ilk harfi 'K'olmalidir
       */
        String pwd = "i2a3d549";

       String gecerli = pwd.length()<8 ? (pwd.charAt(0)=='K'? "Gecerli" : "Gecersiz") : (pwd.charAt(0) =='i' ? "Gecerli" : "Gecersiz");
       System.out.println(gecerli);
    }
}

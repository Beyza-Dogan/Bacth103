package sorucozum;

import java.util.Arrays;

public class day13 {
    public static void main(String[] args) {


        int arr[] = new int[4];

        System.out.println(Arrays.toString(arr));

        arr[0] = 17;
        arr[1] = 11;
        arr[2] = 89;
        arr[3] = 73;
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[3]);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        //Example 1: Arry'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz.

        int ilk = arr[0];
        int son = arr[arr.length - 1];
        System.out.println(ilk + son);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        //Example 3: String bir array olusturunuz
        // Bu Array'e 5 tane isim yerlestiriniz
        // Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String brr[] = new String[5];

        brr[0] = "Dogan";
        brr[1] = "Beyza";
        brr[2] = "Gulnur";
        brr[3] = "Hilal";
        brr[4] = "Mehmet";

        System.out.println(Arrays.toString(brr));

        int karakterSayilariToplami = 0;
        for (String w : brr) {
            karakterSayilariToplami = karakterSayilariToplami + w.length();

        }
        System.out.println(karakterSayilariToplami);
    }

//Example 4: Char bir array olusturunuz
// Bu array'e 5 eleman ekleyiniz
// Bu array;deki sadece buyk harfleri ekrana yazdiriniz



}





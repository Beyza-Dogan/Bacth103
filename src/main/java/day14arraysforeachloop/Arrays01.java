package day14arraysforeachloop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Arrays'lerin icine sadece "primitive data type" leri yerlestirilebilir.

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "supise you";
        System.out.println(Arrays.toString(str));

        //String bir Arry olusturunuz ve "Tom"ve "Tom"dan onceki tum elemanalri ekrana yazdiriniz
        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr){

            System.out.println(w + " ");
            if (w.equals("Tom")){
                break;
            }
        }
        System.out.println();
        //Example: String bir Arry olusturunuz ve "Tom"ve "Jane" haric tum elemanlari ekrana yazdiriniz

        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda",};

        for (String w : brr){

            if (w.equals("Jane") || w.equals("Tom")){
                continue;
            }
            System.out.println(w + " ");
        }

        System.out.println();

        //Example 3: Kullanici ile beraber bir Arry olustuunuz
        //           Bir ogretmein sinifindaki ogrenciilerin islerini opplication'a yuklemesini saglayan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi giriceksiniz?");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];

        for (int i=1; i<=numOfStd; i++){

            System.out.println("Lutfen" + i + ". ogrencinin ilk isimlerini giriniz" );

            String stdName = input.next();

            names[i-1] = stdName;
        }
        }
    }


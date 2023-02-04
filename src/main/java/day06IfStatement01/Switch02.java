package day06IfStatement01;

import java.util.Locale;
import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {



    /*
       Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazddiriniz
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini giriniz ");
        String ayIsmi = input.next().toLowerCase();

        switch (ayIsmi){
            case "ocak":
                System.out.println("Ocak");
                case "subat":
                System.out.println("Subat");
                case "mart":
                System.out.println("Mart");
                case "nisa":
                System.out.println("Nisan");
                case "mayis":
                System.out.println("Mayis");
                case "haziran":
                System.out.println("Haziran");
                case "temmuz":
                System.out.println("Temmuz");
                case "agistos":
                System.out.println("Agistos");
                case "eylul":
                System.out.println("OEylul");
                case "ekim":
                System.out.println("Ekim");
                case "kasim":
                System.out.println("Kasim");
                case "aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli ay ismi giriniz...");
        }
    }
}
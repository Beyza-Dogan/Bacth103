public class Ifstatemen01 {

    public static void main(String[] args) {

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.
        int s = 12;
        if (s>0){
            System.out.println("Positive");
        }

        //Example 2: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirin
        char ch = 'A';


        if (ch>='A' && ch<'Z'){
            System.out.println("Buyuk Harf");
        }
    }
}

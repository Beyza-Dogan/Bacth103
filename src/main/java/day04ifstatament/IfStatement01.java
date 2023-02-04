package day04ifstatement;

    public class IfStatement01 {
    public static void main(String[] args) {
        // If it rains I will cancel the picnic
        //if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        // Example 1: sayi pozitif ise ekrana pozitif yazdirin
        int s = 12;
        if(s>0){
            System.out.println("Pozitif");

        }
        //Example 2: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirin

        char ch = 'V';

        if (ch>='A' && ch<='Z') {
            System.out.println("Buyuk Harf");

            /*
            && islemi sadece boolean ile kullanilir
                true && true = true
                true && false = false
                false && true = false
                false && false = false
            && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir.
            Bir tane false varsa sonuc false demektir.
        */


            // Example 3: Verilen bir sayi uc basamakli ise ekrana uc basamakli yazdiriniz
            int n = -123;

            n = Math.abs(n);//abs absulute value mutlak değer demektir  abs(-120)=120


            if(n>99 && n<1000) {
                // -999 ......-99.....-1 0 1 2 .....99 100 101.......999 1000.....
                // if(n>=100 && n<=999) şeklinde de yazilabilir. Ama bura Java ya daha çok iş düşür.
                // Hem eşitliğe hem de büyük veya küçük olup olmadığına bakması gerek.
                System.out.println("Uc basamakli");


                //Example 4: Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz

                int p = 14;

                if (p % 2 == 0) {
                    System.out.println("Cift sayi");


                }

                // Example 5: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika sayi" yazdirin
                int r = 250;

                if(r<300 || r>1200){
                    System.out.println("Harika Sayi");

                }

             /*
                ||

              */
            }

        }


    }
}
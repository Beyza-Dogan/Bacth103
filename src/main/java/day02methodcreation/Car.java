package day02methodcreation;

public class Car {
    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        //Obje nasil olusturulur?
        //1)Class ismi yaziniz   2)Objeye bir isim veriniz    3) =    4)new keyword'unu kullan   5)Class ismi parantezle beraber
                 Car                    myHonda                  =             new                        Car();
               System.out.println(myHonda.fiyat);//20000
               System.out.println(myHonda.marka);//Honda

             myHonda.hareketEt();
             myHonda.dur();

       //MethodCreation class'inda obje olusturduk
        MethodCreation obj = new MethodCreation();
        obj.toplamaYap(3, 5);
        System.out.println(obj.toplamaYap(3, 5));//8.0
    }
    public void hareketEt(){
        System.out.println("Honda guzel hareket eder...");
    }
    public void dur (){
        System.out.println("Honda guvenli durur...");
    }



    }


package com.alyaauliahanafi.modul2.inheritance;

public class DemoInheritance {//class main
    public static void main(String[] args) {//main
        A superclass = new A();//membuat object baru
        B subclass = new B();

        System.out.println("Masukin data ke SuperClass ");
        superclass.x =10;//inisialisasi
        superclass.y =50;
        superclass.printXY();

        subclass.x = 30;
        subclass.y = 40;
        subclass.printXY();//cetak data
        subclass.sumValue();//memanggil method


    }
}

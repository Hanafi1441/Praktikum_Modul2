package com.alyaauliahanafi.modul2.inheritance.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {//main
        Lagu lagu1 = new Lagu("Semongko");//mengisi data
        Lagu lagu2 = new Lagu("Tarik");
        //memanggil class
        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}

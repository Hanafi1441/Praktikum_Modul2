package com.alyaauliahanafi.modul2.inheritance.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {//main
        X superClass = new X();//membuat object baru
        Y subClass = new Y();
        //input
        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}

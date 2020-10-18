package com.alyaauliahanafi.modul2.inheritance.VMI;

public class DemoVMI {//class main
    public static void main(String[] args) {
        Child child = new Child();//membuat object baru
        Parent parent = new Parent();

        child.getData();//memanggil class get data
        parent.getData();

    }
}

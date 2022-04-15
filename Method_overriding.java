package com.company;


class A {
    public void meth1(){
        System.out.println("Method 1 from class A");
    }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("Method 1 from class B");
    }
}


public class Method_overriding {

    public static void main(String[] args) {
        A n=new A();
        B m = new B();

       n.meth1();
        m.meth1();
    }
}

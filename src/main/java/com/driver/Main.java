package com.driver;
class A{
    public  static String  meth (){
        return  "Invoking method from class A";
    }

}
class B extends A{

public  static String  meth (){
    return "Method is overridden in Extendend class B";
}
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.print(b.meth());
        B obj = new B();
        System.out.println(obj.meth());




    }
  
}
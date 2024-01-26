package com.java.pratice.static_examples;

public class StaticClassExample {
    private static String str = "Static Class Test";

    // Static class
    static class MyNestedClass {

        // non-static method
        public void disp(){
            System.out.println(str);
        }
    }

    public static void main(String args[])
    {
        StaticClassExample.MyNestedClass obj
                = new StaticClassExample.MyNestedClass();
        obj.disp();
    }
}

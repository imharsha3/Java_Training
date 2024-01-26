package com.java.pratice.inheritance_examples;

class RBI {
    int getRateOfInterest(){
        return 0;
    }
}

class HDFC extends RBI {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class SBI extends RBI {
    @Override
    int getRateOfInterest() {
        return 10;
    }
}

public class Banks {
    public static void main(String args[]) {
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("HDFC Rate of Interest: " + hdfc.getRateOfInterest());
    }
}
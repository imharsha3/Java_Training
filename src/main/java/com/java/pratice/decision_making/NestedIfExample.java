package com.java.pratice.decision_making;

public class NestedIfExample {
    public static void main(String args[]) {
        int i = 16;
        int j = 29;
        if(i<17){
            if(j == 29){
                System.out.println("i is less than 17 and j is 29");
            }
            else{
                System.out.println("i is less than 17 and j is not equals to 29");
            }
        }
        else{
            System.out.println("i is not less than 17");
        }
    }
}

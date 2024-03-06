package com.java.pratice.vector_examples;

import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]) {
        //Create a vector
        Vector<String> vec = new Vector<String>();
        //Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");

        System.out.println("Elements are: "+vec);

        vec.add(4,"Rat");
        //Adding elements using addElement() method of Vector
        vec.addElement("Cat");
        vec.addElement("Deer");

        // Using set() method to replace
        System.out.println("The Object that is replaced is: "
                + vec.set(1, "Rabbit"));

        //To check size and capacity
        System.out.println("Size of the Vector: "+vec.size());
        System.out.println("Capacity of the Vector: "+vec.capacity());

        System.out.println("Elements after change: "+vec);

        //Remove the element at index 4
        System.out.println("Remove element at index 4: " +vec.remove(4));

        //Remove an element
        vec.removeElementAt(5);

        //Checking if Tiger is present or not in this vector
        if(vec.contains("Tiger"))
        {
            System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));
        }
        else
        {
            System.out.println("Tiger is not present in the list.");
        }

        //Get the first element
        System.out.println("The first animal of the vector is = "+vec.firstElement());
        //Get the last element
        System.out.println("The last animal of the vector is = "+vec.lastElement());

        //Get the hashcode for this vector
        System.out.println("Hash code of this vector = "+vec.hashCode());
        //Get the element at specified index
        System.out.println("Element at index 1 is = "+vec.get(1));

    }
}

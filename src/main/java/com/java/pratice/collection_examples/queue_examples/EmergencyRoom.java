package com.java.pratice.collection_examples.queue_examples;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyRoom {
    public static void main(String[] args) {
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>(new PatientComparator());

        priorityQueue.add(new Patient("Abc",1, 4));
        priorityQueue.add(new Patient("Xyz",2, 1));
        priorityQueue.add(new Patient("qwe",3, 2));
        priorityQueue.add(new Patient("iop",4, 3));

        System.out.println("Patients priority based on th severity:");
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
class Patient {
    private String name;
    private int id;
    private int severity;

    public Patient(String name, int id, int severity){
        this.name = name;
        this.id = id;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", severity=" + severity +
                '}';
    }
}
class PatientComparator implements Comparator<Patient>{
    @Override
    public int compare(Patient p1, Patient p2) {
        return Integer.compare(p2.getSeverity(), p1.getSeverity());
    }
}



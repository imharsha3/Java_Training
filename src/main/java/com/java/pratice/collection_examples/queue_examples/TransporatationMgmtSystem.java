package com.java.pratice.collection_examples.queue_examples;

import java.nio.channels.Pipe;
import java.util.PriorityQueue;

class Vehicle{
    private String id;
    private boolean isAmbulance;
    private int priority;

    public Vehicle(String id, boolean isAmbulance, int priority) {
        this.id = id;
        this.isAmbulance = isAmbulance;
        this.priority = priority;
    }

    public String getId(){
        return id;
    }
    public boolean isAmbulance() {
        return isAmbulance;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", isAmbulance=" + isAmbulance +
                ", priority=" + priority +
                '}';
    }
}

public class TransporatationMgmtSystem {
    public static void main(String[] args) {

        PriorityQueue<Vehicle> priorityQueue = new PriorityQueue<>((v1, v2) -> {
            return Integer.compare(v1.getPriority(), v2.getPriority());
        });

        priorityQueue.add(new Vehicle("V1", true, 1));
        priorityQueue.add(new Vehicle("V2", false, 4));
        priorityQueue.add(new Vehicle("V3", false, 3));
        priorityQueue.add(new Vehicle("V4", true, 2));

        System.out.println("Dispatching vehicles based on priority:");
        while (!priorityQueue.isEmpty()){
            Vehicle vehicle = priorityQueue.poll();
            if(vehicle.isAmbulance()){
                System.out.println("Dispatching Ambulance:" +vehicle.getId());
            }
            else{
                System.out.println("Dispatching normal vehicle:"+vehicle.getId());
            }
        }
    }
}


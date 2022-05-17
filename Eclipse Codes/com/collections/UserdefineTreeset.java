package com.collections;

import java.util.Comparator;
import java.util.TreeSet;
 
class Vehicle {
    public String model;    
    public String owner;
   
 
    public Vehicle(String model,String owner) {
        this.model = model;
        this.owner = owner;
        
    }
 
    public String toString() {
         return String.format("[Model:%s,Owner:%s]", 
                 model,owner);
     }
}
 
class SortByModel implements Comparator<Vehicle> {
 
    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        return vehicle1.model.compareTo(vehicle2.model);
    }
}
 
class SortByOwner implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        return vehicle1.owner.compareTo(vehicle2.owner);
    }
}
 

 
public class UserdefineTreeset {
 
    public static void main(String[] args) {
        TreeSet<Vehicle> vehicleList = new TreeSet<Vehicle>(new SortByModel());
        vehicleList.add(new Vehicle("Audio S-Class", "Atul"));
        vehicleList.add(new Vehicle("Thar", "Danny"));
        vehicleList.add(new Vehicle("Scorpion", "Siddhart"));
        vehicleList.add(new Vehicle("Tesla", "Harsh"));
        
        System.out.println(" Sorted Vehicle list by Model:\n"+ vehicleList);
         
        vehicleList = new TreeSet<Vehicle>(new SortByOwner());
        vehicleList.add(new Vehicle("Audio S-Class", "Atul"));
        vehicleList.add(new Vehicle("Thar", "Danny"));
        vehicleList.add(new Vehicle("Scorpion", "Siddhart"));
        vehicleList.add(new Vehicle("Tesla", "Harsh"));
        
        System.out.println(" Sorted Vehicle list by Owner:\n"+ vehicleList);
        
       
         
    }
}

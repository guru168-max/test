/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Sample;

/**
 *
 * @author dajig
 */
public class Bus extends Vehicle {
    int passengersCapacity;
    String type;

    public Bus(int passengersCapacity, String type, String brand, int speed) {
        super(brand, speed);
        this.passengersCapacity = passengersCapacity;
        this.type = type;
    }
    
    
}

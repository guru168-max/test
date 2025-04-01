/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Sample;

/**
 *
 * @author dajig
 */
public class Car extends Vehicle  {

    public Car(int doors, String brand, int speed) {
        super(brand, speed);
        this.doors = doors;
    }
    int doors;
    
    
}

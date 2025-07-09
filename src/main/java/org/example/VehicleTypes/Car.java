package org.example.VehicleTypes;

import org.example.Vehicle;
import org.example.VehicleType;

public class Car extends Vehicle {
    public Car(String licencePlate) {
        super(licencePlate, VehicleType.CAR);
    }
}

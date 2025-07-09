package org.example.VehicleTypes;

import org.example.Vehicle;
import org.example.VehicleType;

public class Bus extends Vehicle {
    public Bus(String licencePlate) {
        super(licencePlate, VehicleType.BUS);
    }
}

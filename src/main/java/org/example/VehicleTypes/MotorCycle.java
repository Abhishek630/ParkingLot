package org.example.VehicleTypes;

import org.example.Vehicle;
import org.example.VehicleType;

public class MotorCycle extends Vehicle {

    public MotorCycle(String licencePlate) {
        super(licencePlate, VehicleType.MOTORCYCLE);
    }
}

package org.example;

import java.time.ZonedDateTime;

public abstract class Vehicle {
    String licencePlate;
    VehicleType vehicleType;
    ZonedDateTime entryTime;

    public Vehicle(String licencePlate, VehicleType vehicleType) {
        this.licencePlate = licencePlate;
        this.vehicleType = vehicleType;
        this.entryTime = ZonedDateTime.now();
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ZonedDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(ZonedDateTime entryTime) {
        this.entryTime = entryTime;
    }
}

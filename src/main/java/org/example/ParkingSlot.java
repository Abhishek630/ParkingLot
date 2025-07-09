package org.example;

public class ParkingSlot {
    int id;
    Vehicle currVehicle;
    boolean isOccupied;
    VehicleSlot vehicleSlotType;

    public ParkingSlot(int id,VehicleSlot vehicleSlotType) {
        this.id = id;
        this.isOccupied = false;
        this.vehicleSlotType = vehicleSlotType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getCurrVehicle() {
        return currVehicle;
    }

    public void setCurrVehicle(Vehicle currVehicle) {
        this.currVehicle = currVehicle;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public VehicleSlot getVehicleSlotType() {
        return vehicleSlotType;
    }

    public void setVehicleSlotType(VehicleSlot vehicleSlotType) {
        this.vehicleSlotType = vehicleSlotType;
    }

    public boolean canAccommodate(Vehicle vehicle){
        switch (vehicleSlotType){
            case MOTORCYCLE -> {
                return vehicle.getVehicleType() == VehicleType.MOTORCYCLE;
            }
            case CAR -> {
                return  vehicle.getVehicleType() == VehicleType.CAR || vehicle.getVehicleType() == VehicleType.MOTORCYCLE;
            }
            case BUS ->{
                return true;
            }
        }
        return false;
    }

    public void releaseVehicle(){
        isOccupied = false;
        this.currVehicle = null;
    }

    public void assignVehicle(Vehicle vehicle) {
        isOccupied = true;
        this.currVehicle = vehicle;
    }
}

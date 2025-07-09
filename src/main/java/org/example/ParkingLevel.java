package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {
    int levelId ;
    List<ParkingSlot> carSlot;
    List<ParkingSlot> busSlot;
    List<ParkingSlot> motorCycleSlot;

    public ParkingLevel(int levelId, List<ParkingSlot> carSlot, List<ParkingSlot> busSlot, List<ParkingSlot> motorCycleSlot) {
        this.levelId = levelId;
        this.carSlot = carSlot;
        this.busSlot = busSlot;
        this.motorCycleSlot = motorCycleSlot;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public List<ParkingSlot> getCarSlot() {
        return carSlot;
    }

    public void setCarSlot(List<ParkingSlot> carSlot) {
        this.carSlot = carSlot;
    }

    public List<ParkingSlot> getBusSlot() {
        return busSlot;
    }

    public void setBusSlot(List<ParkingSlot> busSlot) {
        this.busSlot = busSlot;
    }

    public List<ParkingSlot> getMotorCycleSlot() {
        return motorCycleSlot;
    }

    public void setMotorCycleSlot(List<ParkingSlot> motorCycleSlot) {
        this.motorCycleSlot = motorCycleSlot;
    }

     public ParkingSlot findAvailableSlot(Vehicle vehicle) {
        List<ParkingSlot> slots = new ArrayList<>();

        switch (vehicle.getVehicleType()) {
            case MOTORCYCLE -> {
                slots.addAll(motorCycleSlot);
                slots.addAll(carSlot);
                slots.addAll(busSlot);
            }

            case CAR -> {
                slots.addAll(carSlot);
                slots.addAll(busSlot);
            }

            case BUS -> {
                slots.addAll(busSlot);
            }
        }

         for (ParkingSlot slot :slots){
             if(slot.canAccommodate(vehicle)) {
                 return slot;
             }
         }

         throw  new RuntimeException("Not supported vehicle type");
     }

     public LevelStatus viewLevelStatus (int levelId) {

     }
}


package org.example;

import java.util.Map;

public class ParkingLot {
    Map<Integer,ParkingLevel> levels;
    Map<Vehicle, ParkingSlot> slotMap;

    public ParkingLot(Map<Integer, ParkingLevel> levels, Map<Vehicle, ParkingSlot> slotMap) {
        this.levels = levels;
        this.slotMap = slotMap;
    }

    public Map<Integer, ParkingLevel> getLevels() {
        return levels;
    }

    public void setLevels(Map<Integer, ParkingLevel> levels) {
        this.levels = levels;
    }

    public Map<Vehicle, ParkingSlot> getSlotMap() {
        return slotMap;
    }

    public void setSlotMap(Map<Vehicle, ParkingSlot> slotMap) {
        this.slotMap = slotMap;
    }
}

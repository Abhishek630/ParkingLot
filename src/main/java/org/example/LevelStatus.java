package org.example;

public class LevelStatus {

    private final int levelId;
    private final int availableMotorcycleSlots;
    private final int totalMotorcycleSlots;
    private final int availableCarSlots;
    private final int totalCarSlots;
    private final int availableBusSlots;
    private final int totalBusSlots;

    public LevelStatus(int levelId, int availableMotorcycleSlots, int totalMotorcycleSlots,
                       int availableCarSlots, int totalCarSlots, int availableBusSlots, int totalBusSlots) {
        this.levelId = levelId;
        this.availableMotorcycleSlots = availableMotorcycleSlots;
        this.totalMotorcycleSlots = totalMotorcycleSlots;
        this.availableCarSlots = availableCarSlots;
        this.totalCarSlots = totalCarSlots;
        this.availableBusSlots = availableBusSlots;
        this.totalBusSlots = totalBusSlots;
    }
}

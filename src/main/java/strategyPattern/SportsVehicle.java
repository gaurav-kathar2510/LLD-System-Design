package strategyPattern;

import strategyPattern.strategy.SportsDriveCapability;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveCapability());
    }
}

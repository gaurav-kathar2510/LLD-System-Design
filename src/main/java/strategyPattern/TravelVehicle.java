package strategyPattern;

import strategyPattern.strategy.NormalDriveStrategy;

public class TravelVehicle extends Vehicle{

    TravelVehicle(){
        super(new NormalDriveStrategy());
    }
}

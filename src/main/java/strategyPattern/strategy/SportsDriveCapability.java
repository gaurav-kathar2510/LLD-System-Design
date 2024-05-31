package strategyPattern.strategy;

public class SportsDriveCapability implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports drive capability");
    }
}

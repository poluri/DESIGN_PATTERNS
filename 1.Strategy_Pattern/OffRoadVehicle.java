import Strategy.DriveStrategy;
import Strategy.NormalDrive;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new NormalDrive());
    }
}

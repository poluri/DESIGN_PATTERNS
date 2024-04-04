import Strategy.DriveStrategy;
import Strategy.NormalDrive;
import Strategy.SpecialDrive;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SpecialDrive());
    }
}

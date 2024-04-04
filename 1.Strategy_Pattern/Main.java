import Strategy.DriveStrategy;
import Strategy.NormalDrive;
import Strategy.SpecialDrive;

public class Main {

    public static void main(String args[]){

        Vehicle obj1 = new SportsVehicle();
        Vehicle obj2 = new OffRoadVehicle();

        obj1.drive();
        obj2.drive();

    }
}

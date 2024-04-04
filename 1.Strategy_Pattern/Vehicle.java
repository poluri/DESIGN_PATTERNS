import Strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveObject;

    //This is Know as Constructor Injection
    Vehicle(DriveStrategy obj){
        this.driveObject = obj;
    }

    public void drive(){
        driveObject.drive();
    }
}

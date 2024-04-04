package Strategy;

import Strategy.DriveStrategy;

public class NormalDrive implements DriveStrategy {


    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}

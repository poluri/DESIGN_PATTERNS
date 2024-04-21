package Adapter;

import Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachineKg;
    public WeightMachineAdapterImpl(WeightMachine weightMachineKg){
        this.weightMachineKg = weightMachineKg;
    }
    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachineKg.getWeightInPound();

        double weightInKg = weightInPound *0.45;
        return weightInKg;
    }
}

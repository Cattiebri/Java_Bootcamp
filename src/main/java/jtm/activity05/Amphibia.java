package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Amphibia extends Transport {
    private String id;
    private float consumption;
    private int tankSize;
    private byte sails;
    private int wheels;

    public Amphibia(String id, float consumption, int tankSize, byte sails, int wheels){
        super(id, consumption, tankSize);
        this.sails = sails;
        this.wheels = wheels;
    }

    @Override
    public String move(Road road) {
        if(road.getClass() == Road.class){
            float fuelSpentOnRoad = (float) road.getDistance() * getConsumption()/100;
            if (getFuelInTank() > fuelSpentOnRoad) {
                setFuelInTank(getFuelInTank() - fuelSpentOnRoad);
            }
            return getType() + " is driving on " + road.toString() + " with " + wheels + " wheels";
        } else {
            return getType() + " is sailing on " + road.toString() + " with " + sails + " sails";
        }

    }
}

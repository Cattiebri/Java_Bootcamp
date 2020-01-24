package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {
    private String id;
    protected byte sails; //number of sails for ships

    public Ship(String id, byte sails){
        super(id, 0, 0);
        this.sails = sails;
    }

    @Override
    public String move(Road road) {
        if(road.getClass() == WaterRoad.class) {
            float fuelSpentOnRoad = (float) road.getDistance() * getConsumption()/100;
            if (getFuelInTank() > fuelSpentOnRoad) {
                setFuelInTank(getFuelInTank() - fuelSpentOnRoad);
            }
            return getType() + " is sailing on " + road.toString() + " with " + sails + " sails";
        } else {
            return "Cannot sail on " + road.toString();
        }
    }
}


package com.company;

public class Bmw implements Car {

    public void turn(Direction direction, double startSpeed){
        System.out.println("Changing direction from "+direction+"at "+startSpeed);
    }

    public void changeLane(Direction direction, double startSpeed, double endSpeed) {
        System.out.println("Changing to "+direction+ " lane starting at " +startSpeed+ " and ending at "+ endSpeed );
    }

    @Override
    public void reverse(boolean bothReverseLights) {
        System.out.println("Turning on both reverse lights : "+bothReverseLights);
    }
}

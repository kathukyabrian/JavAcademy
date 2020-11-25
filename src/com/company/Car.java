package com.company;

public interface Car {
    enum Direction{
        RIGHT, LEFT
    }

    void turn(Direction direction, double startSpeed);

    void changeLane(Direction direction, double startSpeed, double endSpeed);

    void reverse(boolean bothReverseLights);

}

package ru.javabit.ship;

public class Boat extends Ship {

    Boat(){
        super(1, "Boat");
        this.shipPosition = ShipPosition.Unar;
    }

    @Override
    void placeToGameField() {

    }
}

package it.unibo.towermon.model;

public interface Floor {

    enum FloorType { BATTLE, UPGRADE }

    FloorType getFloorType();

}

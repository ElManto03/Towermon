package it.unibo.towermon.model;

public interface Floor {

    public enum FloorType {BATTLE, UPGRADE}

    FloorType getFloorType();

}

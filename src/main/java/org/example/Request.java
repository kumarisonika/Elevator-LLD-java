package org.example;

public class Request {
    int sourceFloor;
    Integer destinationFloor;
    private Direction direction;

    public Request(int sourceFloor, Direction direction){
        this.sourceFloor= sourceFloor;
        this.direction= direction;
        destinationFloor=null;
    }

    public Request(int sourceFloor, int destinationFloor){
        this.sourceFloor= sourceFloor;
        this.destinationFloor= destinationFloor;
        this.direction=null;
    }

    public int getSourceFloor(){ return sourceFloor;}

    public Direction getDirection(){ return direction;}

    public Integer getDestinationFloor(){ return destinationFloor;}
}

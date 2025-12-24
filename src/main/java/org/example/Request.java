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

    public Request(int destinationFloor){
        this.destinationFloor= destinationFloor;
        this.direction=null;
        this.sourceFloor=-1;
    }

    public int getSourceFloor(){ return sourceFloor;}

    public Direction getDirection(){ return direction;}

    public Integer getDestinationFloor(){ return destinationFloor;}
}

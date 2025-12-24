package org.example;

public class Elevator {
    private int currentFloor;
    private ElevatorState state;

    public Elevator(int startFloor){
        this.currentFloor = startFloor;
        this.state = ElevatorState.IDLE;
    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    public ElevatorState getState(){
        return state;
    }

    public void moveUp(){
        state = ElevatorState.MOVING_UP;
        currentFloor++;
        System.out.println("Elevator moving UP to floor " + currentFloor);
    }

    public void moveDown(){
        state = ElevatorState.MOVING_DOWN;
        currentFloor--;
        System.out.println("Elevator moving DOWN to floor " + currentFloor);
    }

    public void stop(){
        state = ElevatorState.IDLE;
        System.out.println("Elevator stopped at floor " + currentFloor);
    }
}

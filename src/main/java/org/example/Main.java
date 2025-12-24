package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Elevator elevator = new Elevator(1);
        //create a controller with elevator
        //crate a request and add to controller
        //then process the request from controller

        ElevatorController elevatorController = new ElevatorController(elevator);
        Request request1 = new Request(3, Direction.UP);
        Request request2 = new Request(1, Direction.DOWN);
        Request request3 = new Request(5, 10);

        elevatorController.submitRequest(request1);
        elevatorController.submitRequest(request2);
        elevatorController.submitRequest(request3);

        elevatorController.processNextRequest();
        elevatorController.processNextRequest();
        elevatorController.processNextRequest();

    }
}

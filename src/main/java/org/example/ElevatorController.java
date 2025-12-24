package org.example;

public class ElevatorController {
    private Elevator elevator;
    private RequestQueue requestQueue;

    public ElevatorController(Elevator elevator){
        this.elevator = elevator;
        this.requestQueue = new RequestQueue();
    }

    public void submitRequest(Request request){
        requestQueue.addRequest(request);
        System.out.println("Request submitted from floor " + request.getDestinationFloor());
    }

    public void processNextRequest(){
        if(requestQueue.isEmpty()){
            System.out.println("No pending requests");
            return;
        }

        Request request = requestQueue.getNextRequest();

        int targetFloor;
        if(request.getDestinationFloor() != null){
            targetFloor = request.getDestinationFloor();
        }else {
            targetFloor = request.getSourceFloor();
        }

        moveElevatorTo(targetFloor);
    }

    private void moveElevatorTo(int targetFloor){
        while(elevator.getCurrentFloor()<targetFloor){
            elevator.moveUp();
        }

        while (elevator.getCurrentFloor() > targetFloor){
            elevator.moveDown();
        }

        elevator.stop();
    }
}

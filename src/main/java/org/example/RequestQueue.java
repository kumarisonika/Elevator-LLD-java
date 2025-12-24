package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    Queue<Request> requests = new LinkedList<>();

    public void addRequest(Request request){
        requests.add(request);
    }

    public Request getNextRequest(){
        return requests.poll();
    }

    public boolean isEmpty(){
        return requests.isEmpty();
    }
}

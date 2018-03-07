package com.example.examplestatemachine;

public class StateContext{
    private State acceptState ;
    private State rejectState ;
    private State currentState;
    private char c;

    public StateContext(){
        rejectState = new RejectState(this);
        acceptState = new AcceptState(this);
        currentState = rejectState;
        c = 'e';
    }

    public void actionA() {
        currentState.actionA();
    }

    public void actionB() {
        currentState.actionB();
    }

    public boolean isAccept() {
        return currentState.isAccept();
    }

    public State getAcceptState(){
        return acceptState;
    }

    public State getRejectState(){
        return rejectState;
    }

    public char getFirst(){
        return c;
    }

    public void setFirst(char c){
        this.c = c;
    }

    public void setCurrentState(State currentState){
        this.currentState = currentState;
    }
}

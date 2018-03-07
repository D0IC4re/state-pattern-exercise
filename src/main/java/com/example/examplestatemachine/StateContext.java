package com.example.examplestatemachine;

public class StateContext extends State{
    private String s;

    public StateContext(){
        s = "";
    }

    @Override
    public void actionA() {
        s += "A";
    }

    @Override
    public void actionB() {
        s += "B";
    }

    @Override
    public boolean isAccept() {
        if (s.charAt(0) == s.charAt(s.length() - 1)){
            this.accept = true;
        }else{
            this.accept = false;
        }
        return this.accept;
    }
}

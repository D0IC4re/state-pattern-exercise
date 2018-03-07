package com.example.examplestatemachine;

public class RejectState extends State {

    public RejectState(StateContext theContext){
        sc = theContext;
        accept = false;
    }

    @Override
    public void actionA (){
        if (sc.getFirst() == 'B'){
            sc.setCurrentState(sc.getRejectState());
        }else{
            sc.setFirst('A');
            sc.setCurrentState(sc.getAcceptState());
        }
    }
    @Override
    public void actionB () {
        if (sc.getFirst() == 'A'){
            sc.setCurrentState(sc.getRejectState());
        }else{
            sc.setFirst('B');
            sc.setCurrentState(sc.getAcceptState());
        }
    }
}

package com.example.examplestatemachine;

public class AcceptState extends State {

    public AcceptState(StateContext theContext){
        sc = theContext;
        accept = true;
    }

    @Override
    public void actionA (){
        if (sc.getFirst() == 'A' || sc.getFirst() == 'e'){
            sc.setFirst('A');
            sc.setCurrentState(sc.getAcceptState());
        }else{
            sc.setCurrentState(sc.getRejectState());
        }
    }
    @Override
    public void actionB () {
        if (sc.getFirst() == 'B' || sc.getFirst() == 'e'){
            sc.setFirst('B');
            sc.setCurrentState(sc.getAcceptState());
        }else{
            sc.setCurrentState(sc.getRejectState());
        }
    }

}

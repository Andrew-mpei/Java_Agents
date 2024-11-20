package ru.mpei.HW5.Task1;

import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class MyWakerStart extends WakerBehaviour {
    public MyWakerStart(Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    protected void onWake() {
        super.onWake();
    }
}

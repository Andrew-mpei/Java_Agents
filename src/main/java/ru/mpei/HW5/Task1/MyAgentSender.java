package ru.mpei.HW5.Task1;

import jade.core.Agent;

public class MyAgentSender extends Agent {
    @Override
    protected void setup() {
        String serviceName = String.valueOf(this.getArguments()[0]);
        DfHelper.registerAgent(this, serviceName);

        this.addBehaviour(new MyWakerStart(this, 1000));
        this.addBehaviour(new SendBahaviour(this, 500));
    }
}

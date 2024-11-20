package ru.mpei.HW5.Task2;

import jade.core.Agent;
import ru.mpei.HW5.Task1.DfHelper;

public class MyAgent extends Agent {
    @Override
    protected void setup() {
        String serviceName = String.valueOf(this.getArguments()[0]);
        DfHelper.registerAgent(this, serviceName);
        this.addBehaviour(new MyFSMBehaviour());
    }
}

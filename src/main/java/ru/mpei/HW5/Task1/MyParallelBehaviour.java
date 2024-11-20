package ru.mpei.HW5.Task1;

import jade.core.behaviours.ParallelBehaviour;

public class MyParallelBehaviour extends ParallelBehaviour {
    public MyParallelBehaviour() {
        this.addSubBehaviour(new NotSpamBehaviour());
        this.addSubBehaviour(new SpamBehaviour());
    }
}

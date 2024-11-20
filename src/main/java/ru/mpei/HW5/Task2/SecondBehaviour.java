package ru.mpei.HW5.Task2;

import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class SecondBehaviour extends WakerBehaviour {
    public SecondBehaviour(Agent a, long timeout) {
        super(a, timeout);
        System.out.println("отработал конструктор поведения SecondBehaviour");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("отработал метод onStart поведения SecondBehaviour");
    }

    @Override
    protected void onWake() {
        System.out.println("отработал метод onWake поведения SecondBehaviour");
    }

    @Override
    public int onEnd() {
        System.out.println("отработал метод onEnd поведения SecondBehaviour");
        return 1;
    }
}

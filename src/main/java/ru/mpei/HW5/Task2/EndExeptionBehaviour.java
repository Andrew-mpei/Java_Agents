package ru.mpei.HW5.Task2;

import jade.core.behaviours.OneShotBehaviour;

public class EndExeptionBehaviour extends OneShotBehaviour {


    private static final int ERROR = -1;

    @Override
    public void action() {
    }

    @Override
    public int onEnd() {
        try {
            throw new RuntimeException("Исключение");
        } catch (Exception e) {
            MyFSMBehaviour.setHasError(true);
            return ERROR;
        }

    }
}

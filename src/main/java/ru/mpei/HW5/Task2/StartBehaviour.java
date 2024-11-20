package ru.mpei.HW5.Task2;

import jade.core.behaviours.OneShotBehaviour;

public class StartBehaviour extends OneShotBehaviour {
    public StartBehaviour() {
        System.out.println("отработал конструктор поведения StartBehaviour");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("Отработал onStart поведения StartBehaviour");
    }

    @Override
    public void action() {
        System.out.println("отработал метод action поведения StartBehaviour");

    }

    @Override
    public int onEnd() {
        System.out.println("отработал метод onEnd поведения StartBehaviour");
        return 1;
    }
}

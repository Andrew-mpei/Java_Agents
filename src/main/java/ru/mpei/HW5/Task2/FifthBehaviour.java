package ru.mpei.HW5.Task2;

import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class FifthBehaviour extends OneShotBehaviour {
    private MessageTemplate mt;
    public FifthBehaviour() {
        System.out.println("отработал конструктор поведения FifthBehaviour");
        this.mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("отработал метод onStart поведения FifthBehaviour");
        this.mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
    }

    @Override
    public void action() {
        ACLMessage msg = myAgent.receive(mt);
        if (msg != null) {
            System.out.println("отработал метод action поведения FifthBehaviour");
            System.out.println("сгенерированное число больше 1");
        } else {
            block();
        }
    }

    @Override
    public int onEnd() {
        System.out.println("отработал метод onEnd поведения FifthBehaviour");
        return 5;
    }
}

package ru.mpei.HW5.Task2;

import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class FourthBehaviour extends OneShotBehaviour {
    private MessageTemplate mt;

    public FourthBehaviour() {
        System.out.println("отработал конструктор поведения FourthBehaviour");
    }

    @Override
    public void onStart() {
//        super.onStart();
        System.out.println("отработал метод onStart поведения FourthBehaviour");
        this.mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
    }

    @Override
    public void action() {
        ACLMessage msg = myAgent.receive(mt);
        if (msg != null) {
            ACLMessage resp = msg.createReply();
            resp.setContent("1");
            myAgent.send(msg);
            System.out.println("отработал метод action поведения FourthBehaviour");
            System.out.println("сгенерированное число меньше 1");
        } else {
            block();
        }

    }

    @Override
    public int onEnd() {
        System.out.println("отработал метод onEnd поведения FourthBehaviour");
        return 4;
    }
}

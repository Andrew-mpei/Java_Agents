package ru.mpei.HW5.Task2;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class ThirdBehaviour extends OneShotBehaviour {

    private int result;

    public ThirdBehaviour() {
        System.out.println("отработал конструктор поведения ThirdBehaviour");
    }

    @Override
    public void onStart() {
//        super.onStart();
        System.out.println("отработал метод onStart поведения ThirdBehaviour");
    }

    @Override
    public void action() {
//        this.result = (int) Math.random() * 2;
        this.result = 1;
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(this.myAgent.getAID());
        if (this.result < 1){
            this.result = 1;
            msg.setContent(String.valueOf(1));
        }else if (this.result > 1){
            this.result = 2;
            msg.setContent(String.valueOf(2));
        }else{
            this.result = 0;
            msg.setContent(String.valueOf(0));
        }
        myAgent.send(msg);
        System.out.println("отработал метод action поведения ThirdBehaviour");
        System.out.println("сгенерированное число: " + this.result);

    }

    @Override
    public int onEnd() {
        System.out.println("отработал метод onEnd поведения ThirdBehaviour");
        return this.result;
    }
}

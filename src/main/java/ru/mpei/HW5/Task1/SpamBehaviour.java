package ru.mpei.HW5.Task1;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class SpamBehaviour extends Behaviour {
    private MessageTemplate mtSpam;
    private int counter;
    @Override
    public void onStart() {
        mtSpam = MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.PROPOSE),
                MessageTemplate.MatchProtocol("sports_betting"));
    }
    @Override
    public void action() {
        ACLMessage msg = myAgent.receive(mtSpam);
        if (msg != null){
            System.err.println(msg.getContent());
            counter++;
        }else{
            block();
        }
    }

    @Override
    public int onEnd() {
        return 1;
    }

    @Override
    public boolean done() {
        return this.counter == 100;
    }
}

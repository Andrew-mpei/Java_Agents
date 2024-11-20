package ru.mpei.HW5.Task1;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class NotSpamBehaviour extends Behaviour {

    private MessageTemplate mtNotSpam;
    private int counter;
    @Override
    public void onStart() {
        mtNotSpam = MessageTemplate.or(
                MessageTemplate.or(
                MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.REQUEST), MessageTemplate.MatchProtocol("study")),

                MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.INFORM), MessageTemplate.MatchProtocol("politics"))),


                MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.INFORM), MessageTemplate.MatchProtocol("weather")));
    }

    @Override
    public void action() {
//        System.out.println(myAgent.receive().getContent());
        ACLMessage msg = myAgent.receive(mtNotSpam);
        if (msg != null){
            System.out.println(msg.getContent());
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

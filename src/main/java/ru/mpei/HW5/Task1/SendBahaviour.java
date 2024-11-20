package ru.mpei.HW5.Task1;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.List;

public class SendBahaviour extends TickerBehaviour {

    public SendBahaviour(Agent a, long period) {
        super(a, period);
    }

    @Override
    protected void onTick() {
        List<AID> agents = DfHelper.findAgents(myAgent, "service1");
//        System.out.println(myAgent.getLocalName() + " find " + agents.size() + " agents");
        if (agents.get(0).getLocalName().equals("Spamer")){
            ACLMessage msgSpam = new ACLMessage(ACLMessage.PROPOSE);
            msgSpam.setProtocol("sports_betting");
            msgSpam.setContent("do you want a lot of money? Find 1X-bet");
            msgSpam.addReceiver(agents.get(1));
            myAgent.send(msgSpam);

            ACLMessage msgNews = new ACLMessage(ACLMessage.INFORM);
            msgNews.setProtocol("politics");
            msgNews.setContent("Donald Trump win");
            msgNews.addReceiver(agents.get(1));
            myAgent.send(msgNews);

            ACLMessage msgSkillbox = new ACLMessage(ACLMessage.REQUEST);
            msgSkillbox.setProtocol("study");
            msgSkillbox.setContent("Do you want to learn AI?");
            msgSkillbox.addReceiver(agents.get(1));
            myAgent.send(msgSkillbox);

            ACLMessage msgWeather = new ACLMessage(ACLMessage.INFORM);
            msgWeather.setProtocol("weather");
            msgWeather.setContent("There is rainfall in Moscow today");
            msgWeather.addReceiver(agents.get(1));
            myAgent.send(msgWeather);
        }
    }
}

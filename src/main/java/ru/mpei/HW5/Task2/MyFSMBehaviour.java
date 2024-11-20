package ru.mpei.HW5.Task2;

import jade.core.Agent;
import jade.core.behaviours.FSMBehaviour;
import ru.mpei.HW5.Task1.DfHelper;

public class MyFSMBehaviour extends FSMBehaviour {
    static boolean hasError = false;

    public static void setHasError(boolean hasError) {
        MyFSMBehaviour.hasError = hasError;
    }

    public MyFSMBehaviour() {
        registerFirstState(new StartBehaviour(), "startMsg");
        registerState(new SecondBehaviour(myAgent, 2_000), "wait");
        registerState(new ThirdBehaviour(), "third");
        registerState(new FourthBehaviour(), "fourth");
        registerState(new FifthBehaviour(), "fifth");
        registerLastState(new EndBehaviour(), "end");
        registerLastState(new EndExeptionBehaviour(), "endExeption");

        registerDefaultTransition("startMsg", "wait");
        registerDefaultTransition("wait", "third");
        registerTransition("third", "fourth", 1);
        registerTransition("third", "fifth", 2);
        registerTransition("third", "endExeption", 0);
        registerDefaultTransition("fourth", "end");
        registerDefaultTransition("fifth", "end");
    }


    @Override
    public int onEnd() {
        if (hasError) {
            DfHelper.unregisterAgent(this.myAgent, "ser");
            throw new RuntimeException();
        }
        return super.onEnd();
    }
}

package com.vido.moneymanager.view.intro;

import com.vido.moneymanager.state.Pane;
import com.vido.moneymanager.state.State;
import com.vido.moneymanager.state.StateManager;

import javax.swing.*;

public class IntroState extends Pane {

    private static final String TAG = IntroState.class.getName();

    private JPanel rootPanel;

    public IntroState() {

        setComponent(rootPanel);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                StateManager.getInstance().show(State.HOME);
            }
        });
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }

    @Override
    public void onPaneOpened() {
        System.out.println(TAG + " - onPaneOpened");
    }

    @Override
    public void onPaneClosed() {
        System.out.println(TAG + " - onPaneClosed");
    }
}

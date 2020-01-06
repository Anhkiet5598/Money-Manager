package com.vido.moneymanager.view.category;

import com.vido.moneymanager.state.Pane;
import com.vido.moneymanager.state.State;
import com.vido.moneymanager.state.StateManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoryState extends Pane {

    private JTable categoryTable;
    private JButton deleteButton;
    private JButton editButton;
    private JButton newButton;
    private JButton homeButton;

    private JPanel rootPanel;

    public CategoryState() {
        setComponent(rootPanel);
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onNewButtonClicked();
            }
        });
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onEditButtonClicked();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onDeleteButtonClicked();
            }
        });
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onHomeButtonClicked();
            }
        });
    }

    private void onNewButtonClicked() {
    }

    private void onEditButtonClicked() {
    }

    private void onDeleteButtonClicked() {
    }

    private void onHomeButtonClicked() {
        StateManager.getInstance().show(State.HOME);
    }

    @Override
    public void onPaneOpened() {
    }

    @Override
    public void onPaneClosed() {
    }
}

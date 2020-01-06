package com.vido.moneymanager.view.home;

import com.vido.moneymanager.state.Pane;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeState extends Pane {

    private static final String TAG = HomeState.class.getName();

    private JPanel rootPanel;
    private JTable transactionTable;
    private JButton deleteButton;
    private JButton editButton;
    private JButton newButton;

    private TransactionTableModel transactionTableModel = new TransactionTableModel();

    public HomeState() {

        setComponent(rootPanel);

        transactionTable.setModel(transactionTableModel);

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
    }

    private void onNewButtonClicked() {
    }

    private void onEditButtonClicked() {
    }

    private void onDeleteButtonClicked() {
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

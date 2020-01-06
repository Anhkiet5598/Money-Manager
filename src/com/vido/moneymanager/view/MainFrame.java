package com.vido.moneymanager.view;

import com.vido.moneymanager.state.State;
import com.vido.moneymanager.state.StateManager;
import com.vido.moneymanager.view.category.CategoryState;
import com.vido.moneymanager.view.intro.IntroState;
import com.vido.moneymanager.view.home.HomeState;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {

    private JPanel rootPanel;
    private JPanel contentPanel;

    private final StateManager stateManager;

    public MainFrame() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(rootPanel);

        stateManager = StateManager.getInstance();
        stateManager.initiate(contentPanel);

        initMenuBar();
        initComponents();

        open(State.INTRO);
    }

    private void initMenuBar() {

        JMenuBar menuBar = new JMenuBar();

        initFileMenu(menuBar);
        initCategoryMenu(menuBar);

        setJMenuBar(menuBar);
    }

    private void initFileMenu(JMenuBar menuBar) {

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem exitMenuItem = new JMenuItem("Exit", KeyEvent.VK_X);
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
    }

    private void initCategoryMenu(JMenuBar menuBar) {

        JMenu categoryMenu = new JMenu("Category");
        categoryMenu.setMnemonic(KeyEvent.VK_C);

        JMenuItem showMenuItem = new JMenuItem("Show", KeyEvent.VK_S);
        showMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.ALT_MASK));
        showMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StateManager.getInstance().show(State.CATEGORY);
            }
        });
        categoryMenu.add(showMenuItem);

        menuBar.add(categoryMenu);
    }

    private void initComponents() {

        stateManager.add(State.INTRO, new IntroState());
        stateManager.add(State.HOME, new HomeState());
        stateManager.add(State.CATEGORY, new CategoryState());
    }

    public void open(final State state) {
        stateManager.show(state);
    }
}

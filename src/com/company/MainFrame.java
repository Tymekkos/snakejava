package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("slatt");
        add(new MainPanel());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }
}

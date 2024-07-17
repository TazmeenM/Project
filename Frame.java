import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

class Frame extends JFrame{
    static CardLayout panels;
    static Container c;

    private JFrame frame;
    private Panel panel;

    public Frame(){
        c = getContentPane();
        panels = new CardLayout();
        c.setLayout(panels);

        panel = new Panel();
        introductionPanel = new IntroductionPanel();

        c.add("Panel", panel);
        c.add("Introduction Panel", introductionPanel);
    }

}
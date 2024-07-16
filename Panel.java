import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.event.*;

class Panel extends JPanel implements ActionListener, KeyListener{
    private JButton startButton, returnButton, usernameButton;

    public Panel(){
        addKeyListener(this);
        startButton = new JButton("Start");
        startButton.setBackground(Color.blue);
        startButton.addActionListener(this);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(Box.createRigidArea(new Dimension(0, 0)));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(startButton);

        this.setLayout(new FlowLayout());
        this.setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
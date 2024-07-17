import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.event.*;

class Panel extends JPanel implements ActionListener, KeyListener{
    private JButton returnButton;

    public Panel(){
        addKeyListener(this);
        returnButton = new JButton("Return to Main Menu");
        returnButton.setBackground(Color.blue);
        returnButton.addActionListener(this);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(Box.createRigidArea(new Dimension(0, 0)));
        returnButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(returnButton);

        this.setLayout(new FlowLayout());
        this.setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == startButton){
            Frame.panels.show(Frame.c, "Panel");
        }

    }
    public void keyPressed(KeyEvent e){
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
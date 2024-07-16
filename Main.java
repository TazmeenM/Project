import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Frame frame = new Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1080, 720);
        frame.setResizable(true);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your username: ");
        User user = new User(input.readLine());
    }
    
    public String book(String name){
        return name;
    }

    public void Book(String name){
        String bookName = name; 
    }
}
package com.company;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setTitle("420 is funny number");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setSize(420,420);
	frame.setVisible(true);

	ImageIcon image = new ImageIcon("src/logo.png");
	frame.setIconImage(image.getImage());
	frame.setLayout(null);
    }
}

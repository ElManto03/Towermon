package it.unibo.towermon.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class InitialView extends JFrame {

    private Image backgroundImage;

    public InitialView(){
        initView();
    }

    private void initView(){
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton start= new JButton();
        try{
            Image imm= ImageIO.read(new File("src/main/resources/layouts/startButton.png"));
            start.setIcon(new ImageIcon(imm));
        } catch (IOException e){
            e.printStackTrace();
        }

        start.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Starting application");
        });

        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        try {
            backgroundImage = ImageIO.read(new File("src/main/resources/layouts/InitialBackground.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        panel.setLayout(new GridBagLayout());
       GridBagConstraints constraints= new GridBagConstraints();
       constraints.gridx=0;
       constraints.gridy=0;
       constraints.insets=new Insets(0, 0, 0, 0);
       
       panel.add(start,constraints);
        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        InitialView initialView= new InitialView();
    }
}

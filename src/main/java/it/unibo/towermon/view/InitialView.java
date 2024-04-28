package it.unibo.towermon.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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


        JLabel start = new JLabel();
        try {
            Image img = ImageIO.read(new File("src/main/resources/layouts/startButton.png"));
            start.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            e.printStackTrace();
        }


        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(InitialView.this, "Starting application");
                setDefaultCloseOperation(0);
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
                    backgroundImage = ImageIO.read(new File("src/main/resources/layouts/secondBackground.jpeg"));
                } catch (IOException e2) {
                    e2.printStackTrace();
                }

                JLabel chose= new JLabel("SCEGLI IL TUO PERSONAGGIO");
                panel.setLayout(new BorderLayout());
                panel.add(chose,BorderLayout.NORTH);

                add(panel);
                setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });

        JLabel title= new JLabel();
        try{
            Image img= ImageIO.read(new File("src/main/resources/layouts/title.png"));
            title.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            e.printStackTrace();
        }

    

       panel.setLayout(new GridBagLayout());
       GridBagConstraints constraints = new GridBagConstraints();
       constraints.gridx=0;
       constraints.gridy=0;
       constraints.insets= new Insets(0, 0, 100, 0);
       constraints.anchor=GridBagConstraints.NORTH;
       panel.add(title,constraints);

       constraints.gridx=0;
       constraints.gridy=1;
       constraints.insets= new Insets(100, 0, 0, 0);
       constraints.anchor=GridBagConstraints.SOUTH;
       panel.add(start,constraints);
        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        InitialView initialView= new InitialView();
    }
}

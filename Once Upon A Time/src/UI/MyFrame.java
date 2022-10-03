package UI;

import FORM_MANAGER.FormManager;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton buttonNewGame;
    protected MyPanel panel;
    public MyFrame()
    {


        //THIS COMMAND IS NOT NEEDED HERE -->          JFrame frame=new JFrame();//creates frame
        //WE REPLACE THE WORD FRAME WITH THIS EVERYWHERE
        panel=new MyPanel();


        this.setSize(546,768);

        this.setTitle("Once Upon A Time"); //sets title of this frame
        this.add(panel);

        //this.setSize(500,500);//sets x and y dimension of this BUT SINCE WE USE ADD A PANEL TO THE FRAME WE DONT NEED A SIZE FOR THE FRAME
        this.setLocationRelativeTo(null); //makes the frame appear in the middle of the screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exits out of application
        this.setResizable(false);//allows or prevents this from being resizable


        //ImageIcon thisIcon = new ImageIcon("<IconPathHere>"); //creates an image Icon
        //this.setIconImage(this.getIconImage()); //Sets Icon of this

        //this.getContentPane().setBackground(Color.black);//changes the color of this background, can create our own color with <<new Color(0,0,0)>>


        buttonNewGame= new JButton("NEW GAME!");
        buttonNewGame.setBounds(198,200,150,50);
        //buttonNewGame.setPreferredSize(new Dimension(100,100));//Only use if you have a layout, Here we have set our layout to null

        buttonNewGame.addActionListener(e -> LoadCharCreationFrame(this)); //here we use a lambda to create an action listener for te button
        buttonNewGame.setVisible(true);
        buttonNewGame.revalidate();
        buttonNewGame.repaint();
        //buttonNewGame.setText("NEW GAME!");
        buttonNewGame.setFont(new Font("Ink Free",Font.BOLD,20));
        buttonNewGame.setFocusPainted(false);//Removes the border from around the text
        //buttonNewGame.setOpaque(false);
        //buttonNewGame.setContentAreaFilled(true);
        //buttonNewGame.setBorderPainted(true);
        panel.add(buttonNewGame);//adds the button to the panel

        JButton test=new JButton("test");
        test.setBounds(348,200,150,50);
        buttonNewGame.setVisible(true);
        panel.add(test);

        /*YOU CAN REMOVE THE TITLE BAR USING THE FOLLOWING CODE
        this.setUndecorated(true);
        this.setVisible(true);//makes this frame visible
        */
        this.setVisible(true);
    }

    public static void LoadCharCreationFrame(MyFrame frame)
    {
        frame.setVisible(false);
        FormManager.CharacterCreationFormLoad();
    }



    //WE WONT USE THE FUNCTION PAINT IN OUR FRAME BECAUSE IT WILL OVERLAP WHAT WE DRAW WITH THE FRAME BAR AT THE TOP, INSTEAD WE WILL CREATE A NEW PANEL USING A NEW CLASS MyPanel AND WE WILL DRAW WHAT WE WANT THERE
    /* public void paint(Graphics g)
    {
        Graphics2D g2D= (Graphics2D) g; //Graphics2D is a subclass of the class Graphics and it has a lot more options as to what we can draw
        g2D.drawLine(0,0,500,500);

    }
    */
}

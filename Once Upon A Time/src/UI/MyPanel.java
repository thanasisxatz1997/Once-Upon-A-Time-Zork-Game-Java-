package UI;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image imageToDraw;


    MyPanel()
    {
        imageToDraw=new ImageIcon("Dream 06_resized.jpeg").getImage();//Creates an image
        this.setPreferredSize(new Dimension(546,768));//sets size for the panel
        this.setLayout(null);
        System.out.println("Here after");

    }

    public void paint(Graphics g)
    {
        System.out.println("here before");
        Graphics2D g2D= (Graphics2D) g; //Graphics2D is a subclass of the class Graphics and it has a lot more options as to what we can draw

        //PAINTING AN IMAGE
        g2D.drawImage(imageToDraw,0,0,null);//ADDS AN IMAGE, we add it first so that it has lower priority from everything else that we draw(background image).

        //g2D.setStroke(new BasicStroke(5)); //makes g2D thicker(makes it 5 pixels)

       /* g2D.setPaint(Color.blue);//changes the color of the 2DGraphic g2D
        g2D.drawLine(0,0,500,500); //draws a Line

        g2D.setPaint(Color.red);
        g2D.drawRect(0,0,100,200);//Draws a rectangle
        g2D.fillRect(0,0,100,200);//Fills a rectangle
        //IMPORTANT NOTE! RECENTLY CREATED GRAPHICS ARE GOING TO OVERLAP ANY PREVIOUSLY CREATED ONES AND HAVE PRIORITY

        g2D.setPaint(Color.pink);
        g2D.drawOval(100,100,200,200);//Draws Oval */

        /*DRAWING A POKEBALL
        g2D.setPaint(Color.red);
        g2D.fillArc(0,0,100,100,0,180);
        g2D.setPaint(Color.white);
        g2D.fillArc(0,0,100,100,180,180);
        */

        //ADDING A POLYGON
        /*
        int[] xPoints={150,250,350};
        int[] yPoints={300,150,300};
        g2D.setPaint(Color.YELLOW);
        //g2D.drawPolygon(xPoints,yPoints,3);
        g2D.fillPolygon(xPoints,yPoints,3);*/

        //PAINTING A STRING
        /*
        g2D.setPaint(Color.black);
        g2D.setFont(new Font("Ink Free",Font.BOLD,50)); //sets the Font
        g2D.drawString("YOU WON!",50,50);//Draws a string if u set coordinates to 0,0 then it will not be displayed (it will be offscreen)*/

    }

}

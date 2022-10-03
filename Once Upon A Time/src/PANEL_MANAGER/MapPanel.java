package PANEL_MANAGER;

import javax.swing.*;
import java.awt.*;

public class MapPanel extends JPanel
{
    ImageIcon icon;
    public MapPanel(ImageIcon mapIcon)
    {
        icon=mapIcon;
        this.setLayout(null);
        this.setSize(670,700);
        this.setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2Df= (Graphics2D) g;
        g2Df.drawImage(icon.getImage(),10,10,null);
    }
}

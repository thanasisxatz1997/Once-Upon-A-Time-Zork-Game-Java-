package PANEL_MANAGER;

import javax.swing.*;

public class MapFrame extends JFrame
{
    MapPanel panel;
    public MapFrame(ImageIcon mapIcon)
    {
        panel=new MapPanel(mapIcon);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setSize(670,700);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setVisible(true);

    }

    public void Close()
    {
        this.setVisible(false);
        this.dispose();
    }
}

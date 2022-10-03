package FORM_MANAGER;

import PANEL_MANAGER.ScenePanel;

import javax.swing.*;

public class ScreenFrame extends JFrame
{
    public ScenePanel panel;
    public ScreenFrame()
    {
        FrameCreate();
    }
    public void FrameCreate()
    {
        panel =new ScenePanel();
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Once Upon A Time");
        System.out.println("GAME LOADED");
        this.setSize(1080,1000);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(panel);
        this.setVisible(true);
    }

    public void CloseFrame()
    {
        this.setVisible(false);
        this.dispose();
    }

}

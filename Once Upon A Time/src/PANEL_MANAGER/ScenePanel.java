package PANEL_MANAGER;

import FORM_MANAGER.ScreenFrame;
import SCENES.Scene;
import SCENES.Scene1;
import SCENES.Scene2;
import SCENES.SceneManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ScenePanel extends JPanel
{
    public JLabel label=new JLabel();
    public JTextPane textPane=new JTextPane();

    public ScenePanel()
    {

        this.setSize(1080,1000);
        this.setLayout(null);
        this.textPane.setBounds(10,570,1045,450);

    }
    public void Add()
    {
        this.label.setBounds((1080 - this.label.getIcon().getIconWidth()) / 2, 10, 1060, 490);
        this.add(textPane);
        this.add(label);
        this.setVisible(true);
    }
}



/*public class ScenePanel extends JPanel
{
    public JLabel scenePictureLabel;
    public JTextPane sceneTextPane;
    public SceneManager sceneManager;



    public ScenePanel()
    {
        //sceneManager=new SceneManager();

        scenePictureLabel=new JLabel();
        sceneTextPane=new JTextPane();
        this.setSize(1080,1000);
        this.setLayout(null);
        sceneTextPane.setBounds(10,570,1045,450);
        this.add(scenePictureLabel);
        this.add(sceneTextPane);
    }

    public void LoadScene() {

        ImageIcon sceneImage;
        String sceneTextPaneSource;
        sceneImage = this.sceneManager.currentSceneIcon;
        sceneTextPaneSource = this.sceneManager.currentSceneDescription;
        scenePictureLabel.setBounds((1080 - sceneImage.getIconWidth()) / 2, 10, 1060, 490);
        scenePictureLabel.setIcon(sceneImage);
        sceneTextPane.setText(sceneTextPaneSource);

        this.sceneTextPane.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("GOING NEEEEEEXT");

                    if (sceneTextPane.getText() == "Go straight") {
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public void UnloadScene()
    {

    }

    public void LoadLabel()
    {

    }

    public void LoadTextPane()
    {

    }

}*/

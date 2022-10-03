package UI;

import javax.swing.*;

public class CharacterCreationFrame extends JFrame {
    public CharacterCreationFrame()
    {
        CharacterCreationPanel panel=new CharacterCreationPanel();

        this.setSize(1000,1000);
        this.setTitle("Character Creation");
        this.setLocationRelativeTo(null); //makes the frame appear in the middle of the screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exits out of application
        this.setResizable(true);//allows or prevents this from being resizable
        this.setVisible(true);
        this.add(panel);
        panel.setVisible(true);
    }
    public void CloseFrame()
    {
        this.setVisible(false);
        this.dispose();
    }

}

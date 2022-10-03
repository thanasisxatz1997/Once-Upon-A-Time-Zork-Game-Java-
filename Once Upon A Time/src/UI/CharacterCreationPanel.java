package UI;

import FORM_MANAGER.FormManager;

import javax.swing.*;
import java.awt.*;

public class CharacterCreationPanel extends JPanel {

    Image femaleCharacterImage;
    Image maleCharacterImage;
    Image maleCharImgT;
    Image femaleCharImgT;

    JButton buttonMale;
    JButton buttonFemale;


    CharacterCreationPanel()
    {
        femaleCharacterImage=new ImageIcon("CHARACTER_FEMALE_resized_322_555_repainted.jpg").getImage();
        maleCharacterImage=new ImageIcon("CHARACTER_MALE_resized_322_617_repainted.jpg").getImage();
        maleCharImgT=ImageTransparency.MakeWhiteImageBackgroundTransparent(maleCharacterImage);
        femaleCharImgT=ImageTransparency.MakeWhiteImageBackgroundTransparent(femaleCharacterImage);
        this.setLayout(null);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(1000,1000));
        this.setBackground(new Color(255,255,255));
        //this.setBackground(new Color(93,117,131));
        LoadFemaleButtons();
        LoadButtons();

    }

    public void paint(Graphics g) {
        Graphics2D g2Df= (Graphics2D) g;
        g2Df.drawImage(femaleCharImgT,50,70,null);

        Graphics2D g2Dm= (Graphics2D) g;
        g2Dm.drawImage(maleCharImgT,600,60,null);

        this.buttonMale.repaint();
        this.buttonFemale.repaint();
    }

    public void LoadButtons()
    {
        //Button for male
        buttonMale=new JButton("John");
        buttonMale.setBounds(700,650,130,50);
        buttonMale.setFont(new Font("Ink Free",Font.BOLD,20));
        buttonMale.setFocusPainted(false);
        buttonMale.addActionListener(e->CharacterChoice("John"));
        buttonMale.setVisible(true);
        this.add(buttonMale);


    }

    public void LoadFemaleButtons()
    {

        //Button for female
        buttonFemale=new JButton("Annabeth");
        buttonFemale.setBounds(150,650,130,50);
        buttonFemale.setFont(new Font("Ink Free",Font.BOLD,20));
        buttonFemale.setFocusPainted(false);
        buttonFemale.addActionListener(e->CharacterChoice("Annabeth"));
        buttonFemale.setVisible(true);
        this.add(buttonFemale);
    }

    public void CharacterChoice(String name)
    {

        CharacterCreationFrame topFrame = (CharacterCreationFrame) SwingUtilities.getWindowAncestor(this);//gets the frame in witch this pane exists
        CHARACTER.CharacterAttributes.SetCharacterName(name);
        topFrame.CloseFrame();
        FormManager.LoadGameScreen();
    }




}

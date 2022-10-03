package SCENES;

import FORM_MANAGER.ScreenFrame;
import STATE_MANAGER.StateManager;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Scene2 extends Scene
{
    String state;
    ScreenFrame frame;
    public Scene2(SceneManager sceneManager)
    {
        this.sceneManager=sceneManager;
        this.stateManager=this.sceneManager.stateManager;
        sceneImageIcon=new ImageIcon("C:\\Users\\thana\\Desktop\\CODING\\JAVA\\METHODOLOGIA_PROGRAMMATISMOU_E\\Once Upon A Time\\Graphics\\ScenePictures\\Scene2\\Scene2Image.jpg");
        sceneDescription="As you make your way down the mountain road to your right you spot a bag lying behind a big rock. You pause for a second, contemplating if you should take a closer look or just keep following the path straight ahead of you.\n What do you do?\n";
        this.sceneCommands= new String[] {"Go straight","Use item"};
        Load();
    }

    public void Load()
    {
        state="start";
        frame=new ScreenFrame();
        frame.panel.textPane.setText(sceneDescription);
        frame.panel.textPane.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    command=frame.panel.textPane.getText().substring(frame.panel.textPane.getText().lastIndexOf("\n"));
                    command =command.replaceAll("[\n]",""); //removes \n from our command
                    System.out.println(command);
                    CheckCommand(command);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        frame.panel.label.setIcon(sceneImageIcon);
        frame.panel.Add();
    }

    public void CheckCommand(String command)
    {
        String commandL;
        commandL=command.toLowerCase();
        System.out.println("We are checking");
        System.out.println("The command is: "+command);
        if(state.equals("start"))
        {
            System.out.println("state is start");
            if(commandL.equals("go straight"))
            {
                System.out.println("ALL DONE");
            }
            else if(commandL.equals("move closer")||commandL.equals("go right")||commandL.equals("take bag")||commandL.equals("move to bag")||commandL.equals("move closer to the bag")||commandL.equals("go closer"))
            {
                this.frame.panel.textPane.setText(frame.panel.textPane.getText()+"You move closer to the bag. As you stand above it you see the dug hole beneath it. You understand now that someone must have hidden the bag here some time ago.\nWhat do you do?");
                state="bag";
            }
        }
        else if(state.equals("bag"))
        {
            if(commandL.equals("examine bag")||commandL.equals("examine")||commandL.equals("open bag")||commandL.equals("search bag")||commandL.equals("search"));
            {
                this.frame.panel.textPane.setText(frame.panel.textPane.getText()+"\nYou examine the bag. it seems like its full of food, water and other supplies. Taking the bag would be very helpful since you are running low on food and your water bottle is empty, but the person who hid it here might be very disappointed if they come looking for it.\nWhat do you do?\n");
            }
            if(commandL.equals("take bag")||commandL.equals("pick up bag"))
            {
                this.frame.panel.textPane.setText(this.frame.panel.textPane.getText()+"\nYou feel a slight unease about it but you pick up the bag and store it in your backpack. There was an energy bar, some canned beans and a water bottle inside. You only hope that whoever left it there wont be in need of it. After securing your backpack you face towards the road again.\nWhat do you do?\n");
                stateManager.tookBagInScene2=true;
            }
            else if(commandL.equals("dont take bag")&&stateManager.tookBagInScene2==false)
            {
                this.frame.panel.textPane.setText(this.frame.panel.textPane.getText()+"\nYou decide its best to leave the bag as it is and just move on. Someone hid it here for a reason and you don't feel right taking something that doesn't belong to you. You turn towards the path");
            }
        }



    }

    public static ImageIcon GetSceneIcon()
    {
        return sceneImageIcon;
    }

    public static String GetSceneDescription()
    {
        return sceneDescription;
    }


}

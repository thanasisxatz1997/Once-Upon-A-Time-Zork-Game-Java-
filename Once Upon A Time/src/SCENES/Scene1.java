package SCENES;

import FORM_MANAGER.ScreenFrame;
import PANEL_MANAGER.MapFrame;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Scene1 extends Scene
{
    ScreenFrame frame;

    public Scene1(SceneManager sceneManager)
    {
        this.sceneManager=sceneManager;
        this.stateManager=this.sceneManager.stateManager;
        sceneImageIcon=new ImageIcon("C:\\Users\\thana\\Desktop\\CODING\\JAVA\\METHODOLOGIA_PROGRAMMATISMOU_E\\Once Upon A Time\\Graphics\\ScenePictures\\Scene1\\Scene1Picture.jpg");
        sceneDescription="You feel an immense amount of energy run through your veins, almost jumping up as a featherlight breeze of air touches your face, the sun is up and your excitement is through the roof, a new day waiting for you to trample it. You arrived at the island only a day ago and already managed to climb your way up mount Faroth, you cannot even begin to imagine what the next event in your adventure will be, but you know you are ready for it. You feel glad you made the decision to leave your old life behind for a time, the idling feeling of sitting at a desk just does not suit you. All around you, you see trees, snowy mountaintops, and an unbelievable amount of greenery. Behind you lies your tent, one of the few items you brought with you when you came, it seems like you will be using it a lot in this journey. Beyond your tent is the path you took to climb the mountain after the fisherman brought you ashore. Your bag sits on top of a fallen wooden log to your left about ten meters away from the shore of a glimmering lake. To your right a dense forest full of pine trees, each one stands tall and proud. Ahead of you waits a steep rocky path that will bring you down the mountain and deeper into the island, to the next step of your daring adventure. \nWhat do you do?\n";
        sceneCommands= new String[] {"Go straight","Use item"};
        mapIcon=new ImageIcon("C:\\Users\\thana\\Desktop\\CODING\\JAVA\\METHODOLOGIA_PROGRAMMATISMOU_E\\Once Upon A Time\\Graphics\\ScenePictures\\Scene1\\Scene1Map.png");
        Load();

    }

    public void Load()
    {
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
        if(commandL.equals("go straight"))
        {
            System.out.println("GOING");
            frame.CloseFrame();
            Scene2 scene2=new Scene2(this.sceneManager);
        }
        else if(commandL.equals("map"))
        {
            System.out.println("IN HERE");
            MapFrame mapFrame=new MapFrame(mapIcon);
        }
        else if(commandL.equals("inventory"))
        {

        }
        else
        {
            System.out.println("nope");
        }
    }
}


/*public class Scene1 extends Scene
{
    public Scene1()
    {
        this.sceneImageIcon=new ImageIcon("C:\\Users\\thana\\Desktop\\CODING\\JAVA\\METHODOLOGIA_PROGRAMMATISMOU_E\\Once Upon A Time\\Graphics\\ScenePictures\\Scene1\\Scene1Picture.jpg");
        this.sceneDescription="THIS IS THE DESCRIPTION OF SCENE 1";
        this.sceneCommands= new String[] {"Go straight","Use item"};
        this.Load();
    }

    public static ImageIcon GetSceneIcon()
    {
        return sceneImageIcon;
    }

    public static String GetSceneDescription()
    {
        return sceneDescription;
    }


    public static void checkCommand(String command)
    {
        if(command == "Go straight")
        {
            System.out.println("Going to the next scene");
            Scene2 scene2=new Scene2();
            scene2.Load();
        }
        else
        {
            System.out.println("Using item");
        }
    }
}*/

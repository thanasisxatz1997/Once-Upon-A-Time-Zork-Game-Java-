package SCENES;


import FORM_MANAGER.ScreenFrame;
import STATE_MANAGER.StateManager;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Scene
{
    //public SceneManager sceneManager;

    public String command;
    public SceneManager sceneManager;
    public StateManager stateManager;
    public static ImageIcon sceneImageIcon;
    public static String sceneDescription;
    public String[] sceneCommands;
    public static ImageIcon mapIcon;
}

   /* public void Load()
    {
        sceneManager.currentSceneIcon=this.sceneImageIcon;
        sceneManager.currentSceneDescription=this.sceneDescription;
    }*/

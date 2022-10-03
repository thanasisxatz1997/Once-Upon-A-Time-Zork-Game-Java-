package SCENES;

import FORM_MANAGER.ScreenFrame;
import PANEL_MANAGER.ScenePanel;
import STATE_MANAGER.StateManager;

import javax.swing.*;

public class SceneManager
{
    StateManager stateManager;
    public SceneManager()
    {
        stateManager=new StateManager();
        Scene1 scene1=new Scene1(this);
    }
}

/*    ScreenFrame screenFrame;

    public Scene currentScene;
    public ImageIcon currentSceneIcon;
    public String currentSceneDescription;

    public Scene nextScene;


    public SceneManager()
    {
        Scene scene=new Scene();
        scene.sceneManager=this;

        screenFrame=new ScreenFrame();
        screenFrame.p.sceneManager=this;

        LoadStartingScene();

    }

    public void LoadStartingScene()
    {
        Scene1 scene1=new Scene1();
        scene1.sceneManager=this;
        currentScene=scene1;

        this.currentSceneDescription=scene1.GetSceneDescription();
        this.currentSceneIcon=scene1.GetSceneIcon();
        this.screenFrame.p.LoadScene();

    }*/



package FORM_MANAGER;


import SCENES.SceneManager;
import UI.CharacterCreationFrame;
import UI.MyFrame;

public class FormManager {

    public static void main(String[] args)
    {
        FormManager frmManager=new FormManager();

    }

    public FormManager()
    {
        StartingFormLoad();
    }

    public  void StartingFormLoad()
    {
        UI.MyFrame mainMenuFrame=new UI.MyFrame();
    }

    public static void LoadGameScreen()
    {
        SceneManager sceneManager=new SceneManager();
    }

    public static void CharacterCreationFormLoad()
    {
        UI.CharacterCreationFrame charCreationFrame= new UI.CharacterCreationFrame();
    }

}

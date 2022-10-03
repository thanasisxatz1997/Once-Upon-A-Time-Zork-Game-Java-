package CHARACTER;

import javax.naming.Name;

public class CharacterAttributes {
    public static String name;
    public int age;
    public String mood;
    CharacterAttributes()
    {
        name="";
        age=0;
        mood="";
    }
    public static void SetCharacterName(String name1)
    {
        name=name1;
        System.out.println("Name of our char is: "+name);
    }
}

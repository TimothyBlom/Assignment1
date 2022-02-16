package Armors;

public class BeskarBody {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int strength;
    int dexterity;
    int intelligence;

    public BeskarBody (
            String name,
            int lvlRequired,
            String slot,
            String type,
            int strength,
            int dexterity,
            int intelligence
    ) {
        this.name = name;
        this.lvlRequired = lvlRequired;
        this.slot = slot;
        this.type = type;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public static void main(){
        BeskarBody beskarBody = new BeskarBody(
                "Beskar Body Armor",
                1,
                "Body",
                "Beskar",
                1,
                1,
                1
        );
    }
}

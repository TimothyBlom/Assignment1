package Armors;

public class StealthBody {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int strength;
    int dexterity;
    int intelligence;

    public StealthBody (
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
        StealthBody stealthBody = new StealthBody(
                "Stealth Body Armor",
                1,
                "Body",
                "Stealth",
                1,
                1,
                1
        );
    }
}

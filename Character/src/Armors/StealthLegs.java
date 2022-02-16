package Armors;

public class StealthLegs {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int strength;
    int dexterity;
    int intelligence;

    public StealthLegs (
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
        StealthLegs stealthLegs = new StealthLegs(
                "Stealth Legs Armor",
                1,
                "Leg",
                "Stealth",
                1,
                1,
                1
        );
    }
}

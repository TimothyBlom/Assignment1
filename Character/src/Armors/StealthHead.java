package Armors;

public class StealthHead {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int strength;
    int dexterity;
    int intelligence;

    public StealthHead (
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
        StealthHead stealthHead = new StealthHead(
                "Stealth Head Armor",
                1,
                "Head",
                "Stealth",
                1,
                1,
                1
        );
    }
}

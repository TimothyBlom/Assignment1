package Armors;

public class BeskarLegs {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int strength;
    int dexterity;
    int intelligence;

    public BeskarLegs (
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
        BeskarLegs beskarLegs = new BeskarLegs(
                "Beskar Legs Armor",
                1,
                "Leg",
                "Beskar",
                1,
                1,
                1
        );
    }
}

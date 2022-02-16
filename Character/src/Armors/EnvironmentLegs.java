package Armors;

public class EnvironmentLegs {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int strength;
    int dexterity;
    int intelligence;

    public EnvironmentLegs (
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
        EnvironmentLegs environmentLegs = new EnvironmentLegs(
                "Environment Leg Armor",
                1,
                "Leg",
                "Environment",
                1,
                1,
                1
        );
    }
}

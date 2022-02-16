package Armors;

public class EnvironmentHead {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int strength;
    int dexterity;
    int intelligence;

    public EnvironmentHead (
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
        EnvironmentHead environmentHead = new EnvironmentHead(
                "Environment Head Armor",
                1,
                "Head",
                "Environment",
                1,
                1,
                1
        );
    }
}

package Armors;

public class CommandoHead {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int strength;
    int dexterity;
    int intelligence;

    public CommandoHead (
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
        CommandoHead commandoHead = new CommandoHead(
                "Commando Head Armor",
                1,
                "Head",
                "Commando",
                1,
                1,
                1
        );
    }
}

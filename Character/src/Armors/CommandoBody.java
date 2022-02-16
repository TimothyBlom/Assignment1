package Armors;

public class CommandoBody {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int strength;
    int dexterity;
    int intelligence;

    public CommandoBody (
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
        CommandoBody commandoBody = new CommandoBody(
                "Commando Body Armor",
                1,
                "Body",
                "Commando",
                1,
                1,
                1
        );
    }
}

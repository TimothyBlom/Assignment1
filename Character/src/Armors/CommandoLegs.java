package Armors;

public class CommandoLegs {

        String name;
        int lvlRequired;
        String slot;
        String type;
        int strength;
        int dexterity;
        int intelligence;

        public CommandoLegs (
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
            CommandoLegs commandoLegs = new CommandoLegs(
                    "Commando Leg Armor",
                    1,
                    "Leg",
                    "Commando",
                    1,
                    1,
                    1
            );
        }
}

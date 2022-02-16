public class Class {

    String name;
    int lvlRequired;
    String slot;
    String type;
    int startStrength;
    int startDexterity;
    int startIntelligence;
    int lvlUpStrength;
    int lvlUpDexterity;
    int lvlUpIntelligence;

    public Class (
        String name,
        int lvlRequired,
        String slot,
        String type,
        int startStrength,
        int startDexterity,
        int startIntelligence,
        int lvlUpStrength,
        int lvlUpDexterity,
        int lvlUpIntelligence
    ) {
        this.name = name;
        this.lvlRequired = lvlRequired;
        this.slot = slot;
        this.type = type;
        this.startStrength = startStrength;
        this.startDexterity = startDexterity;
        this.startIntelligence = startIntelligence;
        this.lvlUpStrength = lvlUpStrength;
        this.lvlUpDexterity = lvlUpDexterity;
        this.lvlUpIntelligence = lvlUpIntelligence;
    }

    public static void main(){
        Class equippedClass = new Class (
                "Name",
                1,
                "Head",
                "Beskar",
                1,
                1,
                1,
                1,
                1,
                1
        );
    }
}
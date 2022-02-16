package Classes;

public class Medic {

    String name;
    int startStrength;
    int startDexterity;
    int startIntelligence;
    int lvlUpStrength;
    int lvlUpDexterity;
    int lvlUpIntelligence;

    public Medic (
            String name,
            int startStrength,
            int startDexterity,
            int startIntelligence,
            int lvlUpStrength,
            int lvlUpDexterity,
            int lvlUpIntelligence
    ) {
        this.name = name;
        this.startStrength = startStrength;
        this.startDexterity = startDexterity;
        this.startIntelligence = startIntelligence;
        this.lvlUpStrength = lvlUpStrength;
        this.lvlUpDexterity = lvlUpDexterity;
        this.lvlUpIntelligence = lvlUpIntelligence;
    }

    public static void main(){
        Medic medic = new Medic(
                "Medic",
                2,
                7,
                1,
                1,
                5,
                1
        );
    }
}

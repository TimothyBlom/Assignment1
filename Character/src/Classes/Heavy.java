package Classes;

public class Heavy {

    String name;
    int startStrength;
    int startDexterity;
    int startIntelligence;
    int lvlUpStrength;
    int lvlUpDexterity;
    int lvlUpIntelligence;

    public Heavy (
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
        Heavy heavy = new Heavy(
                "Heavy",
                5,
                2,
                1,
                3,
                2,
                1
        );
    }
}

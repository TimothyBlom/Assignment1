package Classes;

public class Engineer {

    String name;
    int startStrength;
    int startDexterity;
    int startIntelligence;
    int lvlUpStrength;
    int lvlUpDexterity;
    int lvlUpIntelligence;

    public Engineer (
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
        Engineer engineer = new Engineer(
                "Engineer",
                1,
                1,
                8,
                1,
                4,
                5
        );
    }
}

package Classes;

public class Sniper {

    String name;
    int startStrength;
    int startDexterity;
    int startIntelligence;
    int lvlUpStrength;
    int lvlUpDexterity;
    int lvlUpIntelligence;

    public Sniper (
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
        Sniper sniper = new Sniper(
                "Name",
                2,
                6,
                1,
                1,
                4,
                1
        );
    }
}

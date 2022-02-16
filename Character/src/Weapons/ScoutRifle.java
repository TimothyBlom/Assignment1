package Weapons;

public class ScoutRifle {

    String name;
    int lvlRequired;
    String slot;
    int damage;
    int speed;

    public ScoutRifle (
            String name,
            int lvlRequired,
            String slot,
            int damage,
            int speed
    ) {
        this.name = name;
        this.lvlRequired = lvlRequired;
        this.slot = slot;
        this.damage = damage;
        this.speed = speed;
    }

    public static void main(){
        ScoutRifle scoutRifle = new ScoutRifle(
                "Scout Rifle",
                1,
                "Weapon",
                1,
                1
        );
    }
}

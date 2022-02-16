package Weapons;

public class Knive {

    String name;
    int lvlRequired;
    String slot;
    int damage;
    int speed;

    public Knive (
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
        Knive knive = new Knive(
                "Knive",
                1,
                "Weapon",
                1,
                1
        );
    }
}

package Weapons;

public class Pistol {

    String name;
    int lvlRequired;
    String slot;
    int damage;
    int speed;

    public Pistol (
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
        Pistol pistol = new Pistol(
                "Pistol",
                1,
                "Weapon",
                1,
                1
        );
    }
}

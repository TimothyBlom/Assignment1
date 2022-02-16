package Weapons;

public class Shotgun {

    String name;
    int lvlRequired;
    String slot;
    int damage;
    int speed;

    public Shotgun (
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
        Shotgun Shotgun = new Shotgun(
                "Shotgun",
                1,
                "Weapon",
                1,
                1
        );
    }
}

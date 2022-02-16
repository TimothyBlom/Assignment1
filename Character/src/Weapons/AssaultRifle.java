package Weapons;

public class AssaultRifle {

    String name;
    int lvlRequired;
    String slot;
    int damage;
    int speed;

    public AssaultRifle (
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
        AssaultRifle assaultRifle = new AssaultRifle(
                "Assault Rifle",
                1,
                "Weapon",
                1,
                1
        );
    }
}

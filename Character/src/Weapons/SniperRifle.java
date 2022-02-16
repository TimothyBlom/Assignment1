package Weapons;

public class SniperRifle {

    String name;
    int lvlRequired;
    String slot;
    int damage;
    int speed;

    public SniperRifle (
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
        SniperRifle sniperRifle = new SniperRifle(
                "Sniper Rifle",
                1,
                "Weapon",
                1,
                1
        );
    }
}

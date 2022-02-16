package Weapons;

public class LightMachineGun {

    String name;
    int lvlRequired;
    String slot;
    int damage;
    int speed;

    public LightMachineGun (
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
        LightMachineGun lightMachineGun = new LightMachineGun(
                "Light Machine Gun",
                1,
                "Weapon",
                1,
                1
        );
    }
}

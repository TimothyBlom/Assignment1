public class Weapon {

    String name;
    int lvlRequired;
    String slot;
    int damage;
    int speed;

    public Weapon (
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
        Weapon equippedWeapon = new Weapon (
                "Name",
                1,
                "Weapon",
                1,
                1
        );

        System.out.println(equippedWeapon.name);
    }
}
public class Character {

    String Name;
    String CharacterClass;
    String Level;
    String EquippedWeapon;
    String EquippedHeadArmour;
    String EquippedBodyArmour;
    String EquippedLegArmour;
    String Strength;
    String Dexterity;
    String Intelligence;
    String BasePrimaryAttributes;
    String TotalPrimaryAttributes;
    String DPS;

    public Character(
            String Name,
            String CharacterClass,
            String Level,
            String EquippedWeapon,
            String EquippedHeadArmour,
            String EquippedBodyArmour,
            String EquippedLegArmour,
            String Strength,
            String Dexterity,
            String Intelligence,
            String BasePrimaryAttributes,
            String TotalPrimaryAttributes,
            String DPS
    ){
        this.Name = Name;
        this.CharacterClass = CharacterClass;
        this.Level = Level;
        this.EquippedWeapon = EquippedWeapon;
        this.EquippedHeadArmour = EquippedHeadArmour;
        this.EquippedBodyArmour = EquippedBodyArmour;
        this.EquippedLegArmour = EquippedLegArmour;
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Intelligence = Intelligence;
        this.BasePrimaryAttributes = BasePrimaryAttributes;
        this.TotalPrimaryAttributes = TotalPrimaryAttributes;
        this.DPS = DPS;
    }

    public String getName() {
        return Name;
    };
    public String getCharacterClass() {
        return CharacterClass;
    };
    public String getLevel() {
        return Level;
    };
    public String getEquippedWeapon() {
        return EquippedWeapon;
    };
    public String getEquippedHeadArmour() {
        return EquippedHeadArmour;
    };
    public String getEquippedBodyArmour() {
        return EquippedBodyArmour;
    };
    public String getEquippedLegArmour() {
        return EquippedLegArmour;
    };
    public String getStrength() {
        return Strength;
    };
    public String getDexterity() {
        return Dexterity;
    };
    public String getIntelligence() {
        return Intelligence;
    };
    public String getBasePrimaryAttributes() {
        return BasePrimaryAttributes;
    };
    public String getTotalPrimaryAttributes() {
        return TotalPrimaryAttributes;
    };
    public String getDPS() {
        return DPS;
    };

    public static void main(String[] args) {

        Character player = new Character(
                "Tim",
                "Sniper",
                "1",
                "Assault Rifle Name",
                "Beskar Helmet",
                "Beskar Body Armor",
                "Beskar Pants",
                "1",
                "1",
                "1",
                "1",
                "2",
                "1"
        );

        System.out.println("Name: " + player.getName());
        System.out.println("Class: " + player.getCharacterClass());
        System.out.println("Level: " + player.getLevel());
        System.out.println("Equipped weapon: " + player.getEquippedWeapon());
        System.out.println("Helmet: " + player.getEquippedHeadArmour());
        System.out.println("Body armour: " + player.getEquippedBodyArmour());
        System.out.println("Leg armour: " + player.getEquippedLegArmour());
        System.out.println("Strength points: " + player.getStrength());
        System.out.println("Dexterity points: " + player.getDexterity());
        System.out.println("Intelligence points: " + player.getIntelligence());
        System.out.println("Base primary attribute points: " + player.getBasePrimaryAttributes());
        System.out.println("Total primary attribute points: " + player.getTotalPrimaryAttributes());
        System.out.println("Total DPS: " + player.getDPS());
        TestClass.TestMethod();

    }
}
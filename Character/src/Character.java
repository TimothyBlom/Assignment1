public class Character {

    String Name;
    String CharacterClass;
    int Level;
    String EquippedWeaponType;
    int EquippedWeaponDPS;
    String EquippedHeadArmor;
    int HeadArmorStrength;
    int HeadArmorDexterity;
    int HeadArmorIntelligence;
    String EquippedBodyArmor;
    int BodyArmorStrength;
    int BodyArmorDexterity;
    int BodyArmorIntelligence;
    String EquippedLegArmor;
    int LegArmorStrength;
    int LegArmorDexterity;
    int LegArmorIntelligence;
    int CharacterStrength;
    int CharacterDexterity;
    int CharacterIntelligence;
    int BasePrimaryAttributes;
    int TotalPrimaryAttributes;
    int DPS;

    public Character(
        String Name,
        String CharacterClass,
        int Level,
        String EquippedWeaponType,
        int EquippedWeaponDPS,
        String EquippedHeadArmor,
        int HeadArmorStrength,
        int HeadArmorDexterity,
        int HeadArmorIntelligence,
        String EquippedBodyArmor,
        int BodyArmorStrength,
        int BodyArmorDexterity,
        int BodyArmorIntelligence,
        String EquippedLegArmor,
        int LegArmorStrength,
        int LegArmorDexterity,
        int LegArmorIntelligence,
        int CharacterStrength,
        int CharacterDexterity,
        int CharacterIntelligence,
        int BasePrimaryAttributes,
        int TotalPrimaryAttributes,
        int DPS
    ){
        this.Name = Name;
        this.CharacterClass = CharacterClass;
        this.Level = Level;
        this.EquippedWeaponType = EquippedWeaponType;
        this.EquippedWeaponDPS = EquippedWeaponDPS;
        this.EquippedHeadArmor = EquippedHeadArmor;
        this.HeadArmorStrength = HeadArmorStrength;
        this.HeadArmorDexterity = HeadArmorDexterity;
        this.HeadArmorIntelligence = HeadArmorIntelligence;
        this.EquippedBodyArmor = EquippedBodyArmor;
        this.BodyArmorStrength = BodyArmorStrength;
        this.BodyArmorDexterity = BodyArmorDexterity;
        this.BodyArmorIntelligence = BodyArmorIntelligence;
        this.EquippedLegArmor = EquippedLegArmor;
        this.LegArmorStrength = LegArmorStrength;
        this.LegArmorDexterity = LegArmorDexterity;
        this.LegArmorIntelligence = LegArmorIntelligence;
        this.CharacterStrength = CharacterStrength;
        this.CharacterDexterity = CharacterDexterity;
        this.CharacterIntelligence = CharacterIntelligence;
        this.BasePrimaryAttributes = BasePrimaryAttributes;
        this.TotalPrimaryAttributes = TotalPrimaryAttributes;
        this.DPS = DPS;
    }

    public static void main(String[] args) {

        Character player = new Character(
                "Tim",
                "Heavy",
                1,
                "Assault Rifle",
                0,
                "Beskar Helmet",
                0,
                0,
                0,
                "Beskar Body Armor",
                0,
                0,
                0,
                "Beskar Pants",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0
        );

        int CharacterStartStrength = 0;
        int CharacterStartDexterity = 0;
        int CharacterStartIntelligence = 0;

        //starts player with the appropriate amount of attribute points based on character class
        if (player.CharacterClass.equals("Engineer")) {
            CharacterStartStrength = player.CharacterStrength + 1;
            CharacterStartDexterity = player.CharacterDexterity + 1;
            CharacterStartIntelligence = player.CharacterIntelligence + 8;
        } else if (player.CharacterClass.equals("Medic")) {
            CharacterStartStrength = player.CharacterStrength + 2;
            CharacterStartDexterity = player.CharacterDexterity + 7;
            CharacterStartIntelligence = player.CharacterIntelligence + 1;
        } else if (player.CharacterClass.equals("Sniper")) {
            CharacterStartStrength = player.CharacterStrength + 2;
            CharacterStartDexterity = player.CharacterDexterity + 6;
            CharacterStartIntelligence = player.CharacterIntelligence + 1;
        } else if (player.CharacterClass.equals("Heavy")) {
            CharacterStartStrength = player.CharacterStrength + 5;
            CharacterStartDexterity = player.CharacterDexterity + 2;
            CharacterStartIntelligence = player.CharacterIntelligence + 1;
        }

        int CharacterStrength = CharacterStartStrength;
        int CharacterDexterity = CharacterStartDexterity;
        int CharacterIntelligence = CharacterStartIntelligence;

        //adds appropriate amount of attribute points based on character level and class
        for (int i = 2; i <= player.Level; ++i) {
            if (player.CharacterClass.equals("Engineer")) {
                CharacterStrength = CharacterStrength + 1;
                CharacterDexterity = CharacterDexterity + 4;
                CharacterIntelligence = CharacterIntelligence + 5;
                System.out.println("ENGINEER CLASS LEVELD UP");
            } else if (player.CharacterClass.equals("Medic")) {
                CharacterStrength = CharacterStrength + 1;
                CharacterDexterity = CharacterDexterity + 5;
                CharacterIntelligence = CharacterIntelligence + 1;
                System.out.println("MEDIC CLASS LEVELD UP");
            } else if (player.CharacterClass.equals("Sniper")) {
                CharacterStrength = CharacterStrength + 1;
                CharacterDexterity = CharacterDexterity + 4;
                CharacterIntelligence = CharacterIntelligence + 1;
                System.out.println("SNIPER CLASS LEVELD UP");
            } else if (player.CharacterClass.equals("Heavy")) {
                CharacterStrength = CharacterStrength + 3;
                CharacterDexterity = CharacterDexterity + 2;
                CharacterIntelligence = CharacterIntelligence + 1;
                System.out.println("HEAVY CLASS LEVELD UP " + CharacterStrength);
            }
        }

        //Makes base attribute same value as the class specific primary attribute.
        int BaseAttributePoints = 0;
        int HeadAttributePoints = 0;
        int BodyAttributePoints = 0;
        int LegAttributePoints = 0;

        if (player.CharacterClass.equals("Engineer")) {
            BaseAttributePoints = CharacterIntelligence;
            HeadAttributePoints = player.HeadArmorIntelligence;
            BodyAttributePoints = player.BodyArmorIntelligence;
            LegAttributePoints = player.LegArmorIntelligence;
        } else if (player.CharacterClass.equals("Medic")){
            BaseAttributePoints = CharacterDexterity;
            HeadAttributePoints = player.HeadArmorDexterity;
            BodyAttributePoints = player.BodyArmorDexterity;
            LegAttributePoints = player.LegArmorDexterity;
        } else if (player.CharacterClass.equals("Sniper")){
            BaseAttributePoints = CharacterDexterity;
            HeadAttributePoints = player.HeadArmorDexterity;
            BodyAttributePoints = player.BodyArmorDexterity;
            LegAttributePoints = player.LegArmorDexterity;
        } else if (player.CharacterClass.equals("Heavy")){
            BaseAttributePoints = CharacterStrength;
            HeadAttributePoints = player.HeadArmorStrength;
            BodyAttributePoints = player.BodyArmorStrength;
            LegAttributePoints = player.LegArmorStrength;
        }

        //Calculates total amount of primary attribute points by adding attribute points from base and armor.
        int totalPrimaryAttributes = BaseAttributePoints + HeadAttributePoints + BodyAttributePoints + LegAttributePoints;

        //Calculates total character DPS by adding base character DPS with Weapon DPS.
        int characterDPS = player.EquippedWeaponDPS + player.DPS;

        //character sheet
        System.out.println("Name: " + player.Name);
        System.out.println("Class: " + player.CharacterClass);
        System.out.println("Level: " + player.Level);
        System.out.println("Equipped weapon name: " + player.EquippedWeaponType);
        System.out.println("Helmet: " + player.EquippedHeadArmor);
        System.out.println("Body armour: " + player.EquippedBodyArmor);
        System.out.println("Leg armour: " + player.EquippedLegArmor);
        System.out.println("Strength points: " + CharacterStrength);
        System.out.println("Dexterity points: " + CharacterDexterity);
        System.out.println("Intelligence points: " + CharacterIntelligence);
        System.out.println("Base primary attribute points: " + BaseAttributePoints);
        System.out.println("Total primary attribute points: " + totalPrimaryAttributes);
        System.out.println("Total character DPS: " + characterDPS);
        ClassMedic.Medic(); //delete this

    }
}
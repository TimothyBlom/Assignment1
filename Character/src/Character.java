public class Character {

    String Name;
    String CharacterClass;
    int Level;
    String EquippedWeaponType;
    int EquippedWeaponDamage;
    int EquippedWeaponSpeed;
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
        int EquippedWeaponDamage,
        int EquippedWeaponSpeed,
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
        this.EquippedWeaponDamage = EquippedWeaponDamage;
        this.EquippedWeaponSpeed = EquippedWeaponSpeed;
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

    public static void main(String[] args) throws Exception {

//Bellow is where you can change certain settings and see the magic happen.
//Try changing the class to either Heavy, Sniper, Medic or engineer.
//Try changing the level.
//Try changing armor types to either Beskar, Stealth, Commando or Environment.

        Character player = new Character(
                "Tim",
                "Heavy",
                2,
                "Assault Rifle",
                3,
                2,
                "Commando",
                1,
                1,
                1,
                "Beskar",
                1,
                1,
                1,
                "Beskar",
                1,
                1,
                1,
                0,
                0,
                0,
                0,
                0,
                0
        );

//Code from this line to line 188 focus on the interaction of character stats with each other

//starts player with the appropriate amount of attribute points based on character class
        int CharacterStartStrength = 0;
        int CharacterStartDexterity = 0;
        int CharacterStartIntelligence = 0;

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

//Adds appropriate amount of attribute points based on character level and class
        int CharacterStrength = CharacterStartStrength;
        int CharacterDexterity = CharacterStartDexterity;
        int CharacterIntelligence = CharacterStartIntelligence;

        for (int i = 2; i <= player.Level; ++i) {
            if (player.CharacterClass.equals("Engineer")) {
                CharacterStrength = CharacterStrength + 1;
                CharacterDexterity = CharacterDexterity + 4;
                CharacterIntelligence = CharacterIntelligence + 5;
            } else if (player.CharacterClass.equals("Medic")) {
                CharacterStrength = CharacterStrength + 1;
                CharacterDexterity = CharacterDexterity + 5;
                CharacterIntelligence = CharacterIntelligence + 1;
            } else if (player.CharacterClass.equals("Sniper")) {
                CharacterStrength = CharacterStrength + 1;
                CharacterDexterity = CharacterDexterity + 4;
                CharacterIntelligence = CharacterIntelligence + 1;
            } else if (player.CharacterClass.equals("Heavy")) {
                CharacterStrength = CharacterStrength + 3;
                CharacterDexterity = CharacterDexterity + 2;
                CharacterIntelligence = CharacterIntelligence + 1;
            }
        }

//Makes base attribute same value as the class specific primary attribute.
        int BaseAttributePoints = 0;

        if (player.CharacterClass.equals("Engineer")) {
            BaseAttributePoints = CharacterIntelligence;
        } else if (player.CharacterClass.equals("Medic") || player.CharacterClass.equals("Sniper")){
            BaseAttributePoints = CharacterDexterity;
        } else if (player.CharacterClass.equals("Heavy")){
            BaseAttributePoints = CharacterStrength;
        }

        int totalArmorAttributes =
                player.HeadArmorStrength +
                player.HeadArmorDexterity +
                player.HeadArmorIntelligence +
                player.BodyArmorStrength +
                player.BodyArmorDexterity +
                player.BodyArmorIntelligence +
                player.LegArmorStrength +
                player.LegArmorDexterity +
                player.LegArmorIntelligence;

//Calculates total amount of primary attribute points by adding base attribute points and all armor attribute points.
        int totalPrimaryAttributes = BaseAttributePoints + totalArmorAttributes;

//Calculates weapon DPS from weapon damage and speed
        int weaponDPS = player.EquippedWeaponDamage * player.EquippedWeaponSpeed;

//Calculates total character DPS by adding base character DPS with Weapon DPS. (It is supposed to be 100, not 10, but that is unbalanced and always returns 0)
        int characterDPS = weaponDPS * (1 + totalPrimaryAttributes/10);

//Checks if armour type and class are compatible and throws exception with explanation if not
//Note: This is probably not DRY, I know.
        if (        player.CharacterClass.equals("Sniper") && !player.EquippedHeadArmor.equals("Stealth") ){
                        throw new Exception(player.EquippedHeadArmor + " head armor is not compatible with the Sniper class. Please choose Stealth");
        } else if ( player.CharacterClass.equals("Sniper") && !player.EquippedBodyArmor.equals("Stealth") ){
                        throw new Exception(player.EquippedBodyArmor + " body armor is not compatible with the Sniper class. Please choose Stealth");
        } else if ( player.CharacterClass.equals("Sniper") && !player.EquippedLegArmor.equals("Stealth") ) {
                        throw new Exception(player.EquippedLegArmor + " leg armor is not compatible with the Sniper class. Please choose Stealth");
        } else if ( (player.CharacterClass.equals("Heavy") && !player.EquippedHeadArmor.equals("Beskar")) &&
                    (player.CharacterClass.equals("Heavy") && !player.EquippedHeadArmor.equals("Commando")) ){
                        throw new Exception(player.EquippedHeadArmor + " head armor is not compatible with the Heavy class. Please choose Beskar or Commando");
        } else if ( (player.CharacterClass.equals("Heavy") && !player.EquippedBodyArmor.equals("Beskar")) &&
                    (player.CharacterClass.equals("Heavy") && !player.EquippedBodyArmor.equals("Commando")) ){
                        throw new Exception(player.EquippedBodyArmor + " body armor is not compatible with the Heavy class. Please choose Beskar or Commando");
        } else if ( (player.CharacterClass.equals("Heavy") && !player.EquippedLegArmor.equals("Beskar")) &&
                    (player.CharacterClass.equals("Heavy") && !player.EquippedLegArmor.equals("Commando")) ){
                        throw new Exception(player.EquippedLegArmor + " leg armor is not compatible with the Heavy class. Please choose Beskar or Commando");
        } else if ( (player.CharacterClass.equals("Engineer") && !player.EquippedHeadArmor.equals("Commando")) &&
                    (player.CharacterClass.equals("Engineer") && !player.EquippedHeadArmor.equals("Environment")) ){
                        throw new Exception(player.EquippedHeadArmor + " head armor is not compatible with the Engineer class. Please choose Environment or Commando");
        } else if ( (player.CharacterClass.equals("Engineer") && !player.EquippedBodyArmor.equals("Commando")) &&
                    (player.CharacterClass.equals("Engineer") && !player.EquippedBodyArmor.equals("Environment")) ){
                        throw new Exception(player.EquippedBodyArmor + " body armor is not compatible with the Engineer class. Please choose Environment or Commando");
        } else if ( (player.CharacterClass.equals("Engineer") && !player.EquippedLegArmor.equals("Commando")) &&
                    (player.CharacterClass.equals("Engineer") && !player.EquippedLegArmor.equals("Environment")) ){
                        throw new Exception(player.EquippedLegArmor + " leg armor is not compatible with the Engineer class. Please choose Environment or Commando");
        } else if ( (player.CharacterClass.equals("Medic") && !player.EquippedHeadArmor.equals("Commando")) &&
                    (player.CharacterClass.equals("Medic") && !player.EquippedHeadArmor.equals("Environment")) ){
                        throw new Exception(player.EquippedHeadArmor + " head armor is not compatible with the Medic class. Please choose Environment or Commando");
        } else if ( (player.CharacterClass.equals("Medic") && !player.EquippedBodyArmor.equals("Commando")) &&
                    (player.CharacterClass.equals("Medic") && !player.EquippedBodyArmor.equals("Environment")) ){
                        throw new Exception(player.EquippedBodyArmor + " body armor is not compatible with the Medic class. Please choose Environment or Commando");
        } else if ( (player.CharacterClass.equals("Medic") && !player.EquippedLegArmor.equals("Commando")) &&
                    (player.CharacterClass.equals("Medic") && !player.EquippedLegArmor.equals("Environment")) ){
                        throw new Exception(player.EquippedLegArmor + " leg armor is not compatible with the Medic class. Please choose Environment or Commando");
        }

//Character sheet
        System.out.println("Name: " + player.Name);
        System.out.println("Class: " + player.CharacterClass);
        System.out.println("Level: " + player.Level);
        System.out.println("Equipped weapon type: " + player.EquippedWeaponType);
        System.out.println("Equipped helmet armor type: " + player.EquippedHeadArmor);
        System.out.println("Equipped body armor type: " + player.EquippedBodyArmor);
        System.out.println("Equipped leg armor type: " + player.EquippedLegArmor);
        System.out.println("Character strength points: " + CharacterStrength);
        System.out.println("Character dexterity points: " + CharacterDexterity);
        System.out.println("Character intelligence points: " + CharacterIntelligence);
        System.out.println("Base primary attribute points: " + BaseAttributePoints);
        System.out.println("Total primary attribute points: " + totalPrimaryAttributes);
        System.out.println("Total character DPS: " + characterDPS);
        Weapon.main();

    }
}
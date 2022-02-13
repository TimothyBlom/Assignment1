Assignment 1: JAVA RPG Characters.

By: Timothy Blom

For this assignment, as I understand it, I need to build a system where you can customise a RPG character. The 
character has stats and equipment that compliment eachother (for example, updating character level increases 
character attributes), and equipment can be character class specific.

No character sheets or any front-end is required for this assignment, the code will be tested via user testing.

Code wise, all I need to do is make classes with values that sometimes effect eachother when put together, and
to test it with user testing. A lot of time and effort has gone in understanding the "game rules" from the 
Assignment1_JAVA_RPGCharacters.pdf, I am assuming learning and figuring out how this "game" works before actual 
coding it is a big part of the assignment and supposed to take a few days.

I have also taken the liberty to change the names given in the PDF for my own amusement (permission was granted).





Goals for this assignment------------------------------------------------------------------------------------------
-To create a player, character classes, weapons and armors.
-Player loadout and level can change player attributes & DPS.
-Some loadout options are restricted to a certain class or level.
-Functionalaty can be tested through user testing.





What I need to make------------------------------------------------------------------------------------------------
Player character with the following values:
-Name
-Class
-Level
-Equiped weapon
-Equiped head armour
-Equiped body armour
-Equiped legs armour
-Strenght (based on class & level)
-Dexterity (based on class & level)
-Intelligence (based on class & level)
-Base primary attributes (based on class specific primary attribute)
-Total primary attributes (based on base primary attributes & equiped armour attributes)
-Character DPS (based on equiped weapon DPS & total primary attributes)

Weapon types:
-Pistol
-Assault rifle
-Shotgun
-Light machine guns
-Sniper
-Scout rifle
-Knife

Each weapon has the following values:
-Name
-Weapon type
-Item slot
-Required character level
-Damage
-Attack speed
-DPS (based an damage & attack speed)

Armor:
-Stealth (usable only to Sniper class) (lore: near invisible but minimal protection)
-Enviroment (usable only for Engineer & Medic class) (lore: protect user against enviromental dangers)
-Commando (usable only for Heavy , Engineer & Medic classes) (lore: best all arround damage protection)
-Beskar plating (usable only for Heavy class) (lore: indestructable but flashy)

Each armor has the following values:
-Name
-Armor type
-Item slot
-Required character level
-Strenght bonus
-Dexterity bonus
-Intelligence bonus





Classes---------------------------------------------------------------------------------------------------------
-Engineer
-Medic
-Sniper
-Heavy




Attributes per class--------------------------------------------------------------------------------------------
Engineer:
-Level one attribute = 1 Strenght, 1 Dexterity, 8 Intelligence.
-Increase per lvl-up = 1 Strenght, 4 Dexterity, 5 Intelligence.
-Primary attribute is Intelligence

Medic:
-Level one attribute = 2 Strenght, 7 Dexterity, 1 Intelligence.
-Increase per lvl-up = 1 Strenght, 5 Dexterity, 1 Intelligence.
-Primary attribute is Dexterity

Sniper:
-Level one attribute = 2 Strenght, 6 Dexterity, 1 Intelligence.
-Increase per lvl-up = 1 Strenght, 4 Dexterity, 1 Intelligence.
-Primary attribute is Dexterity

Heavy:
-Level one attribute = 5 Strenght, 2 Dexterity, 1 Intelligence.
-Increase per lvl-up = 3 Strenght, 2 Dexterity, 1 Intelligence.
-Primary attribute is Strenght






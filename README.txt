Assignment 1: Java RPG Character								By Timothy Blom

For this assignment, as I understand it, I need to build a system where you can customise a RPG character. The 
character has stats and items that can effect eachother.

No character sheets or any front-end is required for this assignment. I have also taken the liberty to change the 
names given in the PDF for my own amusement (permission was granted).

How To Use---------------------------------------------------------------------------------------------------------
-Open the Character file in Intelij.
-Go to line 87.
-From there, change the class, level or armour type as described in the commenting above it.
-Run the code, the stats will be printed to the console.

Note: The classes for the weapons, armour and character classes are there, just not implemented inside 
the character class. Also unit testing is not completed. I ran out of time to figure out how those work.


To make it simple, below are the "rules" of the RPG system and the names, for refrence.


Classes-----------------------------------------------------------------------------------------------------------
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
-Environment (usable only for Engineer & Medic class) (lore: protect user against enviromental dangers)
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


Classes:
-Engineer
-Medic
-Sniper
-Heavy

Attributes per class:
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
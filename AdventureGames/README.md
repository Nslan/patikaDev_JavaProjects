

# Adventure Game

#### text based adventure game with java

###### CHARACTERS

![Karakterler](https://user-images.githubusercontent.com/107987193/183002343-cb96ec1c-d474-4f8a-a998-fe5222969a6b.png)


###### MONSTERS
![Canavarlar](https://user-images.githubusercontent.com/107987193/183002366-d158f37d-862e-4c9d-ab5d-0beb02407729.png)



###### WEAPONS
![Silahlar](https://user-images.githubusercontent.com/107987193/183002496-2f7d93ac-d277-41be-ab8e-0e7f07c218c4.png)





###### ARMORS
![Zırhlar](https://user-images.githubusercontent.com/107987193/183002394-e5c6a53a-d926-4115-85f7-0955ec5c0f5b.png)



### _PLACES_


Safe House


Feature : Renewing Life


### _Cave_


Monster: Zombie (1-3 Pieces)


Attribute: War + Loot


Item : Food


### _Forest_


Monster: Vampire (1-3 Pieces)


Attribute: War + Loot


Item: Wood (Firewood)


### _River_


Monster : Bear (1-3 Pieces)


Attribute: War + Loot


Item: Water (Water)


### _Shopping centre_

Feature : Buying Supporting Items


Weapons: Pistol, Sword, Rifle


Armor: Light, Medium, Heavy




###### UML
![oyun class-diagram](https://user-images.githubusercontent.com/107987193/183002408-e273e049-18e4-4b80-b283-c281bdbca547.jpg)


# _GAME EXPRESSION_

The game is actually based on 2 main classes: Player , Location

                        GAME
                        / \
                Player Location

the game is started
The player has inventory , damage , health , money and name

player chooses a character when starting the game, create a separate class for characters (add this to uml too)

Characters have their own unique id, name, damage, health and money.

These property values ​​of the selected character are assigned to the player.

player initial inventories: water, food, wood, weapon type, armor type




Location has a name and location has a player.
You need to know what location you are in.
Let's know what I'm doing in that place, use the onLocation method for this.
no object should be created from the location class
(abtract class onlocation must be abstract every location
it should overiride according to itself)

We have gathered the locations under 2 classes as places to fight and safe places.
this is war and two classes called normal place
Objects cannot be created from these
These locations include houses, shops, rivers, forests, caves.
they have venues

safe mode first
the shop has weapons and armors

weapon: has name, id, damage, price

armor: has name, id, blocking, price

fighting in the battle class will happen
All battle locations will have to have various types and numbers of monsters
these monsters themselves have special values


normal locations safe locations are home and shop
there will be shopping transactions in the store

### Additions

1 - In order to finish the game, after all the enemies in the war zones are cleared, the zone-specific reward must be added to the player's inventory. If the player can collect all the prizes and return to the "Safe House", they win the game. In addition, it is not possible to re-enter the region where the award was won.

Regional Awards:

Cave => Food

Forest => Wood (Firewood)

River => Water

2 - 50% chance to determine who will make the first move when the player encounters a monster. (Always the player to hit first in the current situation)

3 - A new war zone should be added. The purpose of this zone is to have a chance to randomly earn money, weapons or armor from defeated opponents.

Region Name : Mine

Monster: Snake (1-5 Pieces)

Feature : War and Loot

Item: Money, Weapon or Armor

Snake Features:

ID: 4

DAMAGE: Random (between 3 and 6)

HEALTH: 12

MONEY: None (Probability of gaining items instead)

Items dropped from a defeated opponent:

Weapon Chance: 15%

Rifle Chance of Winning: 20%

Sword Probability: 30%

Pistol Chance of Winning: 50%

Armor Chance: 15%

Chance to Gain Heavy Armor: 20%

Medium Armor Chance: 30%

Light Armor Chance: 50%

Chance of Making Money : 25%

10 Chances of Winning: 20%

5 Chances of Making Money: 30%

1 Chance of Winning: 50%

Chances of not winning anything: 45%


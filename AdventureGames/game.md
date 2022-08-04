
# Adventure Game

#### text based adventure game with java

###### CHARACTERS
![](../../../../Desktop/patika Java 102/12-OYUN/Karakterler.png)


###### MONSTERS
![](../../../../Desktop/patika Java 102/12-OYUN/Canavarlar.png)


###### WEAPONS
![](../../../../Desktop/patika Java 102/12-OYUN/Silahlar.png)



###### ARMORS
![](../../../../Desktop/patika Java 102/12-OYUN/Zırhlar.png)


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
![](../../../../Desktop/patika Java 102/12-OYUN/oyun class-diagram.jpg)

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




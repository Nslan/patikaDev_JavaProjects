package AdventureGames;

import java.util.Scanner;

public class Player {

    private int damage , health , money ;
    private String playerName, characterName;
    private Scanner scann = new Scanner(System.in);

    private Inventory inventory;

    private int orjinalHealth;


    public Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new Inventory();
    }



    public void selectCharacter(){

       Characters[] characterList = {new Samurai() , new Archer() , new Knight() };

       //System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println( Colors.YELLOW_BOLD + "-------------Characters---------------" + Colors.RESET );
        for ( Characters gameCharacter : characterList ) {
            System.out.println( Colors.GREEN + "\nCharacter : " + gameCharacter.getCharacterName()
                    + " \tDamage : " + gameCharacter.getDamage()
                    + "\tHealth : "+gameCharacter.getHealth()
                    + "\tMoney : " + gameCharacter.getMoney() + Colors.RESET
            );
        }

        System.out.println(Colors.YELLOW_BOLD + "\n\t\t\tSamurai : 1" + "\tArcher : 2" + "\tKnight : 3" + Colors.RESET );
        //System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("\nSelect a charecter : ");
        int selectCharacter = scann.nextInt();
        System.out.println( Colors.BLACK+ "\ncharacter running..."+ Colors.RESET );
        System.out.println( Colors.BLACK+ "please wait..."+ Colors.RESET );
        switch ( selectCharacter ){

            case 1 :
                initPlayer(  new Samurai()  );
                break;
            case 2 :
                initPlayer(  new Archer()  );
                break;
            case 3 :
                initPlayer(  new Knight()  );
                break;
            default:
                initPlayer(  new Samurai()  );
                break;
        }

    }

    //the values of the selected character should be assigned to the player
    public void initPlayer( Characters characterObject ){
        this.setDamage( characterObject.getDamage() );
        this.setHealth( characterObject.getHealth() );
        this.setMoney(  characterObject.getMoney()  );
        this.setCharacterName( characterObject.getCharacterName() );
        this.setOrjinalHealth( characterObject.getHealth() );
    }

    public void showPlayerInfo(){
                System.out.println(Colors.WHITE_BOLD_BRIGHT + "\nYours Character : \tWeapon :" + this.getInventory().getSelectedWeaponObject().getWeaponName()
                                + " ,\tArmor : " + this.getInventory().getSelectedArmorObject().getArmorName()
                                + " ,\tBlock : " + this.getInventory().getSelectedArmorObject().getBlock()
                                + " ,\tHealth : " + this.getHealth()
                                + " ,\tDamage : " + this.getTotalDamage()
                                + " ,\tMoney : " + this.getMoney() + Colors.RESET
                );
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public int getTotalDamage(){

        return getDamage() + getInventory().getSelectedWeaponObject().getDamage() ;

    }
    public int getDamage() {

        return damage  ;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        // health never be < 0
        if ( health < 0 ){
            health = 0 ;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }

}

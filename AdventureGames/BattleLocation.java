package AdventureGames;

import java.util.Random;

public abstract class BattleLocation extends Location {

    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLocation(Player player, String locationName , Obstacle obstacle , String award , int maxObstacle) {
        super(player, locationName);
        this.obstacle = obstacle ;
        this.award = award ;
        this.maxObstacle = maxObstacle ;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = randomObstacleNumber();
        System.out.println( getLocationName() + " map creating...Please wait...");
        System.out.println( Colors.BLUE + "\nYou have to be very careful because there are "+  obsNumber +"  "+ getObstacle().getName() + "  here" + Colors.RESET );
        System.out.print("Fight<F> or Escape<E> ? : ");
        String selectCase = dinle.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("F")){

            System.out.println( Colors.BLUE + " The War Has Begun Be Careful and Keep Calm!" + Colors.RESET );


                //if the combat method returned true : the battle was fought
                if ( combat( obsNumber ) ){
                    System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\tCongregulations! You won!");

                    //IF YOU DEFEAT ALL MONSTERS in that chapter SAVE the prize in that chapter to the inventory
                    if ( getLocationName() == "Cave"){

                        if (  getAward() != "0" ){// yani loot varsa

                                whatKindOfAward( getPlayer() , getAward() );

                        }else System.out.println("Bad Chance Man!!");

                    }else{
                        //IF YOU DEFEAT ALL MONSTERS in that chapter SAVE the prize in that chapter to the inventory
                        System.out.println( getAward() + " the award is recorded in the inventory...");
                        getPlayer().getInventory().addİtem( getAward() );
                    }

                    statusItem();
                    showLoot();
                    return true;
                }else{
                    System.out.println("\n\n\n\t\t\t\t\t\t\tunfortunately you lost!");
                    return false;
                }
        }

        if ( getPlayer().getHealth() <= 0 ){
            System.out.println(Colors.RED + "\n\n\n\t\t\t\t\t\t\t\t\t\tYou Died!" +Colors.RESET);
            return false;
        }


        if (selectCase.equals("E")){
            System.out.println("skedaddle....skedaddle....");
        }

        return true;
    }

    public boolean isWeapon( String award ){

        for (Weapon weapons : Weapon.weapons() ){
            if ( weapons.getWeaponName().equals( award ) ){
               return true;
            }
        }
        return false;
    }

    public boolean isArmor( String award ){

        for ( Armor armors : Armor.armors() ){
            if ( armors.getArmorName().equals( award ) ){
                return true;
            }
        }
        return false;
    }

    public void whatKindOfAward( Player player ,  String award ){

        //is weapon? isArmor?
        if ( isWeapon(award) || isArmor(award) ){
            for (Weapon weapons : Weapon.weapons() ){
                if ( weapons.getWeaponName().equals( award ) ){
                    //weapon
                    System.out.println( award + " loot add to box!!!!!!!!!!!!!!!");
                    getPlayer().getInventory().addLoot( award  );

                    replaceMyWeaponWithLootWeapon(player , weapons);

                }
            }

           for ( Armor armors : Armor.armors() ){
               if ( armors.getArmorName().equals( award ) ){

                   System.out.println( award + " loot add to box!!!!!!!!!!!!!!");
                   getPlayer().getInventory().addLoot( award  );

                   replaceMyArmorWithLootArmor( player, armors ) ;
               }
           }

        }else{

            System.out.println( award + "$  bonus , you won!!!!!!!!!!!!!!!");

            int bonus = Integer.parseInt( award );

            getPlayer().setMoney( getPlayer().getMoney() + bonus );

        }



    }


    public void replaceMyWeaponWithLootWeapon(Player player , Weapon weapons ){
        //If the player has a selected weapon and it is worse than the one looted, replace it

                if ( player.getInventory().getSelectedWeaponObject().getDamage() < weapons.getDamage()  ){
                    System.out.println("my weapon is being replaced with the newly won weapon");
                    player.getInventory().setSelectedWeaponObject( weapons );
                }


    }

    public void replaceMyArmorWithLootArmor(Player player , Armor armors ){
        //If the player has a selected armor and it is worse than the one looted, replace it

                if ( player.getInventory().getSelectedArmorObject().getBlock() < armors.getBlock()  ){
                    System.out.println("my armor is being replaced with a newly won armor");
                    player.getInventory().setSelectedArmorObject( armors );
                }


    }


    public void showLoot(){
        System.out.print("\nLoot : [ ");
        getPlayer().getInventory().getloot().forEach(str -> System.out.print(str+" "));
        System.out.print("]");
    }

    public void statusItem(){
        System.out.print("\nitems : [ ");
        for ( String str : getPlayer().getInventory().getItemBox() ) {
            System.out.print( str + " ");
        }
        System.out.print("]");
    }


    //how many monsters there are in the location, it should fight with that many monsters
    public boolean combat( int obsNumber ){

        // Who will start the game first?
        boolean statusKnigt = obstacleIsStart();

        for (int i=1; i<=obsNumber; i++ ){


            //we have to set the health value of each beast
            getObstacle().setHealth( getObstacle().getOrjinalHealth() );


            // status of player obstacles during battle
            playerStats();
            obstacleStats( i );

            //obstacle is start
            if(statusKnigt){
                System.out.println("\n\t\t"+ Design.starline );//101 star
                System.out.println( Design.shiftStep10+ "Obstacle is start...");

                // the battle continues until the player or monster dies
                while ( getPlayer().getHealth() > 0 && getObstacle().getHealth() > 0 ){
                    System.out.print("\n\t\t\tOOPS!"+"\t\t"+ Colors.CYAN + getObstacle().getName()+"-" + i + " attack\t\t----->" + Colors.RESET);
                    //When hitting an obstacle, player health decreases.
                    // however, if the player has armor, obstacle damage = obstacle damage - player armor
                    // If the result is positive, the obstacle has damaged the player, if it is negative, the obstacle has not been able to do it
                    int _damage_ = getObstacle().getDamage() - getPlayer().getInventory().getSelectedArmorObject().getBlock();

                    if ( _damage_ < 0 ){
                        _damage_ = 0 ;
                    }

                    getPlayer().setHealth( getPlayer().getHealth() - _damage_ );
                    afterHit(i);

                    //if the player is not dead
                    if ( getPlayer().getHealth() > 0 ){
                        //players turn
                        System.out.print("\n"+Design.shiftStep6+"Player move " + "\t\t----->");
                        System.out.print("\t\tShoot<S> or Escape<E> : ");
                        String selectChar = dinle.nextLine().toUpperCase();
                        if (selectChar.equals("S")){
                            System.out.print( Colors.CYAN + "\n"+Design.shiftStep6+"Player attack"+"\t\t----->");
                            // if the player hits, the obstacle health is reduced by the player's hit power
                            getObstacle().setHealth( getObstacle().getHealth() - getPlayer().getTotalDamage() );
                            afterHit(i);
                        }else if ( selectChar.equals("E") ){
                            return false;//if return false : escape
                        }

                        System.out.println("" + Colors.RESET);
                        System.out.println("\t\t" + Design.starline );
                    } else { //player health <= 0  --> player died

                        System.out.println("\n"+ Design.shiftStep6 + "" + i + ". "+ getPlayer().getPlayerName()
                                + "   " + getPlayer().getCharacterName()
                                + "  killed by  " + getObstacle().getName() + " !");
                        System.out.println("\n" + Design.shiftStep6 + " " + getObstacle().getName()+"   "+getPlayer().getPlayerName()+" confiscated all player money");
                        System.out.print("\t\t" + Design.starline );
                        getPlayer().setMoney( 0 );

                    }



                }

            }


            //player is start
            if(!statusKnigt){

                System.out.println("\n\t\t"+ Design.starline );//101 star
                System.out.println( Design.shiftStep10+ "Player is start...");

                // the battle continues until the player or monster dies
                while ( getPlayer().getHealth() > 0 && getObstacle().getHealth() > 0 ){
                    System.out.print("\n"+Design.shiftStep6+"Player move " + "\t\t----->");
                    System.out.print("\t\tShoot<S> or Escape<E> :");
                    String selectChar = dinle.nextLine().toUpperCase();
                    if ( selectChar.equals("S") ){
                        System.out.println("");
                        System.out.print( Colors.CYAN + "\n"+Design.shiftStep6+"Player attack"+"\t\t----->");
                        // if the player hits, the obstacle health is reduced by the player's hit power
                        getObstacle().setHealth( getObstacle().getHealth() - getPlayer().getTotalDamage() );
                        afterHit(i);
                        System.out.println(Colors.RESET);
                        //if the obstacle not died : obstacles turn
                        if ( getObstacle().getHealth() > 0 ){

                            System.out.print("\n\t\t\t\t\t\t"+getObstacle().getName()+"-" + i + " attack"+"\t\t----->");

                            //When hitting an obstacle, player health decreases.
                            // however, if the player has armor, obstacle damage = obstacle damage - player armor
                            // If the result is positive, the obstacle has damaged the player, if it is negative, the obstacle has not been able to do it
                            int _damage_ = getObstacle().getDamage() - getPlayer().getInventory().getSelectedArmorObject().getBlock();

                            if ( _damage_ < 0 ){
                                _damage_ = 0 ;
                            }

                            getPlayer().setHealth( getPlayer().getHealth() - _damage_ );
                            afterHit(i);
                            System.out.println("" + Colors.RESET);
                            System.out.println("\t\t" + Design.starline );
                        }
                        else{//obstacle health <= 0  --> obstacle died
                            System.out.println("\n\t\t\t\t\t\t"+ getObstacle().getName()+"-"+i
                                    + "   " + getPlayer().getCharacterName()
                                    + "  killed by " + getPlayer().getPlayerName()  + "!" );
                            System.out.println("\n\t\t\t\t\t\t "+getObstacle().getMoney()+" won bonus!");
                            System.out.print("\t\t" + Design.starline );
                            getPlayer().setMoney( getPlayer().getMoney() + getObstacle().getMoney() );


                        }
                    }else if ( selectChar.equals("K") ){
                        return false;//if return fale : escape
                    }
                }


            }

            }



            if ( getPlayer().getHealth() <= 0) {
                return false; // player died
            }



        return true;
    }

    public boolean obstacleIsStart(){

        int obstacleChance =  (int) (Math.random() * 10 ) + 1  ; //probability of the obstacle starting the game
        int playerChance = (int) (Math.random() * 10 ) + 1  ;   // probability of the player starting the game

        if ( obstacleChance <= playerChance ){
            System.out.println("\nthe player starts the game");
            return false;
        }

        System.out.println("\nthe obstacle starts the game");
        return true;
    }

    // // check states after hit
    public void afterHit(int i){
        System.out.print("\t\t\tPlayer health : " + getPlayer().getHealth() + "\t\t\t"+ i + ". " +getObstacle().getName()+" health : " + getObstacle().getHealth() + "\n" );
    }


    //// always check player states before battle
     public void playerStats(){
         System.out.println("");
        System.out.println(Colors.YELLOW_BRIGHT + "Player values: " + Colors.RESET );
        System.out.println("--------------------");
        System.out.println(Colors.YELLOW_BRIGHT + "Health : " + getPlayer().getHealth() );
        System.out.println("Weapon : " + getPlayer().getInventory().getSelectedWeaponObject().getWeaponName() );
        System.out.println("Armor  : " + getPlayer().getInventory().getSelectedArmorObject().getArmorName() );
        System.out.println("Block : " + getPlayer().getInventory().getSelectedArmorObject().getBlock() );
        System.out.println("Damage  : " + getPlayer().getTotalDamage() );
        System.out.println("Money : " + getPlayer().getMoney() + Colors.RESET );
         System.out.println("");

    }


    //// always check obstacle states before battle
    public void obstacleStats( int i ){
        System.out.println("");
        System.out.println(Colors.YELLOW_BRIGHT + i + "." + getObstacle().getName() + " values : " + Colors.RESET );
        System.out.println("--------------------");
        System.out.println(Colors.YELLOW_BRIGHT + "Health: " + getObstacle().getHealth() );
        System.out.println("Damage  : " + getObstacle().getDamage() );
        System.out.println("Award : " + getObstacle().getMoney() + Colors.RESET );
        System.out.println("");

    }

    //generate a random number of monsters
    public int randomObstacleNumber(){
        Random r = new Random();
        return  r.nextInt( getMaxObstacle() ) + 1 ;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}

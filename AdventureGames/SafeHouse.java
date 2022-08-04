package AdventureGames;

public class SafeHouse extends normalLocation {

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation(){

        if ( isFinish() ){
            System.out.println("\n\n\t\t\t\t\tCongratulations you have successfully completed all chapters!");
            return false;//game over
        }


        System.out.println("Safe House!");
        System.out.println("health is renewed!");
        getPlayer().setHealth( getPlayer().getOrjinalHealth() );//health value update


        return true;
    }

    public boolean isFinish(){

        for ( String str : getPlayer().getInventory().getItemBox() ) {
            // if objects isn't in here
            if ( str.length() == 0 ){
               return false;
            }

        }

        System.out.println("itembox full"); //oyun bitmeli
        return true;
    }

}

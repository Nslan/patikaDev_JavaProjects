package AdventureGames;

public abstract class normalLocation extends Location {

    public normalLocation(Player player , String locationName){
        super(player,locationName);
    }

    @Override
    public boolean onLocation(){
        return true;
    }

}

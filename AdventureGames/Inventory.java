package AdventureGames;

import java.util.ArrayList;

public class Inventory {

    private Weapon selectedWeaponObject;

    private Armor selectedArmorObject;

    private static String[] itemBox = new String[]{"", "", "" };

    private static ArrayList<String> loot = new ArrayList<String>();


    public Inventory() {
        // The inventory initially has a default weapon value
        this.selectedWeaponObject = new Weapon( "Fist" ,-1 , 0 , 0 );
        // The inventory initially has a default armor value
        this.selectedArmorObject = new Armor("Rag" , -1 , 0 , 0 );

    }



    public void addLoot(String newLoot){

        if( isThereLoot( newLoot ) ){

            loot.add( newLoot );

        }


    }

    public static boolean isThereLoot( String newItems ){

        for (int i = 0; i < loot.size() ; i++) {
            if ( loot.get(i).equals(newItems) ){
                return false;
            }
        }

        return true;
    }


    public ArrayList<String> getloot() {
        return loot;
    }

    public void setloot(ArrayList<String> loot) {
        Inventory.loot = loot;
    }

    public void addİtem(String newItem){

        if ( isThere(newItem) ){

            for (int i=0; i < this.itemBox.length; i++ ){

                if ( this.itemBox[i].length() == 0 ){
                    this.itemBox[i] = newItem;
                    System.out.println(newItem + " items add to your inventory");
                    break;
                }

            }

        }

    }

    //Has that object been taken before?
    public static boolean isThere(String newItem){

        for (String str: itemBox ) {
            if ( str.equals(newItem) ){
                return false;
            }
        }

        return true;//if hasnt object : return true
    }

    public String[] getItemBox() {
        return itemBox;
    }

    public void setItemBox(String[] itemBox) {
        this.itemBox = itemBox;
    }

    public Weapon getSelectedWeaponObject() {
        return selectedWeaponObject;
    }

    // takes the weapon object and uploads it to my inventory
    public void setSelectedWeaponObject(Weapon selectedWeaponObject) {
        this.selectedWeaponObject = selectedWeaponObject;
    }

    public Armor getSelectedArmorObject() {
        return selectedArmorObject;
    }

    // takes the armor object and uploads it to my inventory
    public void setSelectedArmorObject(Armor selectedArmorObject) {
        this.selectedArmorObject = selectedArmorObject;
    }


}
